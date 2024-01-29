package com.edc.restaurant.agents;

import com.edc.restaurant.models.Product;
import jade.core.Agent;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import java.math.BigDecimal;
import javax.swing.JOptionPane;

public class MiAgente extends Agent {

    protected void setup() {
        Product p = new Product("Ham", BigDecimal.valueOf(8.99), "kfbsjhdfbbhksbdjkh","fsjdb");
        JOptionPane.showMessageDialog(null, p.toString());
    }

    protected void takeDown() {
        System.out.println("Agente " + getLocalName() + " terminando.");
    }

    public static void main(String[] args) {
        jade.core.Runtime rt = jade.core.Runtime.instance();
        Profile p = new ProfileImpl();
        ContainerController cc = rt.createMainContainer(p);

        try {
            AgentController ac = cc.createNewAgent("MiAgente", "MiAgente", null);
            ac.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

