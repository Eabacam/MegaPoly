
package interfazgraficaII;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class VentanaInicio extends javax.swing.JFrame {

   
    public VentanaInicio() {
        super("MegaCiudades");
        initComponents();
        
        configuraImagen();
        
        lTituloMegaCiudades.setOpaque(true);
        lTituloMegaCiudades.setBackground(Color.BLUE);
        lTituloMegaCiudades.setForeground(Color.WHITE);
        
    }

  
    public void configuraImagen () {
        lImagen.setOpaque(true);
        ImageIcon imagen = new ImageIcon("/imagenes/MegaCiudades.jpg");
        //lImagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(lImagen.getWidth(), lImagen.getHeight(), Image.SCALE_DEFAULT)));
        lImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/MegaCiudades.jpg")));

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lTituloMegaCiudades = new javax.swing.JLabel();
        lImagen = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mItemNuevaPartida = new javax.swing.JMenuItem();
        mItemCargarPartida = new javax.swing.JMenuItem();
        mItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(5);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lTituloMegaCiudades.setBackground(new java.awt.Color(51, 153, 255));
        lTituloMegaCiudades.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lTituloMegaCiudades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTituloMegaCiudades.setText("MegaCiudades ");
        lTituloMegaCiudades.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lImagen.setBackground(new java.awt.Color(255, 255, 255));
        lImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MegaCiudades.jpg"))); // NOI18N
        lImagen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lImagen.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lImagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lTituloMegaCiudades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lTituloMegaCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 738, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Opciones de menú");

        mItemNuevaPartida.setText("Nueva partida");
        mItemNuevaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemNuevaPartidaActionPerformed(evt);
            }
        });
        jMenu1.add(mItemNuevaPartida);

        mItemCargarPartida.setText("Cargar partida");
        mItemCargarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemCargarPartidaActionPerformed(evt);
            }
        });
        jMenu1.add(mItemCargarPartida);

        mItemSalir.setText("Salir");
        mItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mItemSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItemCargarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemCargarPartidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mItemCargarPartidaActionPerformed

    private void mItemNuevaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemNuevaPartidaActionPerformed
        InterfazGrafica nuevaPartida = new InterfazGrafica();
        nuevaPartida.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mItemNuevaPartidaActionPerformed

    private void mItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mItemSalirActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lImagen;
    private javax.swing.JLabel lTituloMegaCiudades;
    private javax.swing.JMenuItem mItemCargarPartida;
    private javax.swing.JMenuItem mItemNuevaPartida;
    private javax.swing.JMenuItem mItemSalir;
    // End of variables declaration//GEN-END:variables
}
