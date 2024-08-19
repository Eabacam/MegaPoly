package interfazgraficaII;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InterfazGrafica extends javax.swing.JFrame {

    String nombreJugador1;
    String nombreJugador2;
    int turno = 1;
    int numVueltasJug1 = 0;
    int numVueltasJug2 = 0;
    boolean carcel_1;
    boolean carcel_2;
    int boteAcumulado = 0;
    Color colorJugador1 = new Color(0, 200, 0);
    Color colorJugador2 = new Color(0, 0, 200);
    int fichaJugador1;
    int fichaJugador2;
    int creditoJug1 = 200;
    int creditoJug2 = 200;
    boolean disponibilidadCasilla1 = true;
    boolean disponibilidadCasilla2 = true;
    boolean disponibilidadCasilla3 = true;
    boolean disponibilidadCasilla4 = true;
    boolean disponibilidadCasilla5 = true;
    boolean disponibilidadCasilla6 = true;
    //boolean disponibilidadCasilla7 = true; --> CARCEL
    boolean disponibilidadCasilla8 = true;
    boolean disponibilidadCasilla9 = true;
    boolean disponibilidadCasilla10 = true;
    boolean disponibilidadCasilla11 = true;
    boolean disponibilidadCasilla12 = true;
    boolean disponibilidadCasilla13 = true;
    //boolean disponibilidadCasilla14 = true; --> BANCO
    boolean disponibilidadCasilla15 = true;
    boolean disponibilidadCasilla16 = true;
    boolean disponibilidadCasilla17 = true;
    boolean disponibilidadCasilla18 = true;
    boolean disponibilidadCasilla19 = true;
    boolean disponibilidadCasilla20 = true;
    //boolean disponibilidadCasilla21 = true; --> A CARCEL
    boolean disponibilidadCasilla22 = true;
    boolean disponibilidadCasilla23 = true;
    boolean disponibilidadCasilla24 = true;
    boolean disponibilidadCasilla25 = true;
    boolean disponibilidadCasilla26 = true;
    boolean disponibilidadCasilla27 = true;
    boolean pagadaCasilla1 = false;
    boolean pagadaCasilla2 = false;
    boolean pagadaCasilla3 = false;
    boolean pagadaCasilla4 = false;
    boolean pagadaCasilla5 = false;
    boolean pagadaCasilla6 = false;
    //boolean pagadaCasilla7 = false; -->CARCEL
    boolean pagadaCasilla8 = false;
    boolean pagadaCasilla9 = false;
    boolean pagadaCasilla10 = false;
    boolean pagadaCasilla11 = false;
    boolean pagadaCasilla12 = false;
    boolean pagadaCasilla13 = false;
    //boolean pagadaCasilla14 = false; --> banco
    boolean pagadaCasilla15 = false;
    boolean pagadaCasilla16 = false;
    boolean pagadaCasilla17 = false;
    boolean pagadaCasilla18 = false;
    boolean pagadaCasilla19 = false;
    boolean pagadaCasilla20 = false;
    //boolean pagadaCasilla21 = false; --> A CARCEL
    boolean pagadaCasilla22 = false;
    boolean pagadaCasilla23 = false;
    boolean pagadaCasilla24 = false;
    boolean pagadaCasilla25 = false;
    boolean pagadaCasilla26 = false;
    boolean pagadaCasilla27 = false;
    boolean compradaCasilla1 = false;
    boolean compradaCasilla2 = false;
    boolean compradaCasilla3 = false;
    boolean compradaCasilla4 = false;
    boolean compradaCasilla5 = false;
    boolean compradaCasilla6 = false;
    //boolean compradaCasilla7 = false; --> CARCEL
    boolean compradaCasilla8 = false;
    boolean compradaCasilla9 = false;
    boolean compradaCasilla10 = false;
    boolean compradaCasilla11 = false;
    boolean compradaCasilla12 = false;
    boolean compradaCasilla13 = false;
    //boolean compradaCasilla14 = false; --> BANCO
    boolean compradaCasilla15 = false;
    boolean compradaCasilla16 = false;
    boolean compradaCasilla17 = false;
    boolean compradaCasilla18 = false;
    boolean compradaCasilla19 = false;
    boolean compradaCasilla20 = false;
    //boolean compradaCasilla21 = false; --> A CARCEL
    boolean compradaCasilla22 = false;
    boolean compradaCasilla23 = false;
    boolean compradaCasilla24 = false;
    boolean compradaCasilla25 = false;
    boolean compradaCasilla26 = false;
    boolean compradaCasilla27 = false;
    boolean compradaCasilla1Jugador1 = false;
    boolean compradaCasilla1Jugador2 = false;
    boolean compradaCasilla2Jugador1 = false;
    boolean compradaCasilla2Jugador2 = false;
    boolean compradaCasilla3Jugador1 = false;
    boolean compradaCasilla3Jugador2 = false;
    boolean compradaCasilla4Jugador1 = false;
    boolean compradaCasilla4Jugador2 = false;
    boolean compradaCasilla5Jugador2 = false;
    boolean compradaCasilla5Jugador1 = false;
    boolean compradaCasilla6Jugador2 = false;
    boolean compradaCasilla6Jugador1 = false;
    //boolean compradaCasilla7Jugador2 = false; -->CARCEL
    //boolean compradaCasilla7Jugador1 = false; -->CARCEL
    boolean compradaCasilla8Jugador2 = false;
    boolean compradaCasilla8Jugador1 = false;
    boolean compradaCasilla9Jugador2 = false;
    boolean compradaCasilla9Jugador1 = false;
    boolean compradaCasilla10Jugador2 = false;
    boolean compradaCasilla10Jugador1 = false;
    boolean compradaCasilla11Jugador2 = false;
    boolean compradaCasilla11Jugador1 = false;
    boolean compradaCasilla12Jugador2 = false;
    boolean compradaCasilla12Jugador1 = false;
    boolean compradaCasilla13Jugador2 = false;
    boolean compradaCasilla13Jugador1 = false;
    //boolean compradaCasilla14Jugador2 = false; -->BANCO
    //boolean compradaCasilla14Jugador1 = false; -->BANCO
    boolean compradaCasilla15Jugador2 = false;
    boolean compradaCasilla15Jugador1 = false;
    boolean compradaCasilla16Jugador2 = false;
    boolean compradaCasilla16Jugador1 = false;
    boolean compradaCasilla17Jugador2 = false;
    boolean compradaCasilla17Jugador1 = false;
    boolean compradaCasilla18Jugador2 = false;
    boolean compradaCasilla18Jugador1 = false;
    boolean compradaCasilla19Jugador2 = false;
    boolean compradaCasilla19Jugador1 = false;
    boolean compradaCasilla20Jugador2 = false;
    boolean compradaCasilla20Jugador1 = false;
    //boolean compradaCasilla21Jugador2 = false; --> A CARCEL
    //boolean compradaCasilla21Jugador1 = false; --> A CARCEL
    boolean compradaCasilla22Jugador2 = false;
    boolean compradaCasilla22Jugador1 = false;
    boolean compradaCasilla23Jugador2 = false;
    boolean compradaCasilla23Jugador1 = false;
    boolean compradaCasilla24Jugador2 = false;
    boolean compradaCasilla24Jugador1 = false;
    boolean compradaCasilla25Jugador2 = false;
    boolean compradaCasilla25Jugador1 = false;
    boolean compradaCasilla26Jugador2 = false;
    boolean compradaCasilla26Jugador1 = false;
    boolean compradaCasilla27Jugador2 = false;
    boolean compradaCasilla27Jugador1 = false;
    int compraAfirmativaCasilla1 = 1;
    int compraAfirmativaCasilla2 = 1;
    int compraAfirmativaCasilla3 = 1;
    int compraAfirmativaCasilla4 = 1;
    int compraAfirmativaCasilla5 = 1;
    int compraAfirmativaCasilla6 = 1;
    //int compraAfirmativaCasilla7 = 1; --> CARCEL
    int compraAfirmativaCasilla8 = 1;
    int compraAfirmativaCasilla9 = 1;
    int compraAfirmativaCasilla10 = 1;
    int compraAfirmativaCasilla11 = 1;
    int compraAfirmativaCasilla12 = 1;
    int compraAfirmativaCasilla13 = 1;
    //int compraAfirmativaCasilla14 = 1; --> BANCO
    int compraAfirmativaCasilla15 = 1;
    int compraAfirmativaCasilla16 = 1;
    int compraAfirmativaCasilla17 = 1;
    int compraAfirmativaCasilla18 = 1;
    int compraAfirmativaCasilla19 = 1;
    int compraAfirmativaCasilla20 = 1;
    //int compraAfirmativaCasilla21 = 1; --> A CARCEL
    int compraAfirmativaCasilla22 = 1;
    int compraAfirmativaCasilla23 = 1;
    int compraAfirmativaCasilla24 = 1;
    int compraAfirmativaCasilla25 = 1;
    int compraAfirmativaCasilla26 = 1;
    int compraAfirmativaCasilla27 = 1;
    int numDado = 0;

    public InterfazGrafica() {
        super("MegaCiudades");
        initComponents();

        objetos();

    }

    private void objetos() {

        //SE PIDE NOMBRE DE JUGADORES Y SE CONFIGURA EL CRÉDITO DISPONIBLE.
        nombreJugador1 = JOptionPane.showInputDialog("Escribe el nombre del jugador 1:");
        lNomJugador1.setText(nombreJugador1);
        lJugador1.setOpaque(true);
        lJugador1.setBackground(Color.GREEN);
        nombreJugador2 = JOptionPane.showInputDialog("Escribe el nombre del jugador 2:");
        lNomJugador2.setText(nombreJugador2);
        lJugador2.setOpaque(true);
        lJugador2.setBackground(Color.BLUE);
        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
        reserteaCasillas();
        labelCasilla0.setOpaque(true);
        labelCasilla0.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
        lNumVueltasJug2.setText(String.valueOf(numVueltasJug2));
        lNumVueltasJug1.setText(String.valueOf(numVueltasJug1));
        lBoteAcumulado.setText(String.valueOf(boteAcumulado));

    }

    //BORRA ICONOS Y PINTA CASILLAS DE COLOR BLANCO.
    public void reserteaCasillas() {

        labelCasilla0.setOpaque(true);
        labelCasilla1.setOpaque(true);
        labelCasilla2.setOpaque(true);
        labelCasilla3.setOpaque(true);
        labelCasilla4.setOpaque(true);
        labelCasilla5.setOpaque(true);
        labelCasilla6.setOpaque(true);
        labelCasilla7.setOpaque(true);
        labelCasilla8.setOpaque(true);
        labelCasilla9.setOpaque(true);
        labelCasilla10.setOpaque(true);
        labelCasilla11.setOpaque(true);
        labelCasilla12.setOpaque(true);
        labelCasilla13.setOpaque(true);
        labelCasilla14.setOpaque(true);
        labelCasilla15.setOpaque(true);
        labelCasilla16.setOpaque(true);
        labelCasilla17.setOpaque(true);
        labelCasilla18.setOpaque(true);
        labelCasilla19.setOpaque(true);
        labelCasilla20.setOpaque(true);
        labelCasilla21.setOpaque(true);
        labelCasilla22.setOpaque(true);
        labelCasilla23.setOpaque(true);
        labelCasilla24.setOpaque(true);
        labelCasilla25.setOpaque(true);
        labelCasilla26.setOpaque(true);
        labelCasilla27.setOpaque(true);
        lTarjetaSuerte.setOpaque(true);


        labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla0.setBackground(Color.WHITE);
        labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla1.setBackground(Color.WHITE);
        labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla2.setBackground(Color.WHITE);
        labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla3.setBackground(Color.WHITE);
        labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla4.setBackground(Color.WHITE);
        labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla5.setBackground(Color.WHITE);
        labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla6.setBackground(Color.WHITE);
        labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla7.setBackground(Color.WHITE);
        labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla8.setBackground(Color.WHITE);
        labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla9.setBackground(Color.WHITE);
        labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla10.setBackground(Color.WHITE);
        labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla11.setBackground(Color.WHITE);
        labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla12.setBackground(Color.WHITE);
        labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla13.setBackground(Color.WHITE);
        labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla14.setBackground(Color.WHITE);
        labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla15.setBackground(Color.WHITE);
        labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla16.setBackground(Color.WHITE);
        labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla17.setBackground(Color.WHITE);
        labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla18.setBackground(Color.WHITE);
        labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla19.setBackground(Color.WHITE);
        labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla20.setBackground(Color.WHITE);
        labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla21.setBackground(Color.WHITE);
        labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla22.setBackground(Color.WHITE);
        labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla23.setBackground(Color.WHITE);
        labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla24.setBackground(Color.WHITE);
        labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla25.setBackground(Color.WHITE);
        labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla26.setBackground(Color.WHITE);
        labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));
        labelCasilla27.setBackground(Color.WHITE);

    }

    public void funcionalidadFichaJugador2() {

        switch (fichaJugador2) {
            case 0:
                //pintarFichaFueraTurnoJugador1();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));
                
                lTarjetaSuerte.setBackground(colorJugador2);
                lTarjetaSuerte.setForeground(Color.WHITE);
                
                if(fichaJugador2 == 0){
                    
                    switch (numDado) {
                        case 1:
                            JOptionPane.showConfirmDialog(rootPane, "Que suerte, por epoca estival alta en una de tus ciudades, "
                                    + "el turismo deja una caja de 50 MegaMonedas!", "Suerte", JOptionPane.DEFAULT_OPTION);
                            creditoJug1 = creditoJug1 + 50;
                            lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                            break;
                        case 2:
                            JOptionPane.showConfirmDialog(rootPane, "Que mala suerte, los disturbios en una de tus ciudades, "
                                    + "resta en la caja 30 MegaMonedas!", "Mala suerte.", JOptionPane.DEFAULT_OPTION);  
                            creditoJug1 = creditoJug1 - 30;
                            lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                            break;
                        case 3:
                            JOptionPane.showConfirmDialog(rootPane, "Que suerte, un concierto de un famoso en una de tus ciudades, "
                                    + "deja una caja de 50 MegaMonedas!", "Suerte", JOptionPane.DEFAULT_OPTION); 
                            creditoJug1 = creditoJug1 + 50;
                            lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                            break;
                        case 4:
                            JOptionPane.showConfirmDialog(rootPane, "Que mala suerte, los bandidos en una de tus ciudades, "
                                    + "hace que caiga el turismo y resta en la caja 30 MegaMonedas.", "Mala suerte", JOptionPane.DEFAULT_OPTION);
                            creditoJug1 = creditoJug1 - 30;
                            lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                            break;
                        case 5:
                            JOptionPane.showConfirmDialog(rootPane, "Que suerte, las obras en una de tus ciudades, "
                                    + "hace que aumente el turismo y deja una caja de 50 MegaMonedas!", "Suerte", JOptionPane.DEFAULT_OPTION);
                            creditoJug1 = creditoJug1 + 50;
                            lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                            break;
                        case 6:                          
                            JOptionPane.showConfirmDialog(rootPane, "Que mala suerte, un mal temporal en una de tus ciudades, "
                                    + "hace que hace que tengas que emplear de la caja 30 MegaMonedas.", "Mala suerte", JOptionPane.DEFAULT_OPTION);
                            creditoJug1 = creditoJug1 - 30;
                            lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                            break;
                        default:
                            throw new AssertionError();
                    }
                }

                break;
            case 1:
                //pintarFichaFueraTurnoJugador1();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla1 == true) {
                    disponibilidadCasilla1 = false;

                    if (compradaCasilla1Jugador2 == true) {
                        labelCasilla1.setBackground(colorJugador2);
                        labelCasilla1.setForeground(Color.WHITE);
                    } else {
                        labelCasilla1.setBackground(colorJugador1);
                        labelCasilla1.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla1 == true) {
                    compraAfirmativaCasilla1 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla1 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla1 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla1 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }

                    if (compraAfirmativaCasilla1 == 0 && creditoJug2 >= 30) {
                        labelCasilla1.setBackground(colorJugador2);
                        labelCasilla1.setForeground(Color.WHITE);
                        compradaCasilla1 = true;
                        compradaCasilla1Jugador2 = true;
                    }
                    if (compradaCasilla1 == true && pagadaCasilla1 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla1 = true;
                    }
                }
                break;
            case 2:
                //pintarFichaFueraTurnoJugador1();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla2 == true) {
                    disponibilidadCasilla2 = false;

                    if (compradaCasilla2Jugador2 == true) {
                        labelCasilla2.setBackground(colorJugador2);
                        labelCasilla2.setForeground(Color.WHITE);
                    } else {
                        labelCasilla2.setBackground(colorJugador1);
                        labelCasilla2.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla2 == true) {
                    compraAfirmativaCasilla2 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla2 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla2 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla2 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }

                    if (compraAfirmativaCasilla2 == 0 && creditoJug2 >= 30) {
                        labelCasilla2.setBackground(colorJugador2);
                        labelCasilla2.setForeground(Color.WHITE);
                        compradaCasilla2 = true;
                        compradaCasilla2Jugador2 = true;
                    }
                    if (compradaCasilla2 == true && pagadaCasilla2 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla2 = true;
                    }
                }

                break;
            case 3:
                //pintarFichaFueraTurnoJugador1();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla3 == true) {
                    disponibilidadCasilla3 = false;

                    if (compradaCasilla3Jugador2 == true) {
                        labelCasilla3.setBackground(colorJugador2);
                        labelCasilla3.setForeground(Color.WHITE);
                    } else {
                        labelCasilla3.setBackground(colorJugador1);
                        labelCasilla3.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla3 == true) {
                    compraAfirmativaCasilla3 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla3 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla3 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla3 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }

                    if (compraAfirmativaCasilla3 == 0 && creditoJug2 >= 30) {
                        labelCasilla3.setBackground(colorJugador2);
                        labelCasilla3.setForeground(Color.WHITE);
                        compradaCasilla3 = true;
                        compradaCasilla3Jugador2 = true;
                    }
                    if (compradaCasilla3 == true && pagadaCasilla3 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla3 = true;
                    }
                }

                break;
            case 4:
                //pintarFichaFueraTurnoJugador1();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla4 == true) {
                    disponibilidadCasilla4 = false;

                    if (compradaCasilla4Jugador2 == true) {
                        labelCasilla4.setBackground(colorJugador2);
                        labelCasilla4.setForeground(Color.WHITE);
                    } else {
                        labelCasilla4.setBackground(colorJugador1);
                        labelCasilla4.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                

                if (disponibilidadCasilla4 == true) {
                    compraAfirmativaCasilla4 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla4 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla4 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla4 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }

                    if (compraAfirmativaCasilla4 == 0 && creditoJug2 >= 30) {
                        labelCasilla4.setBackground(colorJugador2);
                        labelCasilla4.setForeground(Color.WHITE);
                        compradaCasilla4 = true;
                        compradaCasilla4Jugador2 = true;
                    }
                    if (compradaCasilla4 == true && pagadaCasilla4 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla4 = true;
                    }
                }
                break;
            case 5:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla5 == true) {
                    disponibilidadCasilla5 = false;

                    if (compradaCasilla5Jugador2 == true) {
                        labelCasilla5.setBackground(colorJugador2);
                        labelCasilla5.setForeground(Color.WHITE);
                    } else {
                        labelCasilla5.setBackground(colorJugador1);
                        labelCasilla5.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla5 == true) {
                    compraAfirmativaCasilla5 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla5 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla5 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla5 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla5 == 0 && creditoJug2 >= 30) {
                        labelCasilla5.setBackground(colorJugador2);
                        labelCasilla5.setForeground(Color.WHITE);
                        compradaCasilla5 = true;
                        compradaCasilla5Jugador2 = true;
                    }
                    if (compradaCasilla5 == true && pagadaCasilla5 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla5 = true;
                    }
                }

                break;
            case 6:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla6 == true) {
                    disponibilidadCasilla6 = false;

                    if (compradaCasilla6Jugador2 == true) {
                        labelCasilla6.setBackground(colorJugador2);
                        labelCasilla6.setForeground(Color.WHITE);
                    } else {
                        labelCasilla6.setBackground(colorJugador1);
                        labelCasilla6.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla6 == true) {
                    compraAfirmativaCasilla6 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla6 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla6 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla6 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla6 == 0 && creditoJug2 >= 30) {
                        labelCasilla6.setBackground(colorJugador2);
                        labelCasilla6.setForeground(Color.WHITE);
                        compradaCasilla6 = true;
                        compradaCasilla6Jugador2 = true;
                    }
                    if (compradaCasilla6 == true && pagadaCasilla6 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla6 = true;
                    }
                }

                break;
            case 7:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                JOptionPane.showConfirmDialog(
                        rootPane, "Por suerte solo has caido en la carcel de visita. Podrás seguir jugando en el siguiente turno pero .",
                        "Visita la carcel", JOptionPane.DEFAULT_OPTION);

                if (fichaJugador2 == 7) {
                    creditoJug2 = creditoJug2 - 10;
                    lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    boteAcumulado = boteAcumulado + 10;
                    lBoteAcumulado.setText(String.valueOf(boteAcumulado));
                }

                break;
            case 8:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla8 == true) {
                    disponibilidadCasilla8 = false;

                    if (compradaCasilla8Jugador2 == true) {
                        labelCasilla8.setBackground(colorJugador2);
                        labelCasilla8.setForeground(Color.WHITE);
                    } else {
                        labelCasilla8.setBackground(colorJugador1);
                        labelCasilla8.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla8 == true) {
                    compraAfirmativaCasilla8 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla8 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla8 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla8 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    
                    if (compraAfirmativaCasilla8 == 0 && creditoJug2 >= 30) {
                        labelCasilla8.setBackground(colorJugador2);
                        labelCasilla8.setForeground(Color.WHITE);
                        compradaCasilla8 = true;
                        compradaCasilla8Jugador2 = true;
                    }
                    if (compradaCasilla8 == true && pagadaCasilla8 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla8 = true;
                    }
                }

                break;
            case 9:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla9 == true) {
                    disponibilidadCasilla9 = false;

                    if (compradaCasilla9Jugador2 == true) {
                        labelCasilla9.setBackground(colorJugador2);
                        labelCasilla9.setForeground(Color.WHITE);
                    } else {
                        labelCasilla9.setBackground(colorJugador1);
                        labelCasilla9.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla9 == true) {
                    compraAfirmativaCasilla9 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla9 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla9 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla9 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla9 == 0 && creditoJug2 >= 30) {
                        labelCasilla9.setBackground(colorJugador2);
                        labelCasilla9.setForeground(Color.WHITE);
                        compradaCasilla9 = true;
                        compradaCasilla9Jugador2 = true;
                    }
                    if (compradaCasilla9 == true && pagadaCasilla9 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla9 = true;
                    }
                }

                break;
            case 10:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla10 == true) {
                    disponibilidadCasilla10 = false;

                    if (compradaCasilla10Jugador2 == true) {
                        labelCasilla10.setBackground(colorJugador2);
                        labelCasilla10.setForeground(Color.WHITE);
                    } else {
                        labelCasilla10.setBackground(colorJugador1);
                        labelCasilla10.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla10 == true) {
                    compraAfirmativaCasilla10 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla10 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla10 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla10 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla10 == 0 && creditoJug2 >= 30) {
                        labelCasilla10.setBackground(colorJugador2);
                        labelCasilla10.setForeground(Color.WHITE);
                        compradaCasilla10 = true;
                        compradaCasilla10Jugador2 = true;
                    }
                    if (compradaCasilla10 == true && pagadaCasilla10 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla10 = true;
                    }
                }

                break;
            case 11:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla11 == true) {
                    disponibilidadCasilla11 = false;

                    if (compradaCasilla11Jugador2 == true) {
                        labelCasilla11.setBackground(colorJugador2);
                        labelCasilla11.setForeground(Color.WHITE);
                    } else {
                        labelCasilla11.setBackground(colorJugador1);
                        labelCasilla11.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla11 == true) {
                    compraAfirmativaCasilla11 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla11 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla11 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla11 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla11 == 0 && creditoJug2 >= 30) {
                        labelCasilla11.setBackground(colorJugador2);
                        labelCasilla11.setForeground(Color.WHITE);
                        compradaCasilla11 = true;
                        compradaCasilla11Jugador2 = true;
                    }
                    if (compradaCasilla11 == true && pagadaCasilla11 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla11 = true;
                    }
                }

                break;
            case 12:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla12 == true) {
                    disponibilidadCasilla12 = false;

                    if (compradaCasilla12Jugador2 == true) {
                        labelCasilla12.setBackground(colorJugador2);
                        labelCasilla12.setForeground(Color.WHITE);
                    } else {
                        labelCasilla12.setBackground(colorJugador1);
                        labelCasilla12.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla12 == true) {
                    compraAfirmativaCasilla12 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla12 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla12 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla12 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla12 == 0 && creditoJug2 >= 30) {
                        labelCasilla12.setBackground(colorJugador2);
                        labelCasilla12.setForeground(Color.WHITE);
                        compradaCasilla12 = true;
                        compradaCasilla12Jugador2 = true;
                    }
                    if (compradaCasilla12 == true && pagadaCasilla12 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla12 = true;
                    }
                }

                break;
            case 13:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla13 == true) {
                    disponibilidadCasilla13 = false;

                    if (compradaCasilla13Jugador2 == true) {
                        labelCasilla13.setBackground(colorJugador2);
                        labelCasilla13.setForeground(Color.WHITE);
                    } else {
                        labelCasilla13.setBackground(colorJugador1);
                        labelCasilla13.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla13 == true) {
                    compraAfirmativaCasilla13 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla13 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla13 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla13 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla13 == 0 && creditoJug2 >= 30) {
                        labelCasilla13.setBackground(colorJugador2);
                        labelCasilla13.setForeground(Color.WHITE);
                        compradaCasilla13 = true;
                        compradaCasilla13Jugador2 = true;
                    }
                    if (compradaCasilla13 == true && pagadaCasilla13 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla13 = true;
                    }
                }

                break;
            case 14:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));
                
                if(boteAcumulado > 0) {
                JOptionPane.showConfirmDialog(rootPane, "Has caido en la banca que suerte! Te llevas el bote!",
                        "Banco", JOptionPane.DEFAULT_OPTION);

                if (fichaJugador2 == 14) {
                    creditoJug2 = creditoJug2 + boteAcumulado;
                    lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    boteAcumulado = 0;
                    lBoteAcumulado.setText(String.valueOf(boteAcumulado));
                }
                } else {
                    JOptionPane.showConfirmDialog(rootPane, "Oh que pena, no hay MegaMonedas en el bote.",
                        "Banco", JOptionPane.DEFAULT_OPTION);
                }
                break;
            case 15:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla15 == true) {
                    disponibilidadCasilla15 = false;

                    if (compradaCasilla15Jugador2 == true) {
                        labelCasilla15.setBackground(colorJugador2);
                        labelCasilla15.setForeground(Color.WHITE);
                    } else {
                        labelCasilla15.setBackground(colorJugador1);
                        labelCasilla15.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla15 == true) {
                    compraAfirmativaCasilla15 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla15 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla15 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla15 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla15 == 0 && creditoJug2 >= 30) {
                        labelCasilla15.setBackground(colorJugador2);
                        labelCasilla15.setForeground(Color.WHITE);
                        compradaCasilla15 = true;
                        compradaCasilla15Jugador2 = true;
                    }
                    if (compradaCasilla15 == true && pagadaCasilla15 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla15 = true;
                    }
                }

                break;
            case 16:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla16 == true) {
                    disponibilidadCasilla16 = false;

                    if (compradaCasilla16Jugador2 == true) {
                        labelCasilla16.setBackground(colorJugador2);
                        labelCasilla16.setForeground(Color.WHITE);
                    } else {
                        labelCasilla16.setBackground(colorJugador1);
                        labelCasilla16.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla16 == true) {
                    compraAfirmativaCasilla16 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla16 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla16 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla16 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla16 == 0 && creditoJug2 >= 30) {
                        labelCasilla16.setBackground(colorJugador2);
                        labelCasilla16.setForeground(Color.WHITE);
                        compradaCasilla16 = true;
                        compradaCasilla16Jugador2 = true;
                    }
                    if (compradaCasilla16 == true && pagadaCasilla16 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla16 = true;
                    }
                }

                break;
            case 17:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla17 == true) {
                    disponibilidadCasilla17 = false;

                    if (compradaCasilla17Jugador2 == true) {
                        labelCasilla17.setBackground(colorJugador2);
                        labelCasilla17.setForeground(Color.WHITE);
                    } else {
                        labelCasilla17.setBackground(colorJugador1);
                        labelCasilla17.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla17 == true) {
                    compraAfirmativaCasilla17 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla17 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla17 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla17 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla17 == 0 && creditoJug2 >= 30) {
                        labelCasilla17.setBackground(colorJugador2);
                        labelCasilla17.setForeground(Color.WHITE);
                        compradaCasilla17 = true;
                        compradaCasilla17Jugador2 = true;
                    }
                    if (compradaCasilla17 == true && pagadaCasilla17 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla17 = true;
                    }
                }

                break;
            case 18:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla18 == true) {
                    disponibilidadCasilla18 = false;

                    if (compradaCasilla18Jugador2 == true) {
                        labelCasilla18.setBackground(colorJugador2);
                        labelCasilla18.setForeground(Color.WHITE);
                    } else {
                        labelCasilla18.setBackground(colorJugador1);
                        labelCasilla18.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla18 == true) {
                    compraAfirmativaCasilla18 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla18 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla18 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla18 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla18 == 0 && creditoJug2 >= 30) {
                        labelCasilla18.setBackground(colorJugador2);
                        labelCasilla18.setForeground(Color.WHITE);
                        compradaCasilla18 = true;
                        compradaCasilla18Jugador2 = true;
                    }
                    if (compradaCasilla18 == true && pagadaCasilla18 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla18 = true;
                    }
                }

                break;
            case 19:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla19 == true) {
                    disponibilidadCasilla19 = false;

                    if (compradaCasilla19Jugador2 == true) {
                        labelCasilla19.setBackground(colorJugador2);
                        labelCasilla19.setForeground(Color.WHITE);
                    } else {
                        labelCasilla19.setBackground(colorJugador1);
                        labelCasilla19.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla19 == true) {
                    compraAfirmativaCasilla19 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla19 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla19 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla19 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla19 == 0 && creditoJug2 >= 30) {
                        labelCasilla19.setBackground(colorJugador2);
                        labelCasilla19.setForeground(Color.WHITE);
                        compradaCasilla19 = true;
                        compradaCasilla19Jugador2 = true;
                    }
                    if (compradaCasilla19 == true && pagadaCasilla19 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla19 = true;
                    }
                }

                break;
            case 20:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla20 == true) {
                    disponibilidadCasilla20 = false;

                    if (compradaCasilla20Jugador2 == true) {
                        labelCasilla20.setBackground(colorJugador2);
                        labelCasilla20.setForeground(Color.WHITE);
                    } else {
                        labelCasilla20.setBackground(colorJugador1);
                        labelCasilla20.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla20 == true) {
                    compraAfirmativaCasilla20 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla20 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla20 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla20 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla20 == 0) {
                        labelCasilla20.setBackground(colorJugador2);
                        labelCasilla20.setForeground(Color.WHITE);
                        compradaCasilla20 = true;
                        compradaCasilla20Jugador2 = true;
                    }
                    if (compradaCasilla20 == true && pagadaCasilla20 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla20 = true;
                    }
                }

                break;
            case 21:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                JOptionPane.showConfirmDialog(
                        rootPane, "Ups, vaya a la carcel y podrás salir cuando saques un número par",
                        "A la cárcel", JOptionPane.DEFAULT_OPTION);

                fichaJugador2 = fichaJugador2 - 14;
                carcel_2 = true;
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                break;

            case 22:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla22 == true) {
                    disponibilidadCasilla22 = false;

                    if (compradaCasilla22Jugador2 == true) {
                        labelCasilla22.setBackground(colorJugador2);
                        labelCasilla22.setForeground(Color.WHITE);
                    } else {
                        labelCasilla22.setBackground(colorJugador1);
                        labelCasilla22.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla22 == true) {
                    compraAfirmativaCasilla22 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla22 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla22 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla22 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla22 == 0 && creditoJug2 >= 30) {
                        labelCasilla22.setBackground(colorJugador2);
                        labelCasilla22.setForeground(Color.WHITE);
                        compradaCasilla22 = true;
                        compradaCasilla22Jugador2 = true;
                    }
                    if (compradaCasilla22 == true && pagadaCasilla22 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla22 = true;
                    }
                }

                break;
            case 23:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla23 == true) {
                    disponibilidadCasilla23 = false;

                    if (compradaCasilla23Jugador2 == true) {
                        labelCasilla23.setBackground(colorJugador2);
                        labelCasilla23.setForeground(Color.WHITE);
                    } else {
                        labelCasilla23.setBackground(colorJugador1);
                        labelCasilla23.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla23 == true) {
                    compraAfirmativaCasilla23 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla23 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla23 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla23 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla23 == 0 && creditoJug2 >= 30) {
                        labelCasilla23.setBackground(colorJugador2);
                        labelCasilla23.setForeground(Color.WHITE);
                        compradaCasilla23 = true;
                        compradaCasilla23Jugador2 = true;
                    }
                    if (compradaCasilla23 == true && pagadaCasilla23 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla23 = true;
                    }
                }

                break;
            case 24:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla24 == true) {
                    disponibilidadCasilla24 = false;

                    if (compradaCasilla24Jugador2 == true) {
                        labelCasilla24.setBackground(colorJugador2);
                        labelCasilla24.setForeground(Color.WHITE);
                    } else {
                        labelCasilla24.setBackground(colorJugador1);
                        labelCasilla24.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla24 == true) {
                    compraAfirmativaCasilla24 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla24 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla24 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla24 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla24 == 0 && creditoJug2 >= 30) {
                        labelCasilla24.setBackground(colorJugador2);
                        labelCasilla24.setForeground(Color.WHITE);
                        compradaCasilla24 = true;
                        compradaCasilla24Jugador2 = true;
                    }
                    if (compradaCasilla24 == true && pagadaCasilla24 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla24 = true;
                    }
                }

                break;
            case 25:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla25 == true) {
                    disponibilidadCasilla25 = false;

                    if (compradaCasilla25Jugador2 == true) {
                        labelCasilla25.setBackground(colorJugador2);
                        labelCasilla25.setForeground(Color.WHITE);
                    } else {
                        labelCasilla25.setBackground(colorJugador1);
                        labelCasilla25.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla25 == true) {
                    compraAfirmativaCasilla25 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla25 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla25 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla25 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla25 == 0 && creditoJug2 >= 30) {
                        labelCasilla25.setBackground(colorJugador2);
                        labelCasilla25.setForeground(Color.WHITE);
                        compradaCasilla25 = true;
                        compradaCasilla25Jugador2 = true;
                    }
                    if (compradaCasilla25 == true && pagadaCasilla2 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla25 = true;
                    }
                }

                break;
            case 26:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla26 == true) {
                    disponibilidadCasilla26 = false;

                    if (compradaCasilla26Jugador2 == true) {
                        labelCasilla26.setBackground(colorJugador2);
                        labelCasilla26.setForeground(Color.WHITE);
                    } else {
                        labelCasilla26.setBackground(colorJugador1);
                        labelCasilla26.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla26 == true) {
                    compraAfirmativaCasilla26 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla26 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla26 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla26 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla26 == 0 & creditoJug2 >= 30) {
                        labelCasilla26.setBackground(colorJugador2);
                        labelCasilla26.setForeground(Color.WHITE);
                        compradaCasilla26 = true;
                        compradaCasilla26Jugador2 = true;
                    }
                    if (compradaCasilla26 == true && pagadaCasilla26 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla26 = true;
                    }
                }

                break;
            case 27:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));

                if (compradaCasilla27 == true) {
                    disponibilidadCasilla27 = false;

                    if (compradaCasilla27Jugador2 == true) {
                        labelCasilla27.setBackground(colorJugador2);
                        labelCasilla27.setForeground(Color.WHITE);
                    } else {
                        labelCasilla27.setBackground(colorJugador1);
                        labelCasilla27.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador1.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        creditoJug1 = creditoJug1 + 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    }
                }

                if (disponibilidadCasilla27 == true) {
                    compraAfirmativaCasilla27 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla27 == 0 && creditoJug2 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla27 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla27 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla27 == 0 && creditoJug2 >= 27) {
                        labelCasilla27.setBackground(colorJugador2);
                        labelCasilla27.setForeground(Color.WHITE);
                        compradaCasilla27 = true;
                        compradaCasilla27Jugador2 = true;
                    }
                    if (compradaCasilla27 == true && pagadaCasilla27 == false) {
                        creditoJug2 = creditoJug2 - 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                        pagadaCasilla27 = true;
                    }
                }

                break;
            default:
                throw new AssertionError();
        }

    }

    public void funcionalidadFichaJugador1() {

        switch (fichaJugador1) {
            case 0:
                //pintarFichaFueraTurnoJugador2();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));
                
                lTarjetaSuerte.setBackground(colorJugador1);
                lTarjetaSuerte.setForeground(Color.WHITE);
                
                if(fichaJugador1 == 0){
                    
                    switch (numDado) {
                        case 1:
                            JOptionPane.showConfirmDialog(rootPane, "Que suerte, por epoca estival alta en una de tus ciudades, "
                                    + "el turismo deja una caja de 50 MegaMonedas!", "Suerte", JOptionPane.DEFAULT_OPTION);
                            creditoJug1 = creditoJug1 + 50;
                            lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                            break;
                        case 2:
                            JOptionPane.showConfirmDialog(rootPane, "Que mala suerte, los disturbios en una de tus ciudades, "
                                    + "resta en la caja 30 MegaMonedas!", "Mala suerte.", JOptionPane.DEFAULT_OPTION);  
                            creditoJug1 = creditoJug1 - 30;
                            lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                            break;
                        case 3:
                            JOptionPane.showConfirmDialog(rootPane, "Que suerte, un concierto de un famoso en una de tus ciudades, "
                                    + "deja una caja de 50 MegaMonedas!", "Suerte", JOptionPane.DEFAULT_OPTION); 
                            creditoJug1 = creditoJug1 + 50;
                            lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                            break;
                        case 4:
                            JOptionPane.showConfirmDialog(rootPane, "Que mala suerte, los bandidos en una de tus ciudades, "
                                    + "hace que caiga el turismo y resta en la caja 30 MegaMonedas.", "Mala suerte", JOptionPane.DEFAULT_OPTION);
                            creditoJug1 = creditoJug1 - 30;
                            lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                            break;
                        case 5:
                            JOptionPane.showConfirmDialog(rootPane, "Que suerte, las obras en una de tus ciudades, "
                                    + "hace que aumente el turismo y deja una caja de 50 MegaMonedas!", "Suerte", JOptionPane.DEFAULT_OPTION);
                            creditoJug1 = creditoJug1 + 50;
                            lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                            break;
                        case 6:
                            JOptionPane.showConfirmDialog(rootPane, "Que mala suerte, un mal temporal en una de tus ciudades, "
                                    + "hace que hace que tengas que emplear de la caja 30 MegaMonedas.", "Mala suerte", JOptionPane.DEFAULT_OPTION);
                            creditoJug1 = creditoJug1 - 30;
                            lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
                
                break;
            case 1:
                //pintarFichaFueraTurnoJugador2();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla1 == true) {
                    disponibilidadCasilla1 = false;

                    if (compradaCasilla1Jugador1 == true) {
                        labelCasilla1.setBackground(colorJugador1);
                        labelCasilla1.setForeground(Color.WHITE);
                    } else {
                        labelCasilla1.setBackground(colorJugador2);
                        labelCasilla1.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla1 == true) {
                    compraAfirmativaCasilla1 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla1 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla1 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla1 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla1 == 0 && creditoJug1 >= 30) {
                        labelCasilla1.setBackground(colorJugador1);
                        labelCasilla1.setForeground(Color.WHITE);
                        compradaCasilla1 = true;
                        compradaCasilla1Jugador1 = true;
                    }
                    if (compradaCasilla1 == true && pagadaCasilla1 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla1 = true;
                    }
                }

                break;
            case 2:
                //pintarFichaFueraTurnoJugador2();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla2 == true) {
                    disponibilidadCasilla2 = false;

                    if (compradaCasilla2Jugador1 == true) {
                        labelCasilla2.setBackground(colorJugador1);
                        labelCasilla2.setForeground(Color.WHITE);
                    } else {
                        labelCasilla2.setBackground(colorJugador2);
                        labelCasilla2.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla2 == true) {
                    compraAfirmativaCasilla2 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla2 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla2 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla2 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla2 == 0 && creditoJug1 >= 30) {
                        labelCasilla2.setBackground(colorJugador1);
                        labelCasilla2.setForeground(Color.WHITE);
                        compradaCasilla2 = true;
                        compradaCasilla2Jugador1 = true;
                    }
                    if (compradaCasilla2 == true && pagadaCasilla2 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla2 = true;
                    }
                }

                break;
            case 3:
                //pintarFichaFueraTurnoJugador2();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla3 == true) {
                    disponibilidadCasilla3 = false;

                    if (compradaCasilla3Jugador1 == true) {
                        labelCasilla3.setBackground(colorJugador1);
                        labelCasilla3.setForeground(Color.WHITE);
                    } else {
                        labelCasilla3.setBackground(colorJugador2);
                        labelCasilla3.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla3 == true) {
                    compraAfirmativaCasilla3 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla3 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);                      
                        
                        compraAfirmativaCasilla3 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla3 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla3 == 0 && creditoJug1 >= 30) {
                        labelCasilla3.setBackground(colorJugador1);
                        labelCasilla3.setForeground(Color.WHITE);
                        compradaCasilla3 = true;
                        compradaCasilla3Jugador1 = true;
                    }
                    if (compradaCasilla3 == true && pagadaCasilla3 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla1 = true;
                    }
                }

                break;
            case 4:
                //pintarFichaFueraTurnoJugador2();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla4 == true) {
                    disponibilidadCasilla4 = false;

                    if (compradaCasilla4Jugador1 == true) {
                        labelCasilla4.setBackground(colorJugador1);
                        labelCasilla4.setForeground(Color.WHITE);
                    } else {
                        labelCasilla4.setBackground(colorJugador2);
                        labelCasilla4.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla4 == true) {
                    compraAfirmativaCasilla4 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");
                  
                    if (compraAfirmativaCasilla4 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);                      
                        
                        compraAfirmativaCasilla4 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla4 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla4 == 0 && creditoJug1 >= 30) {
                        labelCasilla4.setBackground(colorJugador1);
                        labelCasilla4.setForeground(Color.WHITE);
                        compradaCasilla4 = true;
                        compradaCasilla4Jugador1 = true;
                    }
                    if (compradaCasilla4 == true && pagadaCasilla4 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla4 = true;
                    }
                }

                break;
            case 5:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla5 == true) {
                    disponibilidadCasilla5 = false;

                    if (compradaCasilla5Jugador1 == true) {
                        labelCasilla5.setBackground(colorJugador1);
                        labelCasilla5.setForeground(Color.WHITE);
                    } else {
                        labelCasilla5.setBackground(colorJugador2);
                        labelCasilla5.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla5 == true) {
                    compraAfirmativaCasilla5 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla5 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);                      
                        
                        compraAfirmativaCasilla5 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla5 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla5 == 0 && creditoJug1 >= 30) {
                        labelCasilla5.setBackground(colorJugador1);
                        labelCasilla5.setForeground(Color.WHITE);
                        compradaCasilla5 = true;
                        compradaCasilla5Jugador1 = true;
                    }
                    if (compradaCasilla5 == true && pagadaCasilla5 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla5 = true;
                    }
                }

                break;
            case 6:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla6 == true) {
                    disponibilidadCasilla6 = false;

                    if (compradaCasilla6Jugador1 == true) {
                        labelCasilla6.setBackground(colorJugador1);
                        labelCasilla6.setForeground(Color.WHITE);
                    } else {
                        labelCasilla6.setBackground(colorJugador2);
                        labelCasilla6.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla6 == true) {
                    compraAfirmativaCasilla6 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla6 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);                      
                        
                        compraAfirmativaCasilla6 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla6 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla6 == 0 && creditoJug1 >= 30) {
                        labelCasilla6.setBackground(colorJugador1);
                        labelCasilla6.setForeground(Color.WHITE);
                        compradaCasilla6 = true;
                        compradaCasilla6Jugador1 = true;
                    }
                    if (compradaCasilla6 == true && pagadaCasilla6 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla6 = true;
                    }
                }

                break;
            case 7:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                JOptionPane.showConfirmDialog(
                        rootPane, "Has caido en la carcel de visita. Podrás seguir jugando en el siguiente turno pero debes pagar 10 MegaMonedas a la banca.",
                        "Visita la carcel", JOptionPane.DEFAULT_OPTION);

                if (fichaJugador1 == 7) {
                    creditoJug1 = creditoJug1 - 10;
                    lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    boteAcumulado = boteAcumulado + 10;
                    lBoteAcumulado.setText(String.valueOf(boteAcumulado));
                }

                break;
            case 8:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla8 == true) {
                    disponibilidadCasilla8 = false;

                    if (compradaCasilla8Jugador1 == true) {
                        labelCasilla8.setBackground(colorJugador1);
                        labelCasilla8.setForeground(Color.WHITE);
                    } else {
                        labelCasilla8.setBackground(colorJugador2);
                        labelCasilla8.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla8 == true) {
                    compraAfirmativaCasilla8 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla8 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla8 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla8 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla8 == 0 && creditoJug1 >= 30) {
                        labelCasilla8.setBackground(colorJugador1);
                        labelCasilla8.setForeground(Color.WHITE);
                        compradaCasilla8 = true;
                        compradaCasilla8Jugador1 = true;
                    }
                    if (compradaCasilla8 == true && pagadaCasilla8 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla8 = true;
                    }
                }

                break;
            case 9:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla9 == true) {
                    disponibilidadCasilla9 = false;

                    if (compradaCasilla9Jugador1 == true) {
                        labelCasilla9.setBackground(colorJugador1);
                        labelCasilla9.setForeground(Color.WHITE);
                    } else {
                        labelCasilla9.setBackground(colorJugador2);
                        labelCasilla9.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla9 == true) {
                    compraAfirmativaCasilla9 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla9 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla9 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla9 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla9 == 0 && creditoJug1 >= 30) {
                        labelCasilla9.setBackground(colorJugador1);
                        labelCasilla9.setForeground(Color.WHITE);
                        compradaCasilla9 = true;
                        compradaCasilla9Jugador1 = true;
                    }
                    if (compradaCasilla9 == true && pagadaCasilla9 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla9 = true;
                    }
                }

                break;
            case 10:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla10 == true) {
                    disponibilidadCasilla10 = false;

                    if (compradaCasilla10Jugador1 == true) {
                        labelCasilla10.setBackground(colorJugador1);
                        labelCasilla10.setForeground(Color.WHITE);
                    } else {
                        labelCasilla10.setBackground(colorJugador2);
                        labelCasilla10.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla10 == true) {
                    compraAfirmativaCasilla10 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla10 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla10 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla10 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla10 == 0 && creditoJug1 >= 30) {
                        labelCasilla10.setBackground(colorJugador1);
                        labelCasilla10.setForeground(Color.WHITE);
                        compradaCasilla10 = true;
                        compradaCasilla10Jugador1 = true;
                    }
                    if (compradaCasilla10 == true && pagadaCasilla10 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla10 = true;
                    }
                }

                break;
            case 11:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla11 == true) {
                    disponibilidadCasilla11 = false;

                    if (compradaCasilla11Jugador1 == true) {
                        labelCasilla11.setBackground(colorJugador1);
                        labelCasilla11.setForeground(Color.WHITE);
                    } else {
                        labelCasilla11.setBackground(colorJugador2);
                        labelCasilla11.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla11 == true) {
                    compraAfirmativaCasilla11 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla11 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla11 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla11 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla11 == 0 && creditoJug1 >= 30) {
                        labelCasilla11.setBackground(colorJugador1);
                        labelCasilla11.setForeground(Color.WHITE);
                        compradaCasilla11 = true;
                        compradaCasilla11Jugador1 = true;
                    }
                    if (compradaCasilla11 == true && pagadaCasilla11 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla11 = true;
                    }
                }

                break;
            case 12:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla12 == true) {
                    disponibilidadCasilla12 = false;

                    if (compradaCasilla12Jugador1 == true) {
                        labelCasilla12.setBackground(colorJugador1);
                        labelCasilla12.setForeground(Color.WHITE);
                    } else {
                        labelCasilla12.setBackground(colorJugador2);
                        labelCasilla12.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla12 == true) {
                    compraAfirmativaCasilla12 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla12 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla12 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla12 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla12 == 0 && creditoJug1 >= 30) {
                        labelCasilla12.setBackground(colorJugador1);
                        labelCasilla12.setForeground(Color.WHITE);
                        compradaCasilla12 = true;
                        compradaCasilla12Jugador1 = true;
                    }
                    if (compradaCasilla12 == true && pagadaCasilla12 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla12 = true;
                    }
                }

                break;
            case 13:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla13 == true) {
                    disponibilidadCasilla13 = false;

                    if (compradaCasilla13Jugador1 == true) {
                        labelCasilla13.setBackground(colorJugador1);
                        labelCasilla13.setForeground(Color.WHITE);
                    } else {
                        labelCasilla13.setBackground(colorJugador2);
                        labelCasilla13.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla13 == true) {
                    compraAfirmativaCasilla13 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla13 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla13 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla13 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla13 == 0 && creditoJug1 >= 30) {
                        labelCasilla13.setBackground(colorJugador1);
                        labelCasilla13.setForeground(Color.WHITE);
                        compradaCasilla13 = true;
                        compradaCasilla13Jugador1 = true;
                    }
                    if (compradaCasilla13 == true && pagadaCasilla13 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla13 = true;
                    }
                }

                break;
            case 14:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if(boteAcumulado > 0) {
                JOptionPane.showConfirmDialog(rootPane, "Has caido en la banca que suerte! Te llevas el bote!",
                        "Banco", JOptionPane.DEFAULT_OPTION);

                if (fichaJugador1 == 14) {
                    creditoJug1 = creditoJug1 + boteAcumulado;
                    lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    boteAcumulado = 0;
                    lBoteAcumulado.setText(String.valueOf(boteAcumulado));
                }
                } else {
                    JOptionPane.showConfirmDialog(rootPane, "Oh que pena, no hay MegaMonedas en el bote.",
                        "Banco", JOptionPane.DEFAULT_OPTION);
                }
                break;
            case 15:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla15 == true) {
                    disponibilidadCasilla15 = false;

                    if (compradaCasilla15Jugador1 == true) {
                        labelCasilla15.setBackground(colorJugador1);
                        labelCasilla15.setForeground(Color.WHITE);
                    } else {
                        labelCasilla15.setBackground(colorJugador2);
                        labelCasilla15.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla15 == true) {
                    compraAfirmativaCasilla15 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla15 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla15 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla15 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla15 == 0 && creditoJug1 >= 30) {
                        labelCasilla15.setBackground(colorJugador1);
                        labelCasilla15.setForeground(Color.WHITE);
                        compradaCasilla15 = true;
                        compradaCasilla15Jugador1 = true;
                    }
                    if (compradaCasilla15 == true && pagadaCasilla15 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla15 = true;
                    }
                }

                break;
            case 16:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla16 == true) {
                    disponibilidadCasilla16 = false;

                    if (compradaCasilla16Jugador1 == true) {
                        labelCasilla16.setBackground(colorJugador1);
                        labelCasilla16.setForeground(Color.WHITE);
                    } else {
                        labelCasilla16.setBackground(colorJugador2);
                        labelCasilla16.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla16 == true) {
                    compraAfirmativaCasilla16 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla16 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla16 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla16 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla16 == 0 && creditoJug1 >= 30) {
                        labelCasilla16.setBackground(colorJugador1);
                        labelCasilla16.setForeground(Color.WHITE);
                        compradaCasilla16 = true;
                        compradaCasilla16Jugador1 = true;
                    }
                    if (compradaCasilla16 == true && pagadaCasilla16 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla16 = true;
                    }
                }

                break;
            case 17:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla17 == true) {
                    disponibilidadCasilla17 = false;

                    if (compradaCasilla17Jugador1 == true) {
                        labelCasilla17.setBackground(colorJugador1);
                        labelCasilla17.setForeground(Color.WHITE);
                    } else {
                        labelCasilla17.setBackground(colorJugador2);
                        labelCasilla17.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla17 == true) {
                    compraAfirmativaCasilla17 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla17 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla17 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla17 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla17 == 0 && creditoJug1 >= 30) {
                        labelCasilla17.setBackground(colorJugador1);
                        labelCasilla17.setForeground(Color.WHITE);
                        compradaCasilla17 = true;
                        compradaCasilla17Jugador1 = true;
                    }
                    if (compradaCasilla17 == true && pagadaCasilla17 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla17 = true;
                    }
                }

                break;
            case 18:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla18 == true) {
                    disponibilidadCasilla18 = false;

                    if (compradaCasilla18Jugador1 == true) {
                        labelCasilla18.setBackground(colorJugador1);
                        labelCasilla18.setForeground(Color.WHITE);
                    } else {
                        labelCasilla18.setBackground(colorJugador2);
                        labelCasilla18.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla18 == true) {
                    compraAfirmativaCasilla18 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla18 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla18 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla18 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla18 == 0 && creditoJug1 >= 30) {
                        labelCasilla18.setBackground(colorJugador1);
                        labelCasilla18.setForeground(Color.WHITE);
                        compradaCasilla18 = true;
                        compradaCasilla18Jugador1 = true;
                    }
                    if (compradaCasilla18 == true && pagadaCasilla18 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla18 = true;
                    }
                }

                break;
            case 19:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla19 == true) {
                    disponibilidadCasilla19 = false;

                    if (compradaCasilla19Jugador1 == true) {
                        labelCasilla19.setBackground(colorJugador1);
                        labelCasilla19.setForeground(Color.WHITE);
                    } else {
                        labelCasilla19.setBackground(colorJugador2);
                        labelCasilla19.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla19 == true) {
                    compraAfirmativaCasilla19 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla19 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla19 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla19 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla19 == 0 && creditoJug1 >= 30) {
                        labelCasilla19.setBackground(colorJugador1);
                        labelCasilla19.setForeground(Color.WHITE);
                        compradaCasilla19 = true;
                        compradaCasilla19Jugador1 = true;
                    }
                    if (compradaCasilla19 == true && pagadaCasilla19 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla19 = true;
                    }
                }

                break;
            case 20:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla20 == true) {
                    disponibilidadCasilla20 = false;

                    if (compradaCasilla20Jugador1 == true) {
                        labelCasilla20.setBackground(colorJugador1);
                        labelCasilla20.setForeground(Color.WHITE);
                    } else {
                        labelCasilla20.setBackground(colorJugador2);
                        labelCasilla20.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla20 == true) {
                    compraAfirmativaCasilla20 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla20 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla20 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla20 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla20 == 0) {
                        labelCasilla20.setBackground(colorJugador1);
                        labelCasilla20.setForeground(Color.WHITE);
                        compradaCasilla20 = true;
                        compradaCasilla20Jugador1 = true;
                    }
                    if (compradaCasilla20 == true && pagadaCasilla20 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla20 = true;
                    }
                }

                break;
            case 21:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                JOptionPane.showConfirmDialog(
                        rootPane, "Ups, vaya a la carcel y podrás salir cuando saques un número par",
                        "A la cárcel", JOptionPane.DEFAULT_OPTION);

                fichaJugador1 = fichaJugador1 - 14;
                carcel_1 = true;
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                break;
            case 22:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla22 == true) {
                    disponibilidadCasilla22 = false;

                    if (compradaCasilla22Jugador1 == true) {
                        labelCasilla22.setBackground(colorJugador1);
                        labelCasilla22.setForeground(Color.WHITE);
                    } else {
                        labelCasilla22.setBackground(colorJugador2);
                        labelCasilla22.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla22 == true) {
                    compraAfirmativaCasilla22 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla22 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla22 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla22 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla22 == 0 && creditoJug1 >= 22) {
                        labelCasilla22.setBackground(colorJugador1);
                        labelCasilla22.setForeground(Color.WHITE);
                        compradaCasilla22 = true;
                        compradaCasilla22Jugador1 = true;
                    }
                    if (compradaCasilla22 == true && pagadaCasilla22 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla22 = true;
                    }
                }

                break;
            case 23:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla23 == true) {
                    disponibilidadCasilla23 = false;

                    if (compradaCasilla23Jugador1 == true) {
                        labelCasilla23.setBackground(colorJugador1);
                        labelCasilla23.setForeground(Color.WHITE);
                    } else {
                        labelCasilla23.setBackground(colorJugador2);
                        labelCasilla23.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla23 == true) {
                    compraAfirmativaCasilla23 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla23 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla23 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla23 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla23 == 0 && creditoJug1 >= 30) {
                        labelCasilla23.setBackground(colorJugador1);
                        labelCasilla23.setForeground(Color.WHITE);
                        compradaCasilla23 = true;
                        compradaCasilla23Jugador1 = true;
                    }
                    if (compradaCasilla23 == true && pagadaCasilla23 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla23 = true;
                    }
                }

                break;
            case 24:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla24 == true) {
                    disponibilidadCasilla24 = false;

                    if (compradaCasilla24Jugador1 == true) {
                        labelCasilla24.setBackground(colorJugador1);
                        labelCasilla24.setForeground(Color.WHITE);
                    } else {
                        labelCasilla24.setBackground(colorJugador2);
                        labelCasilla24.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla24 == true) {
                    compraAfirmativaCasilla24 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla24 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla24 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla24 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla24 == 0 && creditoJug1 >= 30) {
                        labelCasilla24.setBackground(colorJugador1);
                        labelCasilla24.setForeground(Color.WHITE);
                        compradaCasilla24 = true;
                        compradaCasilla24Jugador1 = true;
                    }
                    if (compradaCasilla24 == true && pagadaCasilla24 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla24 = true;
                    }
                }

                break;
            case 25:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla25 == true) {
                    disponibilidadCasilla25 = false;

                    if (compradaCasilla25Jugador1 == true) {
                        labelCasilla25.setBackground(colorJugador1);
                        labelCasilla25.setForeground(Color.WHITE);
                    } else {
                        labelCasilla25.setBackground(colorJugador2);
                        labelCasilla25.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla25 == true) {
                    compraAfirmativaCasilla25 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla25 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla25 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla25 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla25 == 0 && creditoJug1 >= 30) {
                        labelCasilla25.setBackground(colorJugador1);
                        labelCasilla25.setForeground(Color.WHITE);
                        compradaCasilla25 = true;
                        compradaCasilla25Jugador1 = true;
                    }
                    if (compradaCasilla25 == true && pagadaCasilla25 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla25 = true;
                    }
                }

                break;
            case 26:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                if (compradaCasilla26 == true) {
                    disponibilidadCasilla26 = false;

                    if (compradaCasilla26Jugador1 == true) {
                        labelCasilla26.setBackground(colorJugador1);
                        labelCasilla26.setForeground(Color.WHITE);
                    } else {
                        labelCasilla26.setBackground(colorJugador2);
                        labelCasilla26.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla26 == true) {
                    compraAfirmativaCasilla26 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla26 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla26 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla26 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla26 == 0 && creditoJug1 >= 30) {
                        labelCasilla26.setBackground(colorJugador1);
                        labelCasilla26.setForeground(Color.WHITE);
                        compradaCasilla26 = true;
                        compradaCasilla26Jugador1 = true;
                    }
                    if (compradaCasilla26 == true && pagadaCasilla26 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla26 = true;
                    }
                }

                break;
            case 27:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));

                if (compradaCasilla27 == true) {
                    disponibilidadCasilla27 = false;

                    if (compradaCasilla27Jugador1 == true) {
                        labelCasilla27.setBackground(colorJugador1);
                        labelCasilla27.setForeground(Color.WHITE);
                    } else {
                        labelCasilla27.setBackground(colorJugador2);
                        labelCasilla27.setForeground(Color.WHITE);
                        JOptionPane.showConfirmDialog(rootPane, "Pagas 30 MegaMonedas a "+lNomJugador2.getText(), "Aviso de pago", JOptionPane.DEFAULT_OPTION);
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        creditoJug2 = creditoJug2 + 30;
                        lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    }
                }

                if (disponibilidadCasilla27 == true) {
                    compraAfirmativaCasilla27 = JOptionPane.showConfirmDialog(rootPane, "¿Quieres comprar la calle?");

                    if (compraAfirmativaCasilla27 == 0 && creditoJug1 <= 20) {
                        JOptionPane.showConfirmDialog(rootPane, "Si compras la casilla ahora mismo, tu saldo se quedaría en negativo"
                                + "y perderías la partida.", "Aviso fin de partida", JOptionPane.DEFAULT_OPTION);
                        
                        compraAfirmativaCasilla27 = JOptionPane.showConfirmDialog(rootPane, "¿Realmente quieres comprar la calle?");
                        
                        if (compraAfirmativaCasilla27 == 0) {
                            JOptionPane.showConfirmDialog(rootPane, "Oh, has perdido. Tu saldo se quedó en negativo",
                                    "Has perdido", JOptionPane.DEFAULT_OPTION);
                            System.exit(0);
                        }
                    }
                    
                    if (compraAfirmativaCasilla27 == 0 && creditoJug1 >= 30) {
                        labelCasilla27.setBackground(colorJugador1);
                        labelCasilla27.setForeground(Color.WHITE);
                        compradaCasilla27 = true;
                        compradaCasilla27Jugador1 = true;
                    }
                    if (compradaCasilla27 == true && pagadaCasilla27 == false) {
                        creditoJug1 = creditoJug1 - 30;
                        lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                        pagadaCasilla27 = true;
                    }
                }

                break;
            default:
                throw new AssertionError();
        }

    }

    public void pintarFichaFueraTurnoJugador2() {

        switch (fichaJugador2) {
            case 0:
                if (fichaJugador2 == 0) {
                    labelCasilla0.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                }
                break;
            case 1:
                if (fichaJugador2 == 1) {
                    labelCasilla1.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                }
                break;
            case 2:
                if (fichaJugador2 == 2) {
                    labelCasilla2.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                }
                break;
            case 3:
                if (fichaJugador2 == 3) {
                    labelCasilla3.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                }
                break;
            case 4:
                if (fichaJugador2 == 4) {
                    labelCasilla4.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                }
                break;
            case 5:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 6:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 7:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 8:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 9:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 10:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 11:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 12:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 13:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 14:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 15:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 16:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 17:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 18:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 19:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 20:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 21:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 22:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 23:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 24:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 25:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 26:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 27:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("/imagenes/img3.48px.png")));

                break;
            default:
                throw new AssertionError();
        }

    }

    public void pintarFichaFueraTurnoJugador1() {

        switch (fichaJugador1) {
            case 0:
                if (fichaJugador1 == 0) {
                    labelCasilla0.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                }
                break;
            case 1:
                if (fichaJugador1 == 1) {
                    labelCasilla1.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                }
                break;
            case 2:
                if (fichaJugador1 == 2) {
                    labelCasilla2.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                }
                break;
            case 3:
                if (fichaJugador1 == 3) {
                    labelCasilla0.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                }
                break;
            case 4:
                if (fichaJugador1 == 4) {
                    labelCasilla0.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                }
                break;
            case 5:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 6:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 7:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 8:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 9:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 10:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 11:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 12:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 13:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 14:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 15:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 16:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 17:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 18:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 19:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 20:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 21:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 22:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 23:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 24:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 25:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 26:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("")));

                break;
            case 27:
                //reserteaCasillas();
                labelCasilla0.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla1.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla2.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla3.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla4.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla5.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla6.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla7.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla8.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla9.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla10.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla11.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla12.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla13.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla14.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla15.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla16.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla17.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla18.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla19.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla20.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla21.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla22.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla23.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla24.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla25.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla26.setIcon(new ImageIcon(getClass().getResource("")));
                labelCasilla27.setIcon(new ImageIcon(getClass().getResource("/imagenes/img1.48px.png")));

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lJugador1 = new javax.swing.JLabel();
        lJugador2 = new javax.swing.JLabel();
        lNomJugador1 = new javax.swing.JLabel();
        lNomJugador2 = new javax.swing.JLabel();
        lCreditoJug1 = new javax.swing.JLabel();
        lCreditoJug2 = new javax.swing.JLabel();
        lCreditoDisponibleJug1 = new javax.swing.JLabel();
        lCreditoDisponibleJug2 = new javax.swing.JLabel();
        lIconJug2 = new javax.swing.JLabel();
        lIconJug1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnDado = new javax.swing.JButton();
        lResultadoDado = new javax.swing.JLabel();
        lTurno = new javax.swing.JLabel();
        lResultadoTurno = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lBote = new javax.swing.JLabel();
        lBoteAcumulado = new javax.swing.JLabel();
        lNum_Vueltas_Jug1 = new javax.swing.JLabel();
        lNum_Vueltas_Jug2 = new javax.swing.JLabel();
        lNumVueltasJug2 = new javax.swing.JLabel();
        lNumVueltasJug1 = new javax.swing.JLabel();
        lMaxVueltasPartida = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelCasilla0 = new javax.swing.JLabel();
        labelCasilla1 = new javax.swing.JLabel();
        labelCasilla2 = new javax.swing.JLabel();
        labelCasilla3 = new javax.swing.JLabel();
        labelCasilla4 = new javax.swing.JLabel();
        labelCasilla5 = new javax.swing.JLabel();
        labelCasilla6 = new javax.swing.JLabel();
        labelCasilla7 = new javax.swing.JLabel();
        labelCasilla8 = new javax.swing.JLabel();
        labelCasilla9 = new javax.swing.JLabel();
        labelCasilla10 = new javax.swing.JLabel();
        labelCasilla11 = new javax.swing.JLabel();
        labelCasilla12 = new javax.swing.JLabel();
        labelCasilla13 = new javax.swing.JLabel();
        labelCasilla14 = new javax.swing.JLabel();
        labelCasilla27 = new javax.swing.JLabel();
        labelCasilla26 = new javax.swing.JLabel();
        labelCasilla25 = new javax.swing.JLabel();
        labelCasilla24 = new javax.swing.JLabel();
        labelCasilla23 = new javax.swing.JLabel();
        labelCasilla22 = new javax.swing.JLabel();
        labelCasilla21 = new javax.swing.JLabel();
        labelCasilla20 = new javax.swing.JLabel();
        labelCasilla19 = new javax.swing.JLabel();
        labelCasilla18 = new javax.swing.JLabel();
        labelCasilla17 = new javax.swing.JLabel();
        labelCasilla16 = new javax.swing.JLabel();
        labelCasilla15 = new javax.swing.JLabel();
        lTarjetaSuerte = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mOpciones = new javax.swing.JMenu();
        mItemGuardar = new javax.swing.JMenuItem();
        mItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        lJugador1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lJugador1.setText("JUGADOR 1");

        lJugador2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lJugador2.setText("JUGADOR 2:");

        lNomJugador1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lNomJugador2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lCreditoJug1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lCreditoJug1.setText("CRÉDITO:");

        lCreditoJug2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lCreditoJug2.setText("CRÉDITO:");

        lCreditoDisponibleJug1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lCreditoDisponibleJug2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lIconJug2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img3.48px.png"))); // NOI18N

        lIconJug1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img1.48px.png"))); // NOI18N

        btnDado.setBackground(new java.awt.Color(0, 0, 0));
        btnDado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDado.setForeground(new java.awt.Color(255, 255, 255));
        btnDado.setText("DADO");
        btnDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadoActionPerformed(evt);
            }
        });

        lResultadoDado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lTurno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lTurno.setText("TURNO:");

        lResultadoTurno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lResultadoDado, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lResultadoTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnDado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lResultadoDado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lResultadoTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lBote.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lBote.setText("BOTE:");

        lBoteAcumulado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lBote, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lBoteAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lBote, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(lBoteAcumulado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lNum_Vueltas_Jug1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lNum_Vueltas_Jug1.setText("Nº de vueltas Jugador 1:");

        lNum_Vueltas_Jug2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lNum_Vueltas_Jug2.setText("Nº de vueltas Jugador 2:");

        lNumVueltasJug2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lNumVueltasJug1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lMaxVueltasPartida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lMaxVueltasPartida.setText("Máximo de vueltas de la partida: 20");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lIconJug1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lIconJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lJugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lNomJugador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lNomJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lCreditoJug2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lCreditoJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lCreditoDisponibleJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lCreditoDisponibleJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lNum_Vueltas_Jug1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(lNum_Vueltas_Jug2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lNumVueltasJug2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(lNumVueltasJug1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lMaxVueltasPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lJugador1)
                                .addComponent(lNomJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lCreditoJug1)
                                .addComponent(lCreditoDisponibleJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lIconJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lJugador2)
                                .addComponent(lNomJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lCreditoJug2)
                                .addComponent(lCreditoDisponibleJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lIconJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lNum_Vueltas_Jug1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lNumVueltasJug1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lNum_Vueltas_Jug2, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                            .addComponent(lNumVueltasJug2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lMaxVueltasPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelCasilla0.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla0.setText("Salida");
        labelCasilla0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla1.setText("Abiyan");
        labelCasilla1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla2.setText("Nairobi");
        labelCasilla2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla3.setText("Jartum");
        labelCasilla3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla4.setText("Luanda");
        labelCasilla4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla5.setText("Kinsasa");
        labelCasilla5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla6.setText("El Cairo");
        labelCasilla6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla7.setText("Carcel");
        labelCasilla7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla8.setText("Motevideo");
        labelCasilla8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla9.setText("Caracas");
        labelCasilla9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla10.setText("Quito");
        labelCasilla10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla11.setText("Bogotá");
        labelCasilla11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla12.setText("Lima");
        labelCasilla12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla13.setText("Sao Paolo");
        labelCasilla13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla14.setText("Banco");
        labelCasilla14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla27.setText("New York");
        labelCasilla27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla26.setText("Las Vegas");
        labelCasilla26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla25.setText("Houston");
        labelCasilla25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla24.setText("Filadelfia");
        labelCasilla24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla23.setText("Boston");
        labelCasilla23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla22.setText("Chicago");
        labelCasilla22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla21.setText("A carcel");
        labelCasilla21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla20.setText("Praga");
        labelCasilla20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla19.setText("París");
        labelCasilla19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla18.setText("Roma");
        labelCasilla18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla17.setText("Londres");
        labelCasilla17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla16.setText("Lisboa");
        labelCasilla16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCasilla15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCasilla15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCasilla15.setText("Atenas");
        labelCasilla15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lTarjetaSuerte.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lTarjetaSuerte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTarjetaSuerte.setText("TARJETA DE LA SUERTE");
        lTarjetaSuerte.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCasilla27, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labelCasilla22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelCasilla23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelCasilla24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelCasilla26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelCasilla0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelCasilla21, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelCasilla20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCasilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelCasilla19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCasilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelCasilla25, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelCasilla3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCasilla18, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelCasilla4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCasilla17, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lTarjetaSuerte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelCasilla16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCasilla5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelCasilla15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCasilla6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelCasilla8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCasilla7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCasilla9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCasilla10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCasilla11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCasilla12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCasilla13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCasilla14, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelCasilla1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                        .addComponent(labelCasilla0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCasilla4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCasilla5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCasilla6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCasilla7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelCasilla3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCasilla2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCasilla8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCasilla27, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCasilla9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCasilla26, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCasilla25, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCasilla10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCasilla24, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCasilla11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelCasilla23, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCasilla12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelCasilla22, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCasilla13, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(lTarjetaSuerte, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelCasilla17, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelCasilla18, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelCasilla16, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                        .addComponent(labelCasilla14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelCasilla15, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelCasilla21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCasilla19, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCasilla20, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );

        mOpciones.setText("Opciones");

        mItemGuardar.setText("Guardar");
        mItemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemGuardarActionPerformed(evt);
            }
        });
        mOpciones.add(mItemGuardar);

        mItemSalir.setText("Salir");
        mItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemSalirActionPerformed(evt);
            }
        });
        mOpciones.add(mItemSalir);

        jMenuBar1.add(mOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mItemGuardarActionPerformed

    private void mItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mItemSalirActionPerformed

    private void btnDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadoActionPerformed

        if (numVueltasJug1 >= 20 || numVueltasJug2 >= 20) {
            JOptionPane.showConfirmDialog(rootPane, "Ha ganado el que más MegaMonedas tenga. En caso de empate,"
                + "gana el que más vueltas haya realizado.", "Fin del juego", JOptionPane.DEFAULT_OPTION);
            System.exit(0);
        }

        if (turno % 2 == 0) {
            lResultadoTurno.setText(nombreJugador2);
            lNumVueltasJug2.setText(String.valueOf(numVueltasJug2));

            /*fichaJugador1 = fichaJugador1 + numDado;
            pintarFichaFueraTurnoJugador1();*/

            numDado = (int) (Math.random() * 6 + 1);
            lResultadoDado.setText("Has sacado un " + numDado);

            if (carcel_2 == true) {
                if(numDado % 2 == 0) {
                    JOptionPane.showConfirmDialog(rootPane, "Sales de la cárcel.", "Salida de cárcel", JOptionPane.DEFAULT_OPTION);
                    carcel_2 = false;
                } else {
                    JOptionPane.showConfirmDialog(rootPane, "Intentaló en el siguiente turno", "Salida cárcel", JOptionPane.DEFAULT_OPTION);
                }

            }

            if(carcel_2 == false) {

                fichaJugador2 = fichaJugador2 + numDado;

                if (fichaJugador2 >= 28) {
                    fichaJugador2 = fichaJugador2 - 28;
                    creditoJug2 = creditoJug2 + 30;
                    lCreditoDisponibleJug2.setText(String.valueOf(creditoJug2));
                    numVueltasJug2++;
                    lNumVueltasJug2.setText(String.valueOf(numVueltasJug2));
                    boteAcumulado = boteAcumulado + 30;
                    lBoteAcumulado.setText(String.valueOf(boteAcumulado));
                    JOptionPane.showConfirmDialog(rootPane, "Vas a pasar por la casilla de salida, se han acumuladp 30 MegaMonedas en tu crédito y en el bote",
                        "Bote", JOptionPane.DEFAULT_OPTION);
                }

                funcionalidadFichaJugador2();

                if(creditoJug2 < 0) {
                    JOptionPane.showConfirmDialog(rootPane, "Te quedaste con saldo negativo. Ohhh, has perdido...",
                        "Perdiste", JOptionPane.DEFAULT_OPTION);
                    System.exit(0);
                }
            }

        } else {

            lResultadoTurno.setText(nombreJugador1);
            lNumVueltasJug1.setText(String.valueOf(numVueltasJug1));

            /*fichaJugador2 = fichaJugador2 + numDado;
            pintarFichaFueraTurnoJugador2();*/
            numDado = (int) (Math.random() * 6 + 1);
            lResultadoDado.setText("Has sacado un " + numDado);

            if (carcel_1 == true) {
                if(numDado % 2 == 0) {
                    JOptionPane.showConfirmDialog(rootPane, "Sales de la cárcel.", "Salida de cárcel", JOptionPane.DEFAULT_OPTION);
                    carcel_1 = false;
                } else {
                    JOptionPane.showConfirmDialog(rootPane, "Intentaló en el siguiente turno", "Salida cárcel", JOptionPane.DEFAULT_OPTION);
                }

            }

            if(carcel_1 == false) {

                fichaJugador1 = fichaJugador1 + numDado;

                if (fichaJugador1 >= 28) {
                    fichaJugador1 = fichaJugador1 - 28;
                    creditoJug1 = creditoJug1 + 30;
                    lCreditoDisponibleJug1.setText(String.valueOf(creditoJug1));
                    numVueltasJug1++;
                    lNumVueltasJug1.setText(String.valueOf(numVueltasJug1));
                    boteAcumulado = boteAcumulado + 30;
                    lBoteAcumulado.setText(String.valueOf(boteAcumulado));
                    JOptionPane.showConfirmDialog(rootPane, "Vas a pasar por la casilla de salida, se han acumuladp 30 MegaMonedas en tu crédito y en el bote",
                        "Bote", JOptionPane.DEFAULT_OPTION);            }

                funcionalidadFichaJugador1();

                if(creditoJug1 < 0) {
                    JOptionPane.showConfirmDialog(rootPane, "Te quedaste con saldo negativo. Ohhh, has perdido...",
                        "Perdiste", JOptionPane.DEFAULT_OPTION);
                    System.exit(0);
                }
            }
        }

        turno++;

    }//GEN-LAST:event_btnDadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDado;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lBote;
    private javax.swing.JLabel lBoteAcumulado;
    private javax.swing.JLabel lCreditoDisponibleJug1;
    private javax.swing.JLabel lCreditoDisponibleJug2;
    private javax.swing.JLabel lCreditoJug1;
    private javax.swing.JLabel lCreditoJug2;
    private javax.swing.JLabel lIconJug1;
    private javax.swing.JLabel lIconJug2;
    private javax.swing.JLabel lJugador1;
    private javax.swing.JLabel lJugador2;
    private javax.swing.JLabel lMaxVueltasPartida;
    private javax.swing.JLabel lNomJugador1;
    private javax.swing.JLabel lNomJugador2;
    private javax.swing.JLabel lNumVueltasJug1;
    private javax.swing.JLabel lNumVueltasJug2;
    private javax.swing.JLabel lNum_Vueltas_Jug1;
    private javax.swing.JLabel lNum_Vueltas_Jug2;
    private javax.swing.JLabel lResultadoDado;
    private javax.swing.JLabel lResultadoTurno;
    private javax.swing.JLabel lTarjetaSuerte;
    private javax.swing.JLabel lTurno;
    private javax.swing.JLabel labelCasilla0;
    private javax.swing.JLabel labelCasilla1;
    private javax.swing.JLabel labelCasilla10;
    private javax.swing.JLabel labelCasilla11;
    private javax.swing.JLabel labelCasilla12;
    private javax.swing.JLabel labelCasilla13;
    private javax.swing.JLabel labelCasilla14;
    private javax.swing.JLabel labelCasilla15;
    private javax.swing.JLabel labelCasilla16;
    private javax.swing.JLabel labelCasilla17;
    private javax.swing.JLabel labelCasilla18;
    private javax.swing.JLabel labelCasilla19;
    private javax.swing.JLabel labelCasilla2;
    private javax.swing.JLabel labelCasilla20;
    private javax.swing.JLabel labelCasilla21;
    private javax.swing.JLabel labelCasilla22;
    private javax.swing.JLabel labelCasilla23;
    private javax.swing.JLabel labelCasilla24;
    private javax.swing.JLabel labelCasilla25;
    private javax.swing.JLabel labelCasilla26;
    private javax.swing.JLabel labelCasilla27;
    private javax.swing.JLabel labelCasilla3;
    private javax.swing.JLabel labelCasilla4;
    private javax.swing.JLabel labelCasilla5;
    private javax.swing.JLabel labelCasilla6;
    private javax.swing.JLabel labelCasilla7;
    private javax.swing.JLabel labelCasilla8;
    private javax.swing.JLabel labelCasilla9;
    private javax.swing.JMenuItem mItemGuardar;
    private javax.swing.JMenuItem mItemSalir;
    private javax.swing.JMenu mOpciones;
    // End of variables declaration//GEN-END:variables
}
