package interfaz;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class pantalla extends javax.swing.JFrame {

    String nombre1, nombre2, nombre3;
    int op1, op2, op3;

    String foto1, foto2, foto3, fotoPrimero, fotoSegundo, fotoTercero;

    public pantalla(String nombre1, int op1, String nombre2, int op2, String nombre3, int op3, String foto1, String foto2, String foto3) {

        //todo esto se ejecuta nada mas aparezca la pantalla
        initComponents();
        setLocationRelativeTo(null); //esto es para que aparezca en el medio de la pantalla
        this.setLocationRelativeTo(this);

        //estas varaibles almacenan los valores que recibe el constructor de la clase pantalla
        this.foto1 = foto1;
        this.foto2 = foto2;
        this.foto3 = foto3;

        if (this.foto1.equals("imagenes/11.png")) {
            fotoPrimero = "imagenes/p11.png";
        } else if (this.foto1.equals("imagenes/21.png")) {
            fotoPrimero = "imagenes/p21.png";
        } else if (this.foto1.equals("imagenes/31.png")) {
            fotoPrimero = "imagenes/p31.png";
        }

        if (this.foto2.equals("imagenes/12.png")) {
            fotoSegundo = "imagenes/p12.png";
        } else if (this.foto2.equals("imagenes/22.png")) {
            fotoSegundo = "imagenes/p22.png";
        } else if (this.foto2.equals("imagenes/32.png")) {
            fotoSegundo = "imagenes/p32.png";
        }

        if (this.foto3.equals("imagenes/13.png")) {
            fotoTercero = "imagenes/p13.png";
        } else if (this.foto3.equals("imagenes/23.png")) {
            fotoTercero = "imagenes/p23.png";
        } else if (this.foto3.equals("imagenes/33.png")) {
            fotoTercero = "imagenes/p33.png";
        }

        botonPrimero.setIcon(new ImageIcon(fotoPrimero));
        botonSegundo.setIcon(new ImageIcon(fotoSegundo));
        botonTercero.setIcon(new ImageIcon(fotoTercero));

        this.nombre1 = nombre1;
        this.op1 = op1;
        this.nombre2 = nombre2;
        this.op2 = op2;
        this.nombre3 = nombre3;
        this.op3 = op3;

        // creo la lista circular y que tenga las 19 posiciones 
        ptr = null;
        int contador = 0;

        while (contador != 19) {

            Nodo p = ptr;
            Nodo q = new Nodo();
            if (ptr == null) {
                ptr = q;
                q.link = ptr;
            } else {
                while (p.link != ptr) {
                    p = p.link;
                }
                p.link = q;
                q.link = ptr;

            }
            contador += 1;
        }

        // esto lo pude hacer arriba en el anterior do while pero crei que para tenerlo un poco mas ordenado hacer mejor otro do while
        //donde basicamente los elementos que tiene cada nodo los inicializo
        Nodo p = ptr;
        int cont = 1;
        do {

            //los p.info son los nombres de los jbutton y serviran para cambiarle el icono cuando el juego empieze
            //el p.pos es para saber en la poscion y los numero y carcel es para saber si esta eñ jugador en ese nodo y si esta en la carcel
            //se hace lo mismo para los 18 botones con switch
            switch (cont) {
                case 1:
                    p.info = boton1;
                    p.pos = 1;
                    p.numero1 = true;
                    p.numero2 = true;
                    p.numero3 = true;
                    p.carcel1 = false;
                    p.carcel2 = false;
                    p.carcel3 = false;
                    break;
                case 2:
                    p.info = boton2;
                    p.pos = 2;
                    p.carcel1 = false;
                    p.carcel2 = false;
                    p.carcel3 = false;
                    break;
                case 3:
                    p.info = boton3;
                    p.pos = 3;
                    p.carcel1 = false;
                    p.carcel2 = false;
                    p.carcel3 = false;
                    break;
                case 4:
                    p.info = boton4;
                    p.pos = 4;
                    p.carcel1 = false;
                    p.carcel2 = false;
                    p.carcel3 = false;
                    break;
                case 5:
                    p.info = boton5;
                    p.pos = 5;
                    p.carcel1 = false;
                    p.carcel2 = false;
                    p.carcel3 = false;
                    break;
                case 6:
                    p.info = boton6;
                    p.pos = 6;
                    p.carcel1 = false;
                    p.carcel2 = false;
                    p.carcel3 = false;
                    break;
                case 7:
                    p.info = boton7;
                    p.pos = 7;
                    p.carcel1 = false;
                    p.carcel2 = false;
                    p.carcel3 = false;
                    break;
                case 8:
                    p.info = boton8;
                    p.pos = 8;
                    p.carcel1 = false;
                    p.carcel2 = false;
                    p.carcel3 = false;
                    break;
                case 9:
                    p.info = boton9;
                    p.pos = 9;
                    p.carcel1 = false;
                    p.carcel2 = false;
                    p.carcel3 = false;
                    break;
                case 10:
                    p.info = boton10;
                    p.pos = 10;
                    p.carcel1 = false;
                    p.carcel2 = false;
                    p.carcel3 = false;
                    break;
                case 11:
                    p.info = boton11;
                    p.pos = 11;
                    p.carcel1 = false;
                    p.carcel2 = false;
                    p.carcel3 = false;
                    break;
                case 12:
                    p.info = boton12;
                    p.pos = 12;
                    p.carcel1 = false;
                    p.carcel2 = false;
                    p.carcel3 = false;
                    break;
                case 13:
                    p.info = boton13;
                    p.pos = 13;
                    p.carcel1 = false;
                    p.carcel2 = false;
                    p.carcel3 = false;
                    break;
                case 14:
                    p.info = boton14;
                    p.pos = 14;
                    p.carcel1 = false;
                    p.carcel2 = false;
                    p.carcel3 = false;
                    break;
                case 15:
                    p.info = boton15;
                    p.pos = 15;
                    p.carcel1 = false;
                    p.carcel2 = false;
                    p.carcel3 = false;
                    break;
                case 16:
                    p.info = boton16;
                    p.pos = 16;
                    p.carcel1 = false;
                    p.carcel2 = false;
                    p.carcel3 = false;
                    break;
                case 17:
                    p.info = boton17;
                    p.pos = 17;
                    p.carcel1 = false;
                    p.carcel2 = false;
                    p.carcel3 = false;
                    break;
                case 18:
                    p.info = boton18;
                    p.pos = 18;
                    p.carcel1 = false;
                    p.carcel2 = false;
                    p.carcel3 = false;
                    break;
            }
            cont++;
            p = p.link;
        } while (p != ptr);

        //se muestra el turno del primer jugador 
        mostrarTurno.setText(nombre1);

    }

    Nodo ptr;

    private pantalla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //defino la clase nodo con todos sus elementos 
    class Nodo {

        JButton info;
        int pos;
        boolean numero1;
        boolean numero2;
        boolean numero3;
        Nodo link;
        boolean carcel1;
        boolean carcel2;
        boolean carcel3;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tirar = new javax.swing.JButton();
        parar = new javax.swing.JButton();
        lblMostrarDado = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        boton18 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton11 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton12 = new javax.swing.JButton();
        boton13 = new javax.swing.JButton();
        boton14 = new javax.swing.JButton();
        boton15 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mostrarTurno = new javax.swing.JTextField();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton10 = new javax.swing.JButton();
        boton16 = new javax.swing.JButton();
        botonPrimero = new javax.swing.JButton();
        botonTercero = new javax.swing.JButton();
        botonSegundo = new javax.swing.JButton();
        boton17 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondodados_1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("juego");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/dadoicono.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tirar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        tirar.setText("Tirar");
        tirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tirarActionPerformed(evt);
            }
        });
        getContentPane().add(tirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 280, -1, -1));

        parar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        parar.setText("Parar");
        parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pararActionPerformed(evt);
            }
        });
        getContentPane().add(parar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 280, -1, -1));
        getContentPane().add(lblMostrarDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 130, 145, 86));

        txtResultado.setEditable(false);
        txtResultado.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 230, 171, 40));

        boton18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton18ActionPerformed(evt);
            }
        });
        getContentPane().add(boton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 109, 102));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Juego laboratorio 2.png"))); // NOI18N
        jButton15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 530, 340));

        boton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        getContentPane().add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 109, 102));

        boton11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton11ActionPerformed(evt);
            }
        });
        getContentPane().add(boton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, 109, 102));

        boton7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        getContentPane().add(boton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 109, 102));

        boton8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        getContentPane().add(boton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 109, 102));

        boton9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        getContentPane().add(boton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, 109, 102));

        boton12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton12ActionPerformed(evt);
            }
        });
        getContentPane().add(boton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 109, 102));

        boton13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton13ActionPerformed(evt);
            }
        });
        getContentPane().add(boton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 109, 102));

        boton14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton14ActionPerformed(evt);
            }
        });
        getContentPane().add(boton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 109, 102));

        boton15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton15ActionPerformed(evt);
            }
        });
        getContentPane().add(boton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 109, 102));

        boton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 109, 102));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Turno de: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 390, -1, -1));

        mostrarTurno.setEditable(false);
        mostrarTurno.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(mostrarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 270, 40));

        boton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        getContentPane().add(boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 109, 102));

        boton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        getContentPane().add(boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 109, 102));

        boton10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton10ActionPerformed(evt);
            }
        });
        getContentPane().add(boton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, 109, 102));

        boton16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton16ActionPerformed(evt);
            }
        });
        getContentPane().add(boton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 109, 102));

        botonPrimero.setBorder(null);
        botonPrimero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonPrimero.setFocusable(false);
        botonPrimero.setRequestFocusEnabled(false);
        botonPrimero.setVerifyInputWhenFocusTarget(false);
        botonPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrimeroActionPerformed(evt);
            }
        });
        getContentPane().add(botonPrimero, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 50, 40));

        botonTercero.setBorder(null);
        botonTercero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTerceroActionPerformed(evt);
            }
        });
        getContentPane().add(botonTercero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 40, 40));

        botonSegundo.setBorder(null);
        botonSegundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSegundoActionPerformed(evt);
            }
        });
        getContentPane().add(botonSegundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 40, 40));

        boton17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton17ActionPerformed(evt);
            }
        });
        getContentPane().add(boton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 109, 102));

        boton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        getContentPane().add(boton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 109, 102));

        boton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton1.setDefaultCapable(false);
        boton1.setEnabled(false);
        boton1.setFocusable(false);
        boton1.setRequestFocusEnabled(false);
        boton1.setVerifyInputWhenFocusTarget(false);
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 109, 102));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ImageIcon ficha12 = new ImageIcon("imagenes/12.jpg");
    ImageIcon ficha13 = new ImageIcon("imagenes/13.jpg");
    ImageIcon ficha23 = new ImageIcon("imagenes/23.jpg");


    private void tirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tirarActionPerformed
        //el boton de tirar es simplemente para que se vea la animacion o el gif del dado dando vuelta, pero lo realmente importante viene en el boton parar
        generarnumeros objDado = new generarnumeros();
        int datos = objDado.calcularnumero();
        imagenes objImag1 = new imagenes();
        lblMostrarDado.setIcon(objImag1.gifDado1(datos));
    }//GEN-LAST:event_tirarActionPerformed

    public String nombreSiguiente(String nombreAnterior) {

        //para el funcionamiento de todo esto se necesita saber el nombre del jugador del turno actual y el del siguiente
        //esta funcion busca el nombre del jugador siguiente
        String nombreSig = "";

        if (nombreAnterior.equals(nombre1) && ganar2 == 0) {
            nombreSig = nombre2;
        } else if (nombreAnterior.equals(nombre2) && ganar3 == 0) {
            nombreSig = nombre3;
        } else if (nombreAnterior.equals(nombre3) && ganar1 == 0) {
            nombreSig = nombre1;
        } else if (nombreAnterior.equals(nombre1) && ganar3 == 0) {
            nombreSig = nombre3;
        } else if (nombreAnterior.equals(nombre2) && ganar1 == 0) {
            nombreSig = nombre1;
        } else if (nombreAnterior.equals(nombre3) && ganar2 == 0) {
            nombreSig = nombre2;
        } else {
            nombreSig = nombreAnterior;
        }
        return nombreSig;
    }

    int pos1 = 0, pos2 = 0, pos3 = 0, op = 0;

    // y esta funcion es para retornar el icono de la ficha de cada jugador 
    public ImageIcon imagenIcono(String nombre) {
        ImageIcon retorno = new ImageIcon("");

        if (nombre.equals(nombre1)) {
            retorno = new ImageIcon(foto1);
        } else if (nombre.equals(nombre2)) {
            retorno = new ImageIcon(foto2);
        } else if (nombre.equals(foto3)) {
            retorno = new ImageIcon(foto3);
        }

        return retorno;
    }
    int auxiliar = 0, ronda = 1, repetir = 0;
    String nombreAnt = "", siguiente = "";

    private void pararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pararActionPerformed

        //el boton de parar es el importante, aqui lo que hace es mediante otra clase del programa, elegir un numero al azar, mostrarlo el icono del dado 
        //y en el textfield mostrarlo tambein
        generarnumeros objDado = new generarnumeros();
        ImagenesResul objImag1 = new ImagenesResul();
        int num1 = objDado.calcularnumero();
        lblMostrarDado.setIcon(objImag1.pngDadoR(num1));
        txtResultado.setText(Float.toString(num1));

        //aqui viene la locura y no se si esto es lo mas optimo pero al menos funciona
        //todos estos condicionales son para verificar si el jugador tiene que repetir turno porque esta en la carcel o no
        // y para verificar si el jugador ya gano, ya que no tiene sentido seguir mostrando su nombre y turno en la pantalla
        if (repetir1 == 0 && mostrarTurno.getText().equals(nombre1)) {
            if (repetir == 0) {

                if (mostrarTurno.getText().equals(nombre1) && ganar1 == 0) {
                    nombreAnt = mostrarTurno.getText();
                    siguiente = nombreSiguiente(nombreAnt);
                    mostrarTurno.setText(siguiente);
                } else if (mostrarTurno.getText().equals(nombre2) && ganar2 == 0) {
                    nombreAnt = mostrarTurno.getText();
                    siguiente = nombreSiguiente(nombreAnt);
                    mostrarTurno.setText(siguiente);
                } else if (mostrarTurno.getText().equals(nombre3) && ganar3 == 0) {
                    nombreAnt = mostrarTurno.getText();
                    siguiente = nombreSiguiente(nombreAnt);
                    mostrarTurno.setText(siguiente);
                } else {
                    nombreAnt = mostrarTurno.getText();
                    siguiente = nombreSiguiente(nombreAnt);
                    mostrarTurno.setText(siguiente);
                }
            } else {
                repetir = repetir - 1;
            }
        } else if (repetir2 == 0 && mostrarTurno.getText().equals(nombre2)) {
            if (repetir == 0) {

                if (mostrarTurno.getText().equals(nombre1) && ganar1 == 0) {
                    nombreAnt = mostrarTurno.getText();
                    siguiente = nombreSiguiente(nombreAnt);
                    mostrarTurno.setText(siguiente);
                } else if (mostrarTurno.getText().equals(nombre2) && ganar2 == 0) {
                    nombreAnt = mostrarTurno.getText();
                    siguiente = nombreSiguiente(nombreAnt);
                    mostrarTurno.setText(siguiente);
                } else if (mostrarTurno.getText().equals(nombre3) && ganar3 == 0) {
                    nombreAnt = mostrarTurno.getText();
                    siguiente = nombreSiguiente(nombreAnt);
                    mostrarTurno.setText(siguiente);
                } else {
                    nombreAnt = mostrarTurno.getText();
                    siguiente = nombreSiguiente(nombreAnt);
                    mostrarTurno.setText(siguiente);
                }
            } else {
                repetir = repetir - 1;
            }
        } else if (repetir3 == 0 && mostrarTurno.getText().equals(nombre3)) {
            if (repetir == 0) {

                if (mostrarTurno.getText().equals(nombre1) && ganar1 == 0) {
                    nombreAnt = mostrarTurno.getText();
                    siguiente = nombreSiguiente(nombreAnt);
                    mostrarTurno.setText(siguiente);
                } else if (mostrarTurno.getText().equals(nombre2) && ganar2 == 0) {
                    nombreAnt = mostrarTurno.getText();
                    siguiente = nombreSiguiente(nombreAnt);
                    mostrarTurno.setText(siguiente);
                } else if (mostrarTurno.getText().equals(nombre3) && ganar3 == 0) {
                    nombreAnt = mostrarTurno.getText();
                    siguiente = nombreSiguiente(nombreAnt);
                    mostrarTurno.setText(siguiente);
                } else {
                    nombreAnt = mostrarTurno.getText();
                    siguiente = nombreSiguiente(nombreAnt);
                    mostrarTurno.setText(siguiente);
                }
            } else {
                repetir = repetir - 1;
            }
        } else {
            nombreAnt = mostrarTurno.getText();
            if (repetir1 != 0 && nombreAnt.equals(nombre1)) {
                repetir1 = repetir1 - 1;
            }
            if (repetir2 != 0 && nombreAnt.equals(nombre2)) {
                repetir2 = repetir2 - 1;
            }
            if (repetir3 != 0 && nombreAnt.equals(nombre3)) {
                repetir3 = repetir3 - 1;
            }
            repetirAux = repetirAux - 1;
        }
        auxiliar++;
        if (auxiliar == 3) {
            ronda++;
            auxiliar = 0;
        }

        // esto es para saber el numero del jugador que le toca el turno, si es el jugador numero 1 el numero es 1
        if (nombreAnt.equals(nombre1)) {
            op = op1;
        } else if (nombreAnt.equals(nombre2)) {
            op = op2;
        } else if (nombreAnt.equals(nombre3)) {
            op = op3;
        }

        // y esto es por si el jugador saca 6 puede repetir turno
        if (num1 == 6 && ganar1 == 0 && nombreAnt.equals(nombre1) && repetir1 == 0) {
            repetir = 1;
            JOptionPane.showMessageDialog(null, nombreAnt + " saco 6 asi que repite turno");
        } else if (num1 == 6 && ganar2 == 0 && nombreAnt.equals(nombre2) && repetir2 == 0) {
            repetir = 1;
            JOptionPane.showMessageDialog(null, nombreAnt + " saco 6 asi que repite turno");
        } else if (num1 == 6 && ganar3 == 0 && nombreAnt.equals(nombre3) && repetir3 == 0) {
            repetir = 1;
            JOptionPane.showMessageDialog(null, nombreAnt + " saco 6 asi que repite turno");
        }

        // y aqui se llama a la funcion que recorre la lista circular y hace todas las debidas "operaciones"
        if (nombreAnt.equals(nombre1) && (ganar1 == 0 || repetir1 != 0)) {
            mostrarLista(ptr, num1, imagenIcono(nombreAnt), nombreAnt, ronda, op);
        } else if (nombreAnt.equals(nombre2) && (ganar2 == 0 || repetir2 != 0)) {
            mostrarLista(ptr, num1, imagenIcono(nombreAnt), nombreAnt, ronda, op);
        } else if (nombreAnt.equals(nombre3) && (ganar3 == 0 || repetir3 != 0)) {
            mostrarLista(ptr, num1, imagenIcono(nombreAnt), nombreAnt, ronda, op);
        }


    }//GEN-LAST:event_pararActionPerformed

    String ganador = "", segundo = "", tercero = "";
    int ganar1 = 0, ganar2 = 0, ganar3 = 0, repetir1 = 0, repetir2 = 0, repetir3 = 0, contador = 3;
    int repetirAux = 3;

    // esta funcion es la que recorre la lista y la recorre 3 veces, ya que lo queria un poco mas ordenado
    //esta en un try catch por si acaso 
    public Nodo mostrarLista(Nodo ptr, int salto, ImageIcon icono, String nombre, int ronda, int op) {
        try {
            Nodo ant = null;
            Nodo p = ptr;
            int cont = 0, cont2 = 0;
            boolean sw = false;
            int indicativo = 0;
            int posicion = 0;

            if (nombre.equals(nombre1)) {
                indicativo = 1;
            } else if (nombre.equals(nombre2)) {
                indicativo = 2;
            } else if (nombre.equals(nombre3)) {
                indicativo = 3;
            }

            //este es el primer recorrido de la lista
            //lo que hace es buscar la posicion donde quedo el jugador en su anterior turno
            //y poner su respectivo p.numero en false para que no aparazca el icono en ese boton
            do {

                if (indicativo == 1) {
                    if (p.numero1 == true && cont2 > 0) {
                        posicion = cont2;
                    }
                } else if (indicativo == 2) {
                    if (p.numero2 == true && cont2 > 0) {
                        posicion = cont2;
                    }
                } else if (indicativo == 3) {
                    if (p.numero3 == true && cont2 > 0) {
                        posicion = cont2;
                    }
                }

                if (indicativo == 1 && p.carcel1 == false) {
                    p.numero1 = false;
                } else if (indicativo == 2 && p.carcel2 == false) {
                    p.numero2 = false;
                } else if (indicativo == 3 && p.carcel3 == false) {
                    p.numero3 = false;
                }

                cont2++;
                p = p.link;

            } while (p != ptr);

            // el 2 recorrido de la lista y supongo que el mas importante
            //este mueve el jugador dependiendo lo que saco en el dado
            //si llega a la meta, hace que no pueda jugar mas
            //muestra el puesto que quedo el jugador
            //cuando ya los 3 jugadores terminaron manda a llamar a el podio para mostrar como quedaron
            //y verifica si un jugador esta en la carcel de darle los 3 turnos para sacar 6
            do {

                if ((cont == salto + posicion) && (salto + posicion >= 18)) {
                    if (p.pos >= 0 && p.pos <= 5 && nombre.equals(nombre1) && p.carcel1 == false) {

                        if (ganador.equals("")) {
                            ganador = nombre1;
                            JOptionPane.showMessageDialog(null, "El jugador llamado " + nombre1 + " quedo en primer lugar");
                        } else if (segundo.equals("")) {
                            segundo = nombre1;
                            JOptionPane.showMessageDialog(null, "El jugador llamado " + nombre1 + " quedo en segundo lugar");
                        } else {
                            tercero = nombre1;
                            JOptionPane.showMessageDialog(null, "El jugador llamado " + nombre1 + " quedo en tercer lugar");
                        }
                        ganar1 = 1;

                    } else if (p.pos >= 0 && p.pos <= 5 && nombre.equals(nombre2) && p.carcel2 == false) {

                        if (ganador.equals("")) {
                            ganador = nombre2;
                            JOptionPane.showMessageDialog(null, "El jugador llamado " + nombre2 + " quedo en primer lugar");
                        } else if (segundo.equals("")) {
                            segundo = nombre2;
                            JOptionPane.showMessageDialog(null, "El jugador llamado " + nombre2 + " quedo en segundo lugar");
                        } else {
                            tercero = nombre2;
                            JOptionPane.showMessageDialog(null, "El jugador llamado " + nombre2 + " quedo en tercer lugar");
                        }
                        ganar2 = 1;

                    } else if (p.pos >= 0 && p.pos <= 5 && nombre.equals(nombre3) && p.carcel3 == false) {

                        if (ganador.equals("")) {
                            ganador = nombre3;
                            JOptionPane.showMessageDialog(null, "El jugador llamado " + nombre3 + " quedo en primer lugar");
                        } else if (segundo.equals("")) {
                            segundo = nombre3;
                            JOptionPane.showMessageDialog(null, "El jugador llamado " + nombre3 + " quedo en segundo lugar");
                        } else {
                            tercero = nombre3;
                            JOptionPane.showMessageDialog(null, "El jugador llamado " + nombre3 + " quedo en tercer lugar");
                        }
                        ganar3 = 1;
                    }

                    if (ganar1 == 1 && ganar2 == 1 && ganar3 == 1) {
                        podio ui = new podio(ganador, segundo, tercero);
                        ui.setVisible(true);
                        this.setVisible(false);
                    }

                    if (ganar1 == 1) {
                        Nodo q = ptr;
                        do {
                            q.numero1 = false;
                            if (q.info.getIcon() == new ImageIcon(foto1)) {
                                q.info = null;
                            }
                            q = q.link;
                        } while (q != ptr);
                    }

                    if (ganar2 == 1) {
                        Nodo q = ptr;
                        do {
                            q.numero2 = false;
                            if (q.info.getIcon() == new ImageIcon(foto2)) {
                                q.info = null;
                            }
                            q = q.link;
                        } while (q != ptr);
                    }

                    if (ganar3 == 1) {
                        Nodo q = ptr;
                        do {
                            q.numero3 = false;
                            if (q.info.getIcon() == new ImageIcon(foto3)) {
                                q.info = null;
                            }
                            q = q.link;
                        } while (q != ptr);
                    }

                }
                if (cont == salto + posicion) {
                    if (nombre.equals(nombre1) && ptr.carcel1 == false) {
                        p.numero1 = true;
                        p.info.setIcon(icono);
                    } else if (nombre.equals(nombre2) && ptr.carcel2 == false) {
                        p.numero2 = true;
                        p.info.setIcon(icono);
                    } else if (nombre.equals(nombre3) && ptr.carcel3 == false) {
                        p.numero3 = true;
                        p.info.setIcon(icono);
                    } else {
                        contador = contador - 1;
                        JOptionPane.showMessageDialog(null, "El jugador llamado " + nombre + " sigue en la carcel " + " le quedan " + contador + " turnos");
                        if (contador == 0) {
                            contador = 3;
                        }
                    }

                    if (salto == 6 && ptr.carcel1 == true && indicativo == 1) {
                        ptr.carcel1 = false;
                        repetir1 = 0;
                        contador = 3;
                        JOptionPane.showMessageDialog(null, "El jugador 1 sale de la carcel, tire el dado");
                    } else if (salto == 6 && ptr.carcel2 == true && indicativo == 2) {
                        ptr.carcel2 = false;
                        repetir2 = 0;
                        contador = 3;
                        JOptionPane.showMessageDialog(null, "El jugador 2 sale de la carcel, tire el dado");
                    } else if (salto == 6 && ptr.carcel3 == true && indicativo == 3) {
                        ptr.carcel3 = false;
                        repetir3 = 0;
                        contador = 3;
                        JOptionPane.showMessageDialog(null, "El jugador 3 sale de la carcel, tire el dado");
                    }

                    if (p.numero1 == true && p.numero2 == true && indicativo == 1 && p.carcel2 == false) {
                        p.numero2 = false;
                        ptr.numero2 = true;
                        ptr.carcel2 = true;
                        repetir2 = 2;
                        //repetirAux = repetir2;
                        JOptionPane.showMessageDialog(null, "El jugador numero 2 se lo han comido , su ficha vuelve al inicio");
                    } else if (p.numero1 == true && p.numero2 == true && indicativo == 2 && p.carcel1 == false) {
                        p.numero1 = false;
                        ptr.numero1 = true;
                        ptr.carcel1 = true;
                        repetir1 = 2;
                        //repetirAux = repetir1;
                        JOptionPane.showMessageDialog(null, "El jugador numero 1 se lo han comido , su ficha vuelve al inicio");
                    } else if (p.numero1 == true && p.numero3 == true && indicativo == 1 && p.carcel3 == false) {
                        p.numero3 = false;
                        ptr.numero3 = true;
                        ptr.carcel3 = true;
                        repetir3 = 2;
                        //repetirAux = repetir3;
                        JOptionPane.showMessageDialog(null, "El jugador numero 3 se lo han comido , su ficha vuelve al inicio");
                    } else if (p.numero1 == true && p.numero3 == true && indicativo == 3 && p.carcel1 == false) {
                        p.numero1 = false;
                        ptr.numero1 = true;
                        ptr.carcel1 = true;
                        repetir1 = 2;
                        //repetirAux = repetir2;
                        JOptionPane.showMessageDialog(null, "El jugador numero 1 se lo han comido , su ficha vuelve al inicio");
                    } else if (p.numero2 == true && p.numero3 == true && indicativo == 2 && p.carcel3 == false) {
                        p.numero3 = false;
                        ptr.numero3 = true;
                        ptr.carcel3 = true;
                        repetir3 = 2;
                        //repetirAux = repetir3;
                        JOptionPane.showMessageDialog(null, "El jugador numero 3 se lo han comido , su ficha vuelve al inicio");
                    } else if (p.numero2 == true && p.numero3 == true && indicativo == 3 && p.carcel2 == false) {
                        p.numero2 = false;
                        ptr.numero2 = true;
                        ptr.carcel2 = true;
                        repetir2 = 2;
                        //repetirAux = repetir2;
                        JOptionPane.showMessageDialog(null, "El jugador numero 2 se lo han comido , su ficha vuelve al inicio");
                    }

                    if (ptr.carcel1 == true && repetir1 == 0 && !nombre.equals(nombre1)) {
                        repetir1 = 2;
                    }
                    if (ptr.carcel2 == true && repetir2 == 0 && !nombre.equals(nombre2)) {
                        repetir2 = 2;
                    }
                    if (ptr.carcel3 == true && repetir3 == 0 && !nombre.equals(nombre3)) {
                        repetir3 = 2;
                    }

                    sw = true;
                } else {
                    ant = p;
                    p = p.link;
                    cont++;
                }
            } while (sw == false);

            //el ultimo recorrido a la lista es simplemente para poder los debidos iconos
            //si un nodo no tiene ningun jugador en este no se pone nada y si lo tiene se pone su debido icono
            //y poner el icono de meta en la 1 posicion si no hay ningun jugador en este 
            p = ptr;
            do {

                if (ganar1 == 1) {
                    p.numero1 = false;
                }
                if (ganar2 == 1) {
                    p.numero2 = false;
                }
                if (ganar3 == 1) {
                    p.numero3 = false;
                }

                if (p.numero1 == p.numero2 && p.numero2 == p.numero3 && p.numero1 == true) {
                    botonPrimero.setIcon(new ImageIcon(fotoPrimero));
                    botonSegundo.setIcon(new ImageIcon(fotoSegundo));
                    botonTercero.setIcon(new ImageIcon(fotoTercero));
                } else if (p.numero1 == p.numero2 && p.numero1 == true) {
                    botonPrimero.setIcon(new ImageIcon(fotoPrimero));
                    botonSegundo.setIcon(new ImageIcon(fotoSegundo));
                    botonTercero.setIcon(null);
                } else if (p.numero1 == p.numero3 && p.numero1 == true) {
                    botonPrimero.setIcon(new ImageIcon(fotoPrimero));
                    botonTercero.setIcon(new ImageIcon(fotoTercero));
                    botonSegundo.setIcon(null);
                } else if (p.numero2 == p.numero3 && p.numero2 == true) {
                    botonSegundo.setIcon(new ImageIcon(fotoSegundo));
                    botonTercero.setIcon(new ImageIcon(fotoTercero));
                    botonPrimero.setIcon(null);
                } else if (p.numero3 == true && p.numero2 == p.numero1 && p.numero1 == false) {
                    p.info.setIcon(new ImageIcon(foto3));
                } else if (p.numero3 == p.numero1 && p.numero2 == p.numero1 && p.numero1 == false && p.pos == 1) {
                    p.info.setDisabledIcon(new ImageIcon("imagenes/META.jpg"));
                } else if (p.numero2 == true && p.numero3 == p.numero1 && p.numero1 == false) {
                    p.info.setIcon(new ImageIcon(foto2));
                } else if (p.numero1 == true && p.numero2 == p.numero3 && p.numero3 == false) {
                    p.info.setIcon(new ImageIcon(foto1));
                } else {
                    p.info.setIcon(null);
                }
                if (p.numero1 == false && p.numero2 == false && p.numero3 == false && p == ptr) {
                    p.info.setIcon(new ImageIcon("imagenes/META.jpg"));
                    botonPrimero.setIcon(null);
                    botonSegundo.setIcon(null);
                    botonTercero.setIcon(null);
                }
                if (p.numero1 == false && p.numero2 == false && p.numero3 == false && p != ptr) {
                    p.info.setIcon(null);
                }

                //agrag
                if (p == ptr && p.numero1 == false && p.numero2 == false) {
                    botonPrimero.setIcon(null);
                    botonSegundo.setIcon(null);
                }
                if (p == ptr && p.numero1 == false && p.numero3 == false) {
                    botonPrimero.setIcon(null);
                    botonTercero.setIcon(null);
                }
                if (p == ptr && p.numero2 == false && p.numero3 == false) {
                    botonTercero.setIcon(null);
                    botonSegundo.setIcon(null);
                }

                if (p == ptr && p.carcel1 == true && p.carcel2 == false && p.carcel3 == false) {
                    botonPrimero.setIcon(null);
                    botonSegundo.setIcon(null);
                    botonTercero.setIcon(null);
                }
                if (p == ptr && p.carcel2 == true && p.carcel1 == false && p.carcel3 == false) {
                    botonPrimero.setIcon(null);
                    botonSegundo.setIcon(null);
                    botonTercero.setIcon(null);
                }
                if (p == ptr && p.carcel3 == true && p.carcel2 == false && p.carcel1 == false) {
                    botonPrimero.setIcon(null);
                    botonSegundo.setIcon(null);
                    botonTercero.setIcon(null);
                }

                if (p == ptr && p.numero1 == true && p.numero2 == false && p.numero3 == false) {
                    p.info.setDisabledIcon(new ImageIcon(foto1));
                }
                if (p == ptr && p.numero2 == true && p.numero1 == false && p.numero3 == false) {
                    p.info.setDisabledIcon(new ImageIcon(foto2));
                }
                if (p == ptr && p.numero3 == true && p.numero2 == false && p.numero1 == false) {
                    p.info.setDisabledIcon(new ImageIcon(foto3));
                }

                if (p == ptr && p.numero1 == true && p.numero2 == true && p.numero3 == false) {
                    botonPrimero.setIcon(new ImageIcon(fotoPrimero));
                    botonSegundo.setIcon(new ImageIcon(fotoSegundo));
                    p.info.setIcon(null);
                }
                if (p == ptr && p.numero1 == true && p.numero3 == true && p.numero2 == false) {
                    botonPrimero.setIcon(new ImageIcon(fotoPrimero));
                    botonTercero.setIcon(new ImageIcon(fotoTercero));
                    p.info.setIcon(null);
                }
                if (p == ptr && p.numero2 == true && p.numero3 == true && p.numero1 == false) {
                    botonSegundo.setIcon(new ImageIcon(fotoSegundo));
                    botonTercero.setIcon(new ImageIcon(fotoTercero));
                    p.info.setIcon(null);
                }

                p = p.link;

            } while (p != ptr);

            ptr = p;
            return ptr;
        } catch (Exception i) {
            return ptr;
        }

    }


    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoActionPerformed

    private void boton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton18ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton1ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton11ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton12ActionPerformed

    private void boton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton13ActionPerformed

    private void boton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton14ActionPerformed

    private void boton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton15ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton10ActionPerformed

    private void boton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton16ActionPerformed

    private void boton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton17ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton6ActionPerformed

    private void botonPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrimeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPrimeroActionPerformed

    private void botonTerceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTerceroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonTerceroActionPerformed

    private void botonSegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSegundoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSegundoActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantalla().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton10;
    private javax.swing.JButton boton11;
    private javax.swing.JButton boton12;
    private javax.swing.JButton boton13;
    private javax.swing.JButton boton14;
    private javax.swing.JButton boton15;
    private javax.swing.JButton boton16;
    private javax.swing.JButton boton17;
    private javax.swing.JButton boton18;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonPrimero;
    private javax.swing.JButton botonSegundo;
    private javax.swing.JButton botonTercero;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblMostrarDado;
    private javax.swing.JTextField mostrarTurno;
    private javax.swing.JButton parar;
    private javax.swing.JButton tirar;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
