package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class PhysicsUI {
    JFrame frame = new JFrame("Window");

    JButton speed = new JButton("SPEED");



    JButton ForceBtn = new JButton("Force");

    //JButton potentialEnergy = new JButton("POTENTIAL ENERGY");

    //add more button


    JTextField distance = new JTextField("Enter Distance");

    JTextField time = new JTextField("Enter Time");


    JButton calculate = new JButton("calculate");

    public void mainUI() {
        frame.add(speed);
        frame.add(speed);
        frame.setSize(200, 200);
        frame.setLayout(new GridLayout(5, 1));
        frame.setVisible(true);

        speed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcspeed();
            }
        });


    }


    JFrame frame1 = new JFrame("Window");
    Energy geo = new Energy();

    public void calcspeed() {
        frame1.setSize(200, 200);
        frame1.setLayout(new GridLayout(5, 1));
        frame1.setVisible(true);
        frame1.add(distance);
        frame1.add(time);
        frame1.add(calculate);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });


    }

    public void calculate() {

        try {

            float speed = geo.speed(Float.parseFloat(distance.getText()), Float.parseFloat(time.getText()));
            JOptionPane.showMessageDialog(null, speed);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }

    JFrame frame2 = new JFrame("Window");

    JButton pressure = new JButton("Pressure");

    JTextField force = new JTextField("Force=");
    JTextField area= new JTextField("Area=");



    JButton Calculate = new JButton("Calculate");

    public void main2UI() {
        frame2.add(pressure);
        frame2.setSize(200, 200);
        frame2.setLayout(new GridLayout(5, 1));
        frame2.setVisible(true);

        pressure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcpressure();
            }
        });

    }

    JFrame frame3 = new JFrame("Window");
    Energy man = new Energy();

    public void calcpressure() {
        frame3.setSize(200, 200);
        frame3.setLayout(new GridLayout(5, 1));
        frame3.setVisible(true);
        frame3.add(force);
        frame3.add(area);
        frame3.add(calculate);

        Calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {Calculate();}
        });

    }
    public void Calculate() {

        try {

            float pressure = man.pressure(Float.parseFloat(force.getText()), Float.parseFloat(area.getText()));
            JOptionPane.showMessageDialog(null, pressure);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }
}



