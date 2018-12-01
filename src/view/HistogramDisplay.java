/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Usuario
 */

import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.ui.ApplicationFrame;
import java.awt.Dimension;
import javax.swing.JPanel;
import model.Histogram;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class HistogramDisplay extends ApplicationFrame {
    private final Histogram<String> histogram;
    public HistogramDisplay(Histogram<String> histogram) {
        super("HISTOGRAM");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
    }
    public void execute(){
        setVisible(true);
    }
    private JPanel createPanel(){
        
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart"
            ,"Dominios email","Nº de emails", dataSet,
            PlotOrientation.VERTICAL,false,false,rootPaneCheckingEnabled);
    
    return chart;
    }
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset() ;
        /*dataSet.addValue(3, "", "hotmail.com");
        dataSet.addValue(16, "", "outlook.es");
        dataSet.addValue(7, "", "ulpgc.es");
        dataSet.addValue(9, "", "gmail.com");
         */

        histogram.keySet().forEach((key) -> {
            dataSet.addValue(histogram.get(key),"",key);
        });
        return dataSet;
    }
}