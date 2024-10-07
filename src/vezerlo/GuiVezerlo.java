
package vezerlo;

import modell.JatekModell;
import nezet.GuiNezet;


public class GuiVezerlo {
    private JatekModell modell;
    private GuiNezet nezet;
    
    
    public GuiVezerlo(JatekModell modell, GuiNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        guiBeallitas();
       // nezet.setVisible(true);
        start();
        valasztas();
    }
    
    private void start() {
        nezet.megjelenit(modell.kezdes());
        
    }

    private void valasztas() {
        int v;
        if ((v = nezet.bekeres()) == -1) {
            modell.setValasztas(v);
            nezet.felugro("Nincs láda kiválasztva");
        }else{
            modell.setValasztas(v);
            nezet.felugro(modell.ellenorzes());
        }
        
        
        modell.setValasztas(nezet.bekeres());
        nezet.megjelenit(modell.ellenorzes());    
    }
    
    
    private void guiBeallitas() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiNezet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiNezet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiNezet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiNezet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nezet.setVisible(true);
            }
        });
    }

    
}
