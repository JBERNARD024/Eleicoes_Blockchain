//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 
//::                                                                         ::
//::     Antonio Manuel Rodrigues Manso                                      ::
//::                                                                         ::
//::     I N S T I T U T O    P O L I T E C N I C O   D E   T O M A R        ::
//::     Escola Superior de Tecnologia de Tomar                              ::
//::     e-mail: manso@ipt.pt                                                ::
//::     url   : http://orion.ipt.pt/~manso                                  ::
//::                                                                         ::
//::     This software was build with the purpose of investigate and         ::
//::     learning.                                                           ::
//::                                                                         ::
//::                                                               (c)2022   ::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//////////////////////////////////////////////////////////////////////////////
package eleicao.blockchain;

import java.util.concurrent.atomic.AtomicInteger;

public class Miner extends Thread{

    String data;
    String zeros;
    int difficulty;
    int MAX_NONCE = (int) 1E9;
    AtomicInteger ticket = new AtomicInteger(0);
    public AtomicInteger nonce;

    public Miner(String data, int difficulty, AtomicInteger nonce) {
        this.data = data;
        this.difficulty = difficulty;
        this.nonce = nonce;
        this.zeros = String.format("%0" + difficulty + "d", 0);
    }

    public void run() {
        while (true) {
            int temp = ticket.getAndIncrement();
            if (temp >= MAX_NONCE) {
                return;
            }
            String hash = Hash.getHash(temp + data);
            if (hash.endsWith(zeros)) {
                nonce.set(temp);
                ticket.set(MAX_NONCE);
                return;
            }
        }
    }

    public int getNonce() {
        int numCores = Runtime.getRuntime().availableProcessors();
        Miner[] threads = new Miner[numCores];

        for (int i = 0; i < numCores; i++) {
            threads[i] = new Miner(data, difficulty, nonce);
            threads[i].start();
        }

        for (Miner thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return nonce.get();
    }
}
