package com.company;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {

    JFrame frame;
    JLabel label;
    JSlider slider;
    JPanel panel;

    SliderDemo(){

        frame = new JFrame("slider");
        label = new JLabel();
        slider = new JSlider();
        panel = new JPanel();

        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.setFont(new Font("chiller",Font.BOLD,15));

        label.setFont(new Font("chiller",Font.BOLD,35));
        label.setText(slider.getValue()+" degree Celsius");

        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);

    }
    public void stateChanged(ChangeEvent e) {

        label.setText(slider.getValue()+" degree Celsius");
    }
}
