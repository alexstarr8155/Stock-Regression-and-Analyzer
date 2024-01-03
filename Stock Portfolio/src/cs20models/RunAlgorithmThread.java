/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs20models;

import javax.swing.JLabel;
import cs20viewcontroller.DrawnView;

/**
 *
 * @author student
 */
public class RunAlgorithmThread extends DrawnView implements Runnable{
    
    private JLabel j;
    private JLabel updateLabel;
    
    public RunAlgorithmThread(JLabel j, JLabel update){
        this.j = j;
        this.updateLabel = update;
    }
            
            //moneyMade.setText("$" + MonitorStock.moneyMade);
    
    @Override
    public void run() {
        while (true) {
            if (!MonitorStock.running){
                return;
            }
            MonitorStock.runAlgorithm(this.j, this.updateLabel);
        }
    }
    
}
