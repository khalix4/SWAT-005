package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class PhysicsUI {
    JFrame frame = new JFrame("Window");

    JButton speed = new JButton("SPEED");
    JTextField distance = new JTextField("Enter Distance");
    JTextField time = new JTextField("Enter Time");

    JButton force = new JButton("FORCE");
    JTextField mass = new JTextField("Enter MASS");
    JTextField acceleration = new JTextField("Enter Acceleration");

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

    public void main3UI() {
        frame.add(force);
        frame.add(force);
        frame.setSize(200, 200);
        frame.setLayout(new GridLayout(5, 1));
        frame.setVisible(true);

        force.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcforce();
            }
        });



    }


    JFrame frame3 = new JFrame("Window");
    Energy geo3 = new Energy();

    public void calcforce() {
        frame1.setSize(200, 200);
        frame1.setLayout(new GridLayout(5, 1));
        frame1.setVisible(true);
        frame1.add(mass);
        frame1.add(acceleration);
        frame1.add(calculate);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });


    }

    public void calculate2() {

        try {

            float force = geo.force(Float.parseFloat(mass.getText()), Float.parseFloat(acceleration.getText()));
            JOptionPane.showMessageDialog(null, force);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }



}







