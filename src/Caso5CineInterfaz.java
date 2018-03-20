import javax.swing.*;
import java.awt.*;


//REYES HUERTA JOSE ENRIQUE
//TOPICOS AVANZADOS DE PROGRAMACIÓN

public class Caso5CineInterfaz extends JFrame {
    public JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    private JPanel panelimagen;
    private JPanel panelcaja1;
    private JPanel paneldinero;
    private JPanel panelsillasdelareserva;
    private JPanel panelreserva;
    private JPanel panelpagarreserva;
    private JPanel panelmanejotarjetas;
    private JPanel panelcaja2;
    private JPanel panelsala;
    private JPanel panelhacientos;
    private JPanel panelopciones;
    private JTextField escdinero;
    private JTextField mostrarsillas;

    public Caso5CineInterfaz()

    {
//declaramos el managerlayout del frame (pantalla general)
        this.setLayout(new BorderLayout());
//creacion de los paneles

        panelimagen = new JPanel();
        panelcaja1 = new JPanel();
        paneldinero = new JPanel();
        panelsillasdelareserva = new JPanel();
        panelreserva = new JPanel();
        panelpagarreserva = new JPanel();
        panelmanejotarjetas = new JPanel();
        panelcaja2 = new JPanel();
        panelsala = new JPanel();
        panelhacientos = new JPanel();
        panelopciones = new JPanel();

        //ACOMODAMOS LOS PANELES EN EL FRAME
        this.add(panelimagen,BorderLayout.NORTH);
        //this.add(panelcaja,BorderLayout.SOUTH) ;
        this.add(panelcaja1,BorderLayout.WEST);
        //((JPanel)panelcaja1).setBorder(BorderFactory.createTitledBorder("panel caja 1"));
        this.add(panelcaja2,BorderLayout.CENTER);
        ((JPanel)panelcaja2).setBorder(BorderFactory.createTitledBorder("Sala"));

        //creacion de los componentes
        b1 = new JButton("boton uno");
        b2 = new JButton("boton dos");
        b3 = new JButton("boton tres");
        b4 = new JButton("boton cuatro");
        b5 = new JButton("Eliminar");
        b6 = new JButton("Guardar Reserva");
        b7 = new JButton("Cargar Reserva");
        b8 = new JButton("Pagar en efectivo");
        b9 = new JButton("Pagar con tarjeta");
        b10 = new JButton("Crear tarjeta");
        b11 = new JButton("Recargar tarjeta");
        b12 = new JButton("H");
        b13 = new JButton("Opción 1");
        b14 = new JButton("Opción 2");
        b15 = new JButton("Seleccionar silla");


        JLabel pantalla = new JLabel("Pantalla ");
        pantalla.setBounds(10,20,30,30);
        // panelPrincipal.add(lblUsr);

        JLabel totaldinero = new JLabel("Total de dinero en la caja: ");
        totaldinero.setBounds(10,20,30,30);
        escdinero = new JTextField();
        escdinero.setBounds(120, 20, 150, 30);
        //panelPrincipal.add(e);

        JLabel selecsilla = new JLabel("Seleccionar silla: ");
        selecsilla.setBounds(10,20,30,30);

        JLabel sillasreser = new JLabel("Sillas reservadas: ");
        sillasreser.setBounds(10,20,30,30);

        //componenetes COMBOX
        String[] opStrings = { "Generel", "VIP" };
        //Create the combo box, select the item at index 4.
        //Indices start at 0, so 4 specifies the pig.
        JComboBox optList1 = new JComboBox(opStrings);
        //JLabel lbltext = new JLabel();

        mostrarsillas = new JTextField();
        mostrarsillas.setBounds(120, 20, 150, 150);

        String[] letStrings = { "A", "B","C","..." };
        //Create the combo box, select the item at index 4.
        //Indices start at 0, so 4 specifies the pig.
        JComboBox lettList1 = new JComboBox(letStrings);
        //JLabel lbltext = new JLabel();

        String[] numStrings = { "1", "2","3","..." };
        //Create the combo box, select the item at index 4.
        //Indices start at 0, so 4 specifies the pig.
        JComboBox numtList1 = new JComboBox(numStrings);
        //JLabel lbltext = new JLabel();



        JLabel picture = new JLabel(new ImageIcon("src/titulo.jpg"));

        //LE ASIGNAMOS EL MANAGER LAYOUT A CADA PANEL

        panelimagen.setLayout(new GridLayout(1,2,5,10));
        panelcaja1.setLayout(new GridLayout(5,0,5,10));
        paneldinero.setLayout(new BorderLayout());
        ((JPanel)paneldinero).setBorder(BorderFactory.createTitledBorder(" Dinero"));
        panelsillasdelareserva.setLayout(new GridLayout(3,2,5,10));
        ((JPanel)panelsillasdelareserva).setBorder(BorderFactory.createTitledBorder("Sillas de la reserva"));
        panelreserva.setLayout(new BorderLayout());
        ((JPanel)panelreserva).setBorder(BorderFactory.createTitledBorder("Reserva"));
        panelpagarreserva.setLayout(new BorderLayout());
        ((JPanel)panelpagarreserva).setBorder(BorderFactory.createTitledBorder("Pagar reserva"));
        panelmanejotarjetas.setLayout(new BorderLayout());
        ((JPanel)panelmanejotarjetas).setBorder(BorderFactory.createTitledBorder("Manejo tarjetas"));
        panelsala.setLayout(new BorderLayout());
        panelhacientos.setLayout(new GridLayout(10,15));
        panelopciones.setLayout(new BorderLayout());
        ((JPanel)panelopciones).setBorder(BorderFactory.createTitledBorder("Opciones"));
        //((JPanel)panelsala).setBorder(BorderFactory.createTitledBorder("Sala"));
        //MODIFICACIONES A PANEL IMAGEN
        panelimagen.add(picture);
        //panelimagen.add(b1);
        //panelimagen.add(b2);

        //MODIFICACIONES A PANEL CAJA 1
        //((JPanel)panelcaja1).setBorder(BorderFactory.createTitledBorder("panel caja 1"));

        //ADHERIMOS LOS PANELES AL PANEL CAJA 1
        panelcaja1.add(paneldinero);
        paneldinero.add(totaldinero,BorderLayout.WEST);
        paneldinero.add(escdinero,BorderLayout.CENTER);

        panelcaja1.add(panelsillasdelareserva);
        panelsillasdelareserva.add(selecsilla);
        panelsillasdelareserva.add(sillasreser);
        panelsillasdelareserva.add(optList1);
        panelsillasdelareserva.add(numtList1);
        panelsillasdelareserva.add(lettList1);
        panelsillasdelareserva.add(b15);

        panelcaja1.add(panelreserva);
        panelreserva.add(b5,BorderLayout.WEST);
        panelreserva.add(b6,BorderLayout.CENTER);
        panelreserva.add(b7,BorderLayout.EAST);

        panelcaja1.add(panelpagarreserva);
        panelpagarreserva.add(b8,BorderLayout.WEST);
        panelpagarreserva.add(b9,BorderLayout.EAST);

        panelcaja1.add(panelmanejotarjetas);
        panelmanejotarjetas.add(b10,BorderLayout.WEST);
        panelmanejotarjetas.add(b11,BorderLayout.EAST);

        panelcaja2.add(panelsala);
        panelsala.add(pantalla,BorderLayout.NORTH);

        panelcaja2.add(panelhacientos);
        for(int i=0;i<10;i++){
            for(int j=0;j<9;j++){
                panelhacientos.add(new JButton(i+" x " + j));}}


        panelcaja2.add(panelopciones);
        panelopciones.add(b13,BorderLayout.WEST);
        panelopciones.add(b14,BorderLayout.EAST);


    }
    public static void main(String[] args) {
        Caso5CineInterfaz ventana = new Caso5CineInterfaz();
        ventana.setVisible(true);
        ventana.setBounds(100,0,950,725);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
    }


}

