

import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.ImageIcon;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author econo110
 */
public class crp extends javax.swing.JFrame {

    /**
     * Creates new form crp
     */
    public crp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btn_sis = new javax.swing.JButton();
        btn_rok = new javax.swing.JButton();
        btn_pap = new javax.swing.JButton();
        userInput = new javax.swing.JLabel();
        lab_res = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        btn_sis.setIcon(new javax.swing.ImageIcon("res/sis.png"));
        btn_sis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_sisMouseReleased(evt);
            }
        });
        btn_sis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sisActionPerformed(evt);
            }
        });
        
        btn_rok.setIcon(new javax.swing.ImageIcon("res/rok.png"));
        
        btn_rok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_rokMouseReleased(evt);
            }
        });
        btn_rok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rokActionPerformed(evt);
            }
        });


        btn_pap.setIcon(new javax.swing.ImageIcon("res/pap.png"));
        btn_pap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_papMouseReleased(evt);
            }
        });

        userInput.setIcon(new javax.swing.ImageIcon("res/firstDisp2.png")); // NOI18N
       
        lab_res.setIcon(new javax.swing.ImageIcon("res/firstRes2.jpg")); // NOI18N
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_sis, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(btn_rok, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_pap, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(lab_res, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab_res, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sis, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_pap, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addComponent(btn_rok, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>                                   

    private void btn_rokActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void btn_sisActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }      
    private void btn_papMouseEntered(java.awt.event.MouseEvent evt) {                                     
        btn_sis.setIcon(new ImageIcon("res.pap2.png"));
    }
    private void btn_sisMouseEntered(java.awt.event.MouseEvent evt) {                                     
        btn_sis.setIcon(new ImageIcon("res.sis2.png"));
    }                                    
    private void btn_rokMouseEntered(java.awt.event.MouseEvent evt) {                                     
        btn_sis.setIcon(new ImageIcon("res.rok2.png"));
    }                                    

    private void disp_Res(){
    	switch(Game.scanvalue) {
 		case 1:
 			userInput.setIcon(new ImageIcon("res/sis.png"));
 			switch(Game.clientvalue) {
 			case 1:
 				lab_res.setIcon(new ImageIcon("res/draw2.png"));
 				
 				break;
 			case 2:
 				lab_res.setIcon(new ImageIcon("res/lose2.png"));
 		        
 				break;	
 			case 3:
 				lab_res.setIcon(new ImageIcon("res/win2.png"));
 		        
 				break;
 			}
 			break;
 		case 2:
 			userInput.setIcon(new ImageIcon("res/rok.png"));
 	        
 			switch(Game.clientvalue) {
 			case 1:
 				lab_res.setIcon(new ImageIcon("res/win2.png"));
 		        
 				break;
 			case 2:
 				lab_res.setIcon(new ImageIcon("res/draw2.png"));
 				
 				break;
 			case 3:
 				lab_res.setIcon(new ImageIcon("res/lose2.png"));
 				
 				break;
 			}
 			break;
 		case 3:
 			userInput.setIcon(new ImageIcon("res/pap.png"));
 	        
 			switch(Game.clientvalue) {
 			case 1:
 				lab_res.setIcon(new ImageIcon("res/lose2.png"));
 				
 				break;
 			case 2:
 				lab_res.setIcon(new ImageIcon("res/win2.png"));
 		        
 				break;
 			case 3:
 				lab_res.setIcon(new ImageIcon("res/draw2.png"));
 				
 				break;
 			}		
 			break;
 		}
    }
    
    
    
    private void btn_sisMouseReleased(java.awt.event.MouseEvent evt) {                                      



        Game.valueInput(1);

	    while(Game.clientvalue==0){
	    	try{
	    		Thread.sleep(1000);
	    	}catch(InterruptedException e){
	    		System.out.println(e.getMessage());
	    	}
	    }
	    disp_Res();
    }                                     

    private void btn_rokMouseReleased(java.awt.event.MouseEvent evt) {

    	Game.valueInput(2);

    	while(Game.clientvalue==0){
	    	try{
	    		Thread.sleep(1000);
	    	}catch(InterruptedException e){
	    		System.out.println(e.getMessage());
	    	}
	    }
    	disp_Res();
    }                                     

    private void btn_papMouseReleased(java.awt.event.MouseEvent evt) {                                      

        Game.valueInput(3);

        while(Game.clientvalue==0){
	    	try{
	    		Thread.sleep(1000);
	    	}catch(InterruptedException e){
	    		System.out.println(e.getMessage());
	    	}
	    }
        disp_Res();
    }


    public static void main(String args[]) {

    	ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(7777);
            System.out.println("가위바위보 클라이언트 연결 대기 중...");

            socket = serverSocket.accept();
            System.out.println("가위바위보 클라이언트 연결됨...");

            Game game = new Game(socket);

            Sender sender = new Sender(socket);
            Receiver receiver = new Receiver(socket);

            sender.start();
            receiver.start();


        } catch (Exception e) {
        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(crp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crp().setVisible(true);
            }
        });
    }


    private javax.swing.JButton btn_pap;
    private javax.swing.JButton btn_rok;
    private javax.swing.JButton btn_sis;
    private javax.swing.JLabel lab_res;
    private javax.swing.JLabel userInput;

}

