package replacer;

import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Koutei_Cheke
 * @version 0.05a
 */
public class Replacer extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loadedFileSelector = new javax.swing.JFileChooser();
        savedFileSelector = new javax.swing.JFileChooser();
        aboutReplacer = new javax.swing.JFrame();
        iconoApp = new javax.swing.JLabel();
        replacer = new javax.swing.JLabel();
        creador = new javax.swing.JLabel();
        imagenCC = new javax.swing.JLabel();
        licence = new javax.swing.JLabel();
        version = new javax.swing.JLabel();
        groupBar = new javax.swing.ButtonGroup();
        replace = new javax.swing.JButton();
        separate = new javax.swing.JSeparator();
        emptyLabel = new javax.swing.JLabel();
        deleteAll = new javax.swing.JToggleButton();
        bar = new javax.swing.JToolBar();
        newFile = new javax.swing.JButton();
        loadOnBar = new javax.swing.JButton();
        saveOnBar = new javax.swing.JButton();
        menuSeparator = new javax.swing.JToolBar.Separator();
        styleActor = new javax.swing.JButton();
        actorStyle = new javax.swing.JButton();
        menuSeparator3 = new javax.swing.JToolBar.Separator();
        deleteTags = new javax.swing.JButton();
        putTranslators = new javax.swing.JButton();
        menuSeparator4 = new javax.swing.JToolBar.Separator();
        putThoughtsTags = new javax.swing.JButton();
        putFlashbacksTags = new javax.swing.JButton();
        putRadioTags = new javax.swing.JButton();
        putItalicTags = new javax.swing.JButton();
        putBlurTags = new javax.swing.JButton();
        putOnTopTags = new javax.swing.JButton();
        putAll = new javax.swing.JButton();
        mediumSeparator = new javax.swing.JSeparator();
        imageReplacer = new javax.swing.JLabel();
        inside = new javax.swing.JPanel();
        firstField = new javax.swing.JLabel();
        secondField = new javax.swing.JLabel();
        thirdField = new javax.swing.JLabel();
        fourthField = new javax.swing.JLabel();
        fifthField = new javax.swing.JLabel();
        sixthField = new javax.swing.JLabel();
        seventhField = new javax.swing.JLabel();
        eighthField = new javax.swing.JLabel();
        ninthField = new javax.swing.JLabel();
        tenthField = new javax.swing.JLabel();
        oneLeft = new javax.swing.JTextField();
        twoLeft = new javax.swing.JTextField();
        threeLeft = new javax.swing.JTextField();
        fourLeft = new javax.swing.JTextField();
        fiveLeft = new javax.swing.JTextField();
        sixLeft = new javax.swing.JTextField();
        sevenLeft = new javax.swing.JTextField();
        eightLeft = new javax.swing.JTextField();
        nineLeft = new javax.swing.JTextField();
        tenLeft = new javax.swing.JTextField();
        oneRight = new javax.swing.JTextField();
        twoRight = new javax.swing.JTextField();
        threeRight = new javax.swing.JTextField();
        fourRight = new javax.swing.JTextField();
        fiveRight = new javax.swing.JTextField();
        sixRight = new javax.swing.JTextField();
        sevenRight = new javax.swing.JTextField();
        eightRight = new javax.swing.JTextField();
        nineRight = new javax.swing.JTextField();
        tenRight = new javax.swing.JTextField();
        fieldOne = new javax.swing.JButton();
        twoField = new javax.swing.JButton();
        threeField = new javax.swing.JButton();
        fourField = new javax.swing.JButton();
        fieldFive = new javax.swing.JButton();
        sixField = new javax.swing.JButton();
        sevenField = new javax.swing.JButton();
        eightField = new javax.swing.JButton();
        nineField = new javax.swing.JButton();
        tenField = new javax.swing.JButton();
        oneDown = new javax.swing.JButton();
        oneUp = new javax.swing.JButton();
        searchLabel = new javax.swing.JTextField();
        replaceLabel = new javax.swing.JTextField();
        replacerSeparator = new javax.swing.JSeparator();
        superiorSeparator = new javax.swing.JSeparator();
        textBox = new javax.swing.JTextField();
        menu = new javax.swing.JMenuBar();
        fileBar = new javax.swing.JMenu();
        newOnMenu = new javax.swing.JMenuItem();
        load = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        saveAs = new javax.swing.JMenuItem();
        firstMenuSeparator = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();
        content = new javax.swing.JMenuItem();
        menuSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuAbout = new javax.swing.JMenuItem();

        loadedFileSelector.setCurrentDirectory(new java.io.File("C:\\Program Files\\NetBeans 8.2\\<user code>"));
        loadedFileSelector.setFileHidingEnabled(true);
        loadedFileSelector.setAlignmentX(1.0F);
        loadedFileSelector.setAlignmentY(1.0F);
        loadedFileSelector.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loadedFileSelector.setDragEnabled(true);
        loadedFileSelector.setFocusCycleRoot(true);
        loadedFileSelector.setInheritsPopupMenu(true);
        loadedFileSelector.setMinimumSize(new java.awt.Dimension(551, 342));
        loadedFileSelector.setName("Elegir archivo a cargar..."); // NOI18N
        loadedFileSelector.setPreferredSize(new java.awt.Dimension(551, 342));

        savedFileSelector.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        savedFileSelector.setCurrentDirectory(new java.io.File("C:\\Program Files\\NetBeans 8.2\\<user code>"));
        savedFileSelector.setFileHidingEnabled(true);
        savedFileSelector.setAlignmentX(1.0F);
        savedFileSelector.setAlignmentY(1.0F);
        savedFileSelector.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        savedFileSelector.setDragEnabled(true);
        savedFileSelector.setFocusCycleRoot(true);
        savedFileSelector.setInheritsPopupMenu(true);
        savedFileSelector.setMinimumSize(new java.awt.Dimension(551, 342));
        savedFileSelector.setName("Elegir archivo a cargar..."); // NOI18N
        savedFileSelector.setPreferredSize(new java.awt.Dimension(551, 342));

        aboutReplacer.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        aboutReplacer.setIconImage(getIconImage());
        aboutReplacer.setMinimumSize(new java.awt.Dimension(207, 223));
        aboutReplacer.setResizable(false);

        iconoApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Iconopequeño.png"))); // NOI18N

        replacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/replacerblanco.png"))); // NOI18N

        creador.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        creador.setText("Aplicación creada por Koutei_Cheke.");

        imagenCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/by-nc.eu_petit.png"))); // NOI18N

        licence.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        licence.setText("Bajo licencia Creative Commons.");

        version.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        version.setText("Versión v0.05a ");

        setLocationRelativeTo(null);

        javax.swing.GroupLayout aboutReplacerLayout = new javax.swing.GroupLayout(aboutReplacer.getContentPane());
        aboutReplacer.getContentPane().setLayout(aboutReplacerLayout);
        aboutReplacerLayout.setHorizontalGroup(
            aboutReplacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutReplacerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aboutReplacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(replacer)
                    .addGroup(aboutReplacerLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(iconoApp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imagenCC))
                    .addGroup(aboutReplacerLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(licence))
                    .addComponent(creador)
                    .addGroup(aboutReplacerLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(version)))
                .addContainerGap())
        );
        aboutReplacerLayout.setVerticalGroup(
            aboutReplacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutReplacerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(replacer, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(creador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(licence)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(version)
                .addGap(18, 18, 18)
                .addGroup(aboutReplacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagenCC)
                    .addComponent(iconoApp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Replacer · v0.05a");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(360, 350));
        setPreferredSize(new java.awt.Dimension(360, 350));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        replace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_autorenew_black_18dp.png"))); // NOI18N
        replace.setToolTipText("Reemplazar");
        replace.setBorder(null);
        replace.setBorderPainted(false);
        replace.setContentAreaFilled(false);
        replace.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        replace.setFocusPainted(false);
        replace.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        replace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceActionPerformed(evt);
            }
        });

        emptyLabel.setToolTipText("");

        deleteAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_delete_forever_black_48dp.png"))); // NOI18N
        deleteAll.setToolTipText("Borrar todo");
        deleteAll.setBorder(null);
        deleteAll.setBorderPainted(false);
        deleteAll.setContentAreaFilled(false);
        deleteAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteAll.setFocusPainted(false);
        deleteAll.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAllActionPerformed(evt);
            }
        });

        bar.setFloatable(false);
        bar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        newFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_insert_drive_file_black_15px.png"))); // NOI18N
        newFile.setToolTipText("Borrar todo");
        newFile.setBorderPainted(false);
        newFile.setContentAreaFilled(false);
        newFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newFile.setFocusable(false);
        newFile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newFile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        bar.add(newFile);

        loadOnBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_unarchive_black_18px.png"))); // NOI18N
        loadOnBar.setToolTipText("Cargar");
        loadOnBar.setBorderPainted(false);
        loadOnBar.setContentAreaFilled(false);
        loadOnBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loadOnBar.setFocusable(false);
        loadOnBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loadOnBar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        loadOnBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadOnBarActionPerformed(evt);
            }
        });
        bar.add(loadOnBar);

        saveOnBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_save_18px.png"))); // NOI18N
        saveOnBar.setToolTipText("Guardar");
        saveOnBar.setBorderPainted(false);
        saveOnBar.setContentAreaFilled(false);
        saveOnBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveOnBar.setFocusable(false);
        saveOnBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveOnBar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        saveOnBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveOnBarActionPerformed(evt);
            }
        });
        bar.add(saveOnBar);
        bar.add(menuSeparator);

        styleActor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_estiloActor_black_px.png"))); // NOI18N
        styleActor.setToolTipText("Copia el campo «estilo» al de «actor»");
        styleActor.setBorderPainted(false);
        styleActor.setContentAreaFilled(false);
        styleActor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        styleActor.setFocusable(false);
        styleActor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        styleActor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        styleActor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                styleActorActionPerformed(evt);
            }
        });
        bar.add(styleActor);

        actorStyle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_actorEstilo_black_px.png"))); // NOI18N
        actorStyle.setToolTipText("Copia el campo «actor» al de «estilo»");
        actorStyle.setBorderPainted(false);
        actorStyle.setContentAreaFilled(false);
        actorStyle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        actorStyle.setFocusable(false);
        actorStyle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        actorStyle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        actorStyle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actorStyleActionPerformed(evt);
            }
        });
        bar.add(actorStyle);
        bar.add(menuSeparator3);

        deleteTags.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_etiquetas_black_px.png"))); // NOI18N
        deleteTags.setToolTipText("Borra todas las etiquetas");
        deleteTags.setBorderPainted(false);
        deleteTags.setContentAreaFilled(false);
        deleteTags.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteTags.setFocusable(false);
        deleteTags.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteTags.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deleteTags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTagsActionPerformed(evt);
            }
        });
        bar.add(deleteTags);

        putTranslators.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_ponEtiquetas_black_px.png"))); // NOI18N
        putTranslators.setToolTipText("Coloca las etiquetas para traducir");
        putTranslators.setBorderPainted(false);
        putTranslators.setContentAreaFilled(false);
        putTranslators.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        putTranslators.setFocusable(false);
        putTranslators.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        putTranslators.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        putTranslators.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putTranslatorsActionPerformed(evt);
            }
        });
        bar.add(putTranslators);
        bar.add(menuSeparator4);

        putThoughtsTags.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_cloud_circle_black_18px.png"))); // NOI18N
        putThoughtsTags.setToolTipText("Coloca las etiquetas de pensamiento");
        putThoughtsTags.setBorderPainted(false);
        putThoughtsTags.setContentAreaFilled(false);
        putThoughtsTags.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        putThoughtsTags.setFocusable(false);
        putThoughtsTags.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        putThoughtsTags.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        putThoughtsTags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putThoughtsTagsActionPerformed(evt);
            }
        });
        bar.add(putThoughtsTags);

        putFlashbacksTags.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_flash_on_black_18px.png"))); // NOI18N
        putFlashbacksTags.setToolTipText("Coloca las etiquetas de flashback");
        putFlashbacksTags.setBorderPainted(false);
        putFlashbacksTags.setContentAreaFilled(false);
        putFlashbacksTags.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        putFlashbacksTags.setFocusable(false);
        putFlashbacksTags.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        putFlashbacksTags.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        putFlashbacksTags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putFlashbacksTagsActionPerformed(evt);
            }
        });
        bar.add(putFlashbacksTags);

        putRadioTags.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_radio_black_18dp.png"))); // NOI18N
        putRadioTags.setToolTipText("Coloca las etiquetas de radio");
        putRadioTags.setBorderPainted(false);
        putRadioTags.setContentAreaFilled(false);
        putRadioTags.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        putRadioTags.setFocusable(false);
        putRadioTags.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        putRadioTags.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        putRadioTags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putRadioTagsActionPerformed(evt);
            }
        });
        bar.add(putRadioTags);

        putItalicTags.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_format_italic_18px.png"))); // NOI18N
        putItalicTags.setToolTipText("Coloca las etiquetas de cursivar");
        putItalicTags.setBorderPainted(false);
        putItalicTags.setContentAreaFilled(false);
        putItalicTags.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        putItalicTags.setFocusable(false);
        putItalicTags.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        putItalicTags.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        putItalicTags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putItalicTagsActionPerformed(evt);
            }
        });
        bar.add(putItalicTags);

        putBlurTags.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_blur_on_black_18px.png"))); // NOI18N
        putBlurTags.setToolTipText("Coloca las etiquetas de difuminado");
        putBlurTags.setBorderPainted(false);
        putBlurTags.setContentAreaFilled(false);
        putBlurTags.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        putBlurTags.setFocusable(false);
        putBlurTags.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        putBlurTags.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        putBlurTags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putBlurTagsActionPerformed(evt);
            }
        });
        bar.add(putBlurTags);

        putOnTopTags.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_arrow_upward_18px.png"))); // NOI18N
        putOnTopTags.setToolTipText("Coloca las etiquetas de arriba");
        putOnTopTags.setBorderPainted(false);
        putOnTopTags.setContentAreaFilled(false);
        putOnTopTags.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        putOnTopTags.setFocusable(false);
        putOnTopTags.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        putOnTopTags.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        putOnTopTags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putOnTopTagsActionPerformed(evt);
            }
        });
        bar.add(putOnTopTags);

        putAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_autorenew_black_18px.png"))); // NOI18N
        putAll.setToolTipText("Coloca todas las etiquetas");
        putAll.setBorderPainted(false);
        putAll.setContentAreaFilled(false);
        putAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        putAll.setFocusable(false);
        putAll.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        putAll.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        putAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putAllActionPerformed(evt);
            }
        });
        bar.add(putAll);

        imageReplacer.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        imageReplacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/replacer.png"))); // NOI18N
        imageReplacer.setMinimumSize(new java.awt.Dimension(182, 70));

        firstField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        firstField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_filter_1_black_18px.png"))); // NOI18N

        secondField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        secondField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_filter_2_black_18px.png"))); // NOI18N

        thirdField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        thirdField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_filter_3_black_18px.png"))); // NOI18N

        fourthField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        fourthField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_filter_4_black_18px.png"))); // NOI18N

        fifthField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        fifthField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_filter_5_black_18px.png"))); // NOI18N

        sixthField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        sixthField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_filter_6_black_18px.png"))); // NOI18N

        seventhField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        seventhField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_filter_7_black_18px.png"))); // NOI18N

        eighthField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        eighthField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_filter_8_black_18px.png"))); // NOI18N

        ninthField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        ninthField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_filter_9_black_18px.png"))); // NOI18N

        tenthField.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tenthField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_filter_10_black_18px.png"))); // NOI18N

        fieldOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_backspace_black_18px.png"))); // NOI18N
        fieldOne.setBorder(null);
        fieldOne.setBorderPainted(false);
        fieldOne.setContentAreaFilled(false);
        fieldOne.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fieldOne.setFocusPainted(false);
        fieldOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldOneActionPerformed(evt);
            }
        });

        twoField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_backspace_black_18px.png"))); // NOI18N
        twoField.setBorder(null);
        twoField.setBorderPainted(false);
        twoField.setContentAreaFilled(false);
        twoField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoFieldActionPerformed(evt);
            }
        });

        threeField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_backspace_black_18px.png"))); // NOI18N
        threeField.setBorder(null);
        threeField.setBorderPainted(false);
        threeField.setContentAreaFilled(false);
        threeField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        threeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeFieldActionPerformed(evt);
            }
        });

        fourField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_backspace_black_18px.png"))); // NOI18N
        fourField.setBorder(null);
        fourField.setBorderPainted(false);
        fourField.setContentAreaFilled(false);
        fourField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fourField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourFieldActionPerformed(evt);
            }
        });

        fieldFive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_backspace_black_18px.png"))); // NOI18N
        fieldFive.setBorder(null);
        fieldFive.setBorderPainted(false);
        fieldFive.setContentAreaFilled(false);
        fieldFive.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fieldFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldFiveActionPerformed(evt);
            }
        });

        sixField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_backspace_black_18px.png"))); // NOI18N
        sixField.setBorder(null);
        sixField.setBorderPainted(false);
        sixField.setContentAreaFilled(false);
        sixField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sixField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixFieldActionPerformed(evt);
            }
        });

        sevenField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_backspace_black_18px.png"))); // NOI18N
        sevenField.setBorder(null);
        sevenField.setBorderPainted(false);
        sevenField.setContentAreaFilled(false);
        sevenField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sevenField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenFieldActionPerformed(evt);
            }
        });

        eightField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_backspace_black_18px.png"))); // NOI18N
        eightField.setBorder(null);
        eightField.setBorderPainted(false);
        eightField.setContentAreaFilled(false);
        eightField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eightField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightFieldActionPerformed(evt);
            }
        });

        nineField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_backspace_black_18px.png"))); // NOI18N
        nineField.setBorder(null);
        nineField.setBorderPainted(false);
        nineField.setContentAreaFilled(false);
        nineField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nineField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineFieldActionPerformed(evt);
            }
        });

        tenField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_backspace_black_18px.png"))); // NOI18N
        tenField.setBorder(null);
        tenField.setBorderPainted(false);
        tenField.setContentAreaFilled(false);
        tenField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tenField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenFieldActionPerformed(evt);
            }
        });

        oneDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_add_box_black_20px.png"))); // NOI18N
        oneDown.setBorder(null);
        oneDown.setBorderPainted(false);
        oneDown.setContentAreaFilled(false);
        oneDown.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oneDown.setFocusPainted(false);
        oneDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneDownActionPerformed(evt);
            }
        });

        oneUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_indeterminate_check_box_black_18px.png"))); // NOI18N
        oneUp.setBorder(null);
        oneUp.setBorderPainted(false);
        oneUp.setContentAreaFilled(false);
        oneUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oneUp.setFocusPainted(false);
        oneUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneUpActionPerformed(evt);
            }
        });

        searchLabel.setEditable(false);
        searchLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        searchLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchLabel.setText("Buscar");
        searchLabel.setBorder(null);

        replaceLabel.setEditable(false);
        replaceLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        replaceLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        replaceLabel.setText("Reemplazar");
        replaceLabel.setBorder(null);

        javax.swing.GroupLayout insideLayout = new javax.swing.GroupLayout(inside);
        inside.setLayout(insideLayout);
        insideLayout.setHorizontalGroup(
            insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(insideLayout.createSequentialGroup()
                        .addGroup(insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(insideLayout.createSequentialGroup()
                                .addComponent(secondField)
                                .addGap(10, 10, 10)
                                .addComponent(twoLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(twoRight, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(insideLayout.createSequentialGroup()
                                .addComponent(thirdField)
                                .addGap(10, 10, 10)
                                .addComponent(threeLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(threeRight, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(insideLayout.createSequentialGroup()
                                .addComponent(fourthField)
                                .addGap(10, 10, 10)
                                .addComponent(fourLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(fourRight, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(insideLayout.createSequentialGroup()
                                .addComponent(fifthField)
                                .addGap(10, 10, 10)
                                .addComponent(fiveLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(fiveRight, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(insideLayout.createSequentialGroup()
                                .addComponent(sixthField)
                                .addGap(10, 10, 10)
                                .addComponent(sixLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(sixRight, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(insideLayout.createSequentialGroup()
                                .addComponent(seventhField)
                                .addGap(10, 10, 10)
                                .addComponent(sevenLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(sevenRight, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(insideLayout.createSequentialGroup()
                                .addComponent(eighthField)
                                .addGap(10, 10, 10)
                                .addComponent(eightLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(eightRight, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(insideLayout.createSequentialGroup()
                                .addComponent(ninthField)
                                .addGap(10, 10, 10)
                                .addComponent(nineLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(nineRight, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(insideLayout.createSequentialGroup()
                                .addComponent(tenthField)
                                .addGap(10, 10, 10)
                                .addComponent(tenLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(tenRight, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(insideLayout.createSequentialGroup()
                                .addComponent(firstField)
                                .addGap(10, 10, 10)
                                .addGroup(insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(oneLeft))
                                .addGap(10, 10, 10)
                                .addGroup(insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(replaceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(oneRight))))
                        .addGroup(insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(insideLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(oneDown)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oneUp))
                            .addGroup(insideLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldOne, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(twoField)
                                    .addComponent(threeField)
                                    .addComponent(fourField)
                                    .addComponent(fieldFive)
                                    .addComponent(sixField)
                                    .addComponent(sevenField)
                                    .addComponent(eightField)
                                    .addComponent(nineField)
                                    .addComponent(tenField)))))
                    .addComponent(replacerSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        insideLayout.setVerticalGroup(
            insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insideLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oneDown)
                    .addComponent(oneUp)
                    .addGroup(insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(replaceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(replacerSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstField)
                    .addComponent(oneLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldOne, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(secondField)
                    .addComponent(twoLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoField))
                .addGap(6, 6, 6)
                .addGroup(insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thirdField)
                    .addComponent(threeLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeField))
                .addGap(6, 6, 6)
                .addGroup(insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fourthField)
                    .addComponent(fourLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourField))
                .addGap(6, 6, 6)
                .addGroup(insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fifthField)
                    .addComponent(fiveLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldFive))
                .addGap(6, 6, 6)
                .addGroup(insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insideLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(sixthField))
                    .addComponent(sixLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sixRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sixField))
                .addGap(6, 6, 6)
                .addGroup(insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seventhField)
                    .addComponent(sevenLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sevenRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sevenField))
                .addGap(6, 6, 6)
                .addGroup(insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eighthField)
                    .addComponent(eightLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eightRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eightField))
                .addGap(6, 6, 6)
                .addGroup(insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ninthField)
                    .addComponent(nineLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nineRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nineField))
                .addGap(6, 6, 6)
                .addGroup(insideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tenthField)
                    .addComponent(tenLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(insideLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tenField)))
                .addContainerGap())
        );

        textBox.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        textBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textBox.setBorder(null);
        textBox.setEnabled(false);

        fileBar.setText("Archivo");
        fileBar.setFocusable(false);
        fileBar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        newOnMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newOnMenu.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        newOnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_insert_drive_file_black_15px.png"))); // NOI18N
        newOnMenu.setText("Nuevo archivo");
        newOnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOnMenuActionPerformed(evt);
            }
        });
        fileBar.add(newOnMenu);

        load.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        load.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        load.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_unarchive_black_15px.png"))); // NOI18N
        load.setText("Cargar archivo");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });
        fileBar.add(load);

        save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_save_15px.png"))); // NOI18N
        save.setText("Guardar archivo");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        fileBar.add(save);

        saveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveAs.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        saveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_archive_black_15px.png"))); // NOI18N
        saveAs.setText("Guardar archivo como...");
        saveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsActionPerformed(evt);
            }
        });
        fileBar.add(saveAs);
        fileBar.add(firstMenuSeparator);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exit.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        fileBar.add(exit);

        menu.add(fileBar);

        about.setText("Ayuda");
        about.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        content.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        content.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        content.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_help_black_18px.png"))); // NOI18N
        content.setText("Contenido");
        content.setEnabled(false);
        content.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentActionPerformed(evt);
            }
        });
        about.add(content);
        about.add(menuSeparator2);

        menuAbout.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        menuAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ic_copyright_black_18px.png"))); // NOI18N
        menuAbout.setText("Acerca de");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        about.add(menuAbout);

        menu.add(about);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(inside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(imageReplacer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(superiorSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(separate)
                            .addComponent(mediumSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emptyLabel)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(replace, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteAll, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(textBox, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageReplacer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(superiorSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mediumSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(emptyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteAll, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(replace, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(separate, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    String filename;
    Logic r = new Logic();
    private int counter;
    int counterOfMessages;
    File file;
    String[] fields = new String[20];
    FileNameExtensionFilter ass = new FileNameExtensionFilter(
            "Advanced Substation Alpha (.ass)", "ass"
    );
    FileNameExtensionFilter plain = new FileNameExtensionFilter(
            "Texto plano (.txt, .log, .ini)", "txt", "log", "ini"
    );

    /**
     * Starts the builder and establishes frame's location in the middle.
     */
    public Replacer() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * Returns contador instance variable's value.
     *
     * @return contador Returns value of contador.
     *
     */
    public int getCounter() {
        return counter;
    }

    /**
     * Fills an array with establish fields.
     */
    public void establishText() {
        fields[0] = oneLeft.getText();
        fields[1] = oneRight.getText();
        fields[2] = twoLeft.getText();
        fields[3] = twoRight.getText();
        fields[4] = threeLeft.getText();
        fields[5] = threeRight.getText();
        fields[6] = fourLeft.getText();
        fields[7] = fourRight.getText();
        fields[8] = fiveLeft.getText();
        fields[9] = fiveRight.getText();
        fields[10] = sixLeft.getText();
        fields[11] = sixRight.getText();
        fields[12] = sevenLeft.getText();
        fields[13] = sevenRight.getText();
        fields[14] = eightLeft.getText();
        fields[15] = eightRight.getText();
        fields[16] = nineLeft.getText();
        fields[17] = nineRight.getText();
        fields[18] = tenLeft.getText();
        fields[19] = tenRight.getText();
    }

    /**
     * Establishes files filter.
     */
    public void establishFilters() {
        if (getCounter() == 0) {
            savedFileSelector.addChoosableFileFilter(ass);
            loadedFileSelector.addChoosableFileFilter(ass);
            savedFileSelector.addChoosableFileFilter(plain);
            loadedFileSelector.addChoosableFileFilter(plain);
            savedFileSelector.setFileFilter(ass);
            loadedFileSelector.setFileFilter(ass);
            savedFileSelector.setAcceptAllFileFilterUsed(false);
            loadedFileSelector.setAcceptAllFileFilterUsed(true);
        } else {
            counter++;
        }
    }

    /**
     * This method is used for files load.
     */
    private void loadFile() {
        establishFilters();
        establishText();
        //Abrimos el JFileChooser y guardamos el resultado en selección
        int seleccion = loadedFileSelector.showOpenDialog(menu);
        //Si el usuario ha pulsado la opción Aceptar
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            //Guardamos en la variable fichero el archivo seleccionado
            file = loadedFileSelector.getSelectedFile();
            filename = file.getAbsolutePath();
            setTitle(file.getName() + " - Replacer · v0.05a");
        }
    }

    /**
     * Save load file, but asks before if you want to overwrite or not.
     */
    public void save() {
        establishText();
        if (filename != null) {
            int confirmado = JOptionPane.showConfirmDialog(null,
                    "¿Desea sobreescribir el archivo?", "¿Estás seguro?", WIDTH);
            if (JOptionPane.OK_OPTION == confirmado) {
                File tmp = r.save(filename, fields);
                file.delete();
                tmp.renameTo(file);
            }
        }
    }

    /**
     * This method has different options for aegisub's tags and replace load
     * file.
     *
     * @param selection Se utiliza para seleccionar aquella opción que se desee
     */
    public void aegisubActions(int selection) {
        Font normal = new Font("Calibri", 0, 12);
        textBox.setFont(normal);
        establishText();
        if (filename != null) {

            File tmp = r.save(filename, selection);
            file.delete();
            tmp.renameTo(file);
        }

    }

    /**
     * Method that may save file with JFileChooser.
     */
    public void saveAs() {
        establishFilters();
        establishText();
        //Abrimos el JFileChooser y guardamos el resultado en selección
        int selection = savedFileSelector.showSaveDialog(menu);
        //Si el usuario ha pulsado la opción Aceptar
        if (selection == JFileChooser.APPROVE_OPTION) {
            String inputString;
            inputString = file.getAbsolutePath();
            File tmpl = savedFileSelector.getSelectedFile();
            filename = tmpl.getAbsolutePath();
            if (!filename.endsWith(".ass")
                    && savedFileSelector.getFileFilter() == ass) {
                filename += ".ass";
                r.saveAs(filename, inputString, fields);
            } else if (!filename.endsWith(".txt")
                    && savedFileSelector.getFileFilter() == plain) {
                filename += ".txt";
                r.saveAs(filename, inputString, fields);
            }

        }
    }

    /**
     * Re-establishes all fields.
     */
    public void delete() {
        deleteOne();
        deleteTwo();
        deleteThree();
        deleteFour();
        deleteFive();
        deleteSix();
        deleteSeven();
        deleteEight();
        deleteNine();
        deleteTen();
    }

    /**
     * Re-establishes the first field.
     */
    public void deleteOne() {
        oneLeft.setText("");
        oneRight.setText("");
    }

    /**
     * Re-establishes the second field.
     */
    public void deleteTwo() {
        twoLeft.setText("");
        twoRight.setText("");

    }

    /**
     * Re-establishes the third field.
     */
    public void deleteThree() {
        threeLeft.setText("");
        threeRight.setText("");

    }

    /**
     * Re-establishes the fourth field.
     */
    public void deleteFour() {
        fourLeft.setText("");
        fourRight.setText("");

    }

    /**
     * Re-establishes the fifth field.
     */
    public void deleteFive() {
        fiveLeft.setText("");
        fiveRight.setText("");

    }

    /**
     * Re-establishes the sixth field.
     */
    public void deleteSix() {
        sixLeft.setText("");
        sixRight.setText("");

    }

    /**
     * Re-establishes the seventh field.
     */
    public void deleteSeven() {
        sevenLeft.setText("");
        sevenRight.setText("");

    }

    /**
     * Re-establishes the eighth field.
     */
    public void deleteEight() {
        eightLeft.setText("");
        eightRight.setText("");

    }

    /**
     * Re-establishes the ninth field.
     */
    public void deleteNine() {
        nineLeft.setText("");
        nineRight.setText("");

    }

    /**
     * Re-establishes the tenth field.
     */
    public void deleteTen() {
        tenLeft.setText("");
        tenRight.setText("");
    }

    /**
     * Establishes second field to true.
     */
    public void twoVisible() {
        twoField.setVisible(true);
        secondField.setVisible(true);
        twoLeft.setVisible(true);
        twoRight.setVisible(true);
    }

    /**
     * Establishes third field to true.
     */
    public void threeVisible() {
        threeField.setVisible(true);
        thirdField.setVisible(true);
        threeLeft.setVisible(true);
        threeRight.setVisible(true);
    }

    /**
     * Establishes fourth field to true.
     */
    public void fourVisible() {
        fourField.setVisible(true);
        fourthField.setVisible(true);
        fourLeft.setVisible(true);
        fourRight.setVisible(true);
    }

    /**
     * Establishes fifth field to true.
     */
    public void fiveVisible() {
        fieldFive.setVisible(true);
        fifthField.setVisible(true);
        fiveLeft.setVisible(true);
        fiveRight.setVisible(true);
    }

    /**
     * Establishes sixth field to true.
     */
    public void sixVisible() {
        sixField.setVisible(true);
        sixthField.setVisible(true);
        sixLeft.setVisible(true);
        sixRight.setVisible(true);
    }

    /**
     * Establishes seventh field to true.
     */
    public void sevenVisible() {
        sevenField.setVisible(true);
        seventhField.setVisible(true);
        sevenLeft.setVisible(true);
        sevenRight.setVisible(true);
    }

    /**
     * Establishes eighth field to true.
     */
    public void eightVisible() {
        eightField.setVisible(true);
        eighthField.setVisible(true);
        eightLeft.setVisible(true);
        eightRight.setVisible(true);
    }

    /**
     * Establishes ninth field to true.
     */
    public void nineVisible() {
        nineField.setVisible(true);
        ninthField.setVisible(true);
        nineLeft.setVisible(true);
        nineRight.setVisible(true);
    }

    /**
     * Establishes tenth field to true.
     */
    public void tenVisible() {
        tenField.setVisible(true);
        tenthField.setVisible(true);
        tenLeft.setVisible(true);
        tenRight.setVisible(true);
    }

    /**
     * Establishes second field to false.
     */
    public void twoNoVisible() {
        twoField.setVisible(false);
        secondField.setVisible(false);
        twoLeft.setVisible(false);
        twoRight.setVisible(false);
    }

    /**
     * Establishes third field to false.
     */
    public void threeNoVisible() {
        threeField.setVisible(false);
        thirdField.setVisible(false);
        threeLeft.setVisible(false);
        threeRight.setVisible(false);
    }

    /**
     * Establishes fourth field to false.
     */
    public void fourNoVisible() {
        fourField.setVisible(false);
        fourthField.setVisible(false);
        fourLeft.setVisible(false);
        fourRight.setVisible(false);
    }

    /**
     * Establishes fifth field to false.
     */
    public void fiveNoVisible() {
        fieldFive.setVisible(false);
        fifthField.setVisible(false);
        fiveLeft.setVisible(false);
        fiveRight.setVisible(false);
    }

    /**
     * Establishes sixth field to false.
     */
    public void sixNoVisible() {
        sixField.setVisible(false);
        sixthField.setVisible(false);
        sixLeft.setVisible(false);
        sixRight.setVisible(false);
    }

    /**
     * Establishes seventh field to false.
     */
    public void sevenNoVisible() {
        sevenField.setVisible(false);
        seventhField.setVisible(false);
        sevenLeft.setVisible(false);
        sevenRight.setVisible(false);
    }

    /**
     * Establishes eighth field to false.
     */
    public void eightNoVisible() {
        eightField.setVisible(false);
        eighthField.setVisible(false);
        eightLeft.setVisible(false);
        eightRight.setVisible(false);
    }

    /**
     * Establishes ninth field to false.
     */
    public void nineNoVisible() {
        nineField.setVisible(false);
        ninthField.setVisible(false);
        nineLeft.setVisible(false);
        nineRight.setVisible(false);
    }

    /**
     * Establishes tenth field to false.
     */
    public void tenNoVisible() {
        tenField.setVisible(false);
        tenthField.setVisible(false);
        tenLeft.setVisible(false);
        tenRight.setVisible(false);
    }

    /**
     * Main replacing method. Calls a method to replace a side into the
     * other side and save it in a file.
     *
     */
    public void replaceFilename() {
        establishText();
        if (file == null || filename == null) {
            textBox.setText("¡No has cargado nada!");
        } else if (fields[0].isEmpty()
                && fields[2].isEmpty()
                && fields[4].isEmpty()
                && fields[6].isEmpty()
                && fields[8].isEmpty()
                && fields[10].isEmpty()
                && fields[12].isEmpty()
                && fields[14].isEmpty()
                && fields[16].isEmpty()
                && fields[18].isEmpty()) {
            textBox.setText("¡Pon algo primero, ¿no?!");
        } else {
            File tmp = r.save(filename, fields);
            file.delete();
            tmp.renameTo(file);
            if (counterOfMessages % 2 == 0) {
                textBox.setText("¡Creado con éxito!");
                counterOfMessages++;
            } else if (counterOfMessages % 5 == 0) {
                textBox.setText("¡Buen trabajo!");
                counterOfMessages++;
            } else if (counterOfMessages % counterOfMessages == 0
                    && counterOfMessages % 1 == 0) {
                textBox.setText("¡Vas por buen camino!");
                counterOfMessages++;
            }
        }
    }

    /**
     * Establishes "acerca de" window in the middle and in visible mode.
     */
    public void about() {
        aboutReplacer.setLocationRelativeTo(null);
        aboutReplacer.setVisible(true);
    }

    /**
     * Makes a new file. Establishes file's name to null and establishes app
     * name default. Cleans all fields.
     */
    public void newFile() {
        if (file == null || filename == null) {
            if (textBox.getText().equals("¿Para qué uno nuevo? Empieza "
                    + "cargando algo...")) {
                textBox.setText("Puedes estar así siempre...");
            } else {
                textBox.setText("¿Para qué uno nuevo? Empieza "
                        + "cargando algo...");
            }
        } else {
            setTitle("Replacer · v0.05a");
            delete();
            filename = null;
        }
    }

    /**
     * Event that calls a method for replace the file
     */
    private void replaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceActionPerformed
        replaceFilename();
    }//GEN-LAST:event_replaceActionPerformed

    /**
     * Event that run when the app closes.
     */
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    /**
     * Event that re-establishes all fields.
     */
    private void deleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAllActionPerformed
        if (!textBox.getText().isEmpty()) {
            textBox.setText("");
        }
        newFile();
        filename = null;
        setTitle("Replacer · v0.05a");
    }//GEN-LAST:event_deleteAllActionPerformed

    /**
     * Event that creates a new file.
     */
    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        newFile();
    }//GEN-LAST:event_newFileActionPerformed

    /**
     * Event that creates a new file. In menu.
     */
    private void newOnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOnMenuActionPerformed
        newFile();
    }//GEN-LAST:event_newOnMenuActionPerformed

    /**
     * Event that loads a new file.
     */
    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        loadFile();
        counter++;
    }//GEN-LAST:event_loadActionPerformed

    /**
     * Event that loads a new file. In menu.
     */
    private void loadOnBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadOnBarActionPerformed
        loadFile();
        counter++;
    }//GEN-LAST:event_loadOnBarActionPerformed

    /**
     * Event that opens "acerca de" window.
     */
    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        about();
    }//GEN-LAST:event_menuAboutActionPerformed

    /**
     * Opens a webpage for external help.
     */
    private void contentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentActionPerformed
        if (java.awt.Desktop.isDesktopSupported()) {
            try {
                Desktop dk = Desktop.getDesktop();
                dk.browse(new URI(
                        "https://replacerblog.wordpress.com/"
                        + "2016/07/03/ayuda-para-replacer/"));
            } catch (URISyntaxException | IOException ex) {
                System.out.println("Error al abrir URL: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_contentActionPerformed

    /**
     * Event that add a field in the app.
     */
    private void oneDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneDownActionPerformed
        if (!twoField.isVisible()) {
            twoVisible();
            setSize(360, 375);
        } else if (!threeField.isVisible()) {
            threeVisible();
            setSize(360, 400);
        } else if (!fourField.isVisible()) {
            fourVisible();
            setSize(360, 425);
        } else if (!fieldFive.isVisible()) {
            fiveVisible();
            setSize(360, 450);
        } else if (!sixField.isVisible()) {
            sixVisible();
            setSize(360, 475);
        } else if (!sevenField.isVisible()) {
            sevenVisible();
            setSize(360, 500);
        } else if (!eightField.isVisible()) {
            eightVisible();
            setSize(360, 525);
        } else if (!nineField.isVisible()) {
            nineVisible();
            setSize(360, 550);
        } else if (!tenField.isVisible()) {
            tenVisible();
            setSize(360, 575);
        }
    }//GEN-LAST:event_oneDownActionPerformed

    /**
     * Event that substracts a field in the app.
     */
    private void oneUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneUpActionPerformed
        if (tenField.isVisible()) {
            tenNoVisible();
            deleteTen();
            setSize(360, 550);
        } else if (nineField.isVisible()) {
            nineNoVisible();
            deleteNine();
            setSize(360, 525);
        } else if (eightField.isVisible()) {
            eightNoVisible();
            deleteEight();
            setSize(360, 500);
        } else if (sevenField.isVisible()) {
            sevenNoVisible();
            deleteSeven();
            setSize(360, 475);
        } else if (sixField.isVisible()) {
            sixNoVisible();
            deleteSix();
            setSize(360, 450);
        } else if (fieldFive.isVisible()) {
            fiveNoVisible();
            deleteFive();
            setSize(360, 425);
        } else if (fourField.isVisible()) {
            fourNoVisible();
            deleteFour();
            setSize(360, 400);
        } else if (threeField.isVisible()) {
            threeNoVisible();
            deleteThree();
            setSize(360, 375);
        } else if (twoField.isVisible()) {
            twoNoVisible();
            deleteTwo();
            setSize(360, 350);
        }
    }//GEN-LAST:event_oneUpActionPerformed

    /**
     * When the app opens the fields are established to not visibles. Except the
     * first one.
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        twoNoVisible();
        threeNoVisible();
        fourNoVisible();
        fiveNoVisible();
        sixNoVisible();
        sevenNoVisible();
        eightNoVisible();
        nineNoVisible();
        tenNoVisible();
    }//GEN-LAST:event_formWindowOpened

    /**
     * Event that saves a new file. In menu.
     */
    private void saveOnBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveOnBarActionPerformed
        if (file == null || filename == null) {
            if (textBox.getText().equals("¿Qué tal si cargas algo primero?")) {
                textBox.setText("Carga algo...");
            } else {
                textBox.setText("¿Qué tal si cargas algo primero?");
            }
            save();
        }
    }//GEN-LAST:event_saveOnBarActionPerformed

    /**
     * Event that saves the file.
     */
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (file == null || filename == null) {
            if (textBox.getText().equals("¿Qué tal si cargas algo primero?")) {
                textBox.setText("Carga algo...");
            } else {
                textBox.setText("¿Qué tal si cargas algo primero?");
            }
        }
        save();
    }//GEN-LAST:event_saveActionPerformed

    /**
     * Event that clean the first field.
     */
    private void fieldOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldOneActionPerformed
        deleteOne();
    }//GEN-LAST:event_fieldOneActionPerformed

    /**
     * Event that clean the second field.
     */
    private void twoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoFieldActionPerformed
        deleteTwo();
    }//GEN-LAST:event_twoFieldActionPerformed

    /**
     * Event that clean the third field.
     */
    private void threeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeFieldActionPerformed
        deleteThree();
    }//GEN-LAST:event_threeFieldActionPerformed

    /**
     * Event that clean the fourth field.
     */
    private void fourFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourFieldActionPerformed
        deleteFour();
    }//GEN-LAST:event_fourFieldActionPerformed

    /**
     * Event that clean the fifth field.
     */
    private void fieldFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldFiveActionPerformed
        deleteFive();
    }//GEN-LAST:event_fieldFiveActionPerformed

    /**
     * Event that clean the sixth field.
     */
    private void sixFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixFieldActionPerformed
        deleteSix();
    }//GEN-LAST:event_sixFieldActionPerformed

    /**
     * Event that clean the seventh field.
     */
    private void sevenFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenFieldActionPerformed
        deleteSeven();
    }//GEN-LAST:event_sevenFieldActionPerformed

    /**
     * Event that clean the eighth field.
     */
    private void eightFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightFieldActionPerformed
        deleteEight();
    }//GEN-LAST:event_eightFieldActionPerformed

    /**
     * Event that clean the ninth field.
     */
    private void nineFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineFieldActionPerformed
        deleteNine();
    }//GEN-LAST:event_nineFieldActionPerformed

    /**
     * Event that clean the tenth field.
     */
    private void tenFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenFieldActionPerformed
        deleteTen();
    }//GEN-LAST:event_tenFieldActionPerformed

    /**
     * Event that shows a pop-up for save the file.
     */
    private void saveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsActionPerformed
        if (file == null || filename == null) {
            if (textBox.getText().equals("¿Qué tal si cargas "
                    + "algo primero?")) {
                textBox.setText("Carga algo...");
            } else {
                textBox.setText("¿Qué tal si cargas algo primero?");
            }
        } else {
            saveAs();
            counter++;
        }
    }//GEN-LAST:event_saveAsActionPerformed

    /**
     * Event that calls a method for change the field "style" to "actor".
     */
    private void styleActorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_styleActorActionPerformed
        if (file == null || filename == null) {
            if (textBox.getText().equals("¿Qué tal si cargas "
                    + "algo primero?")) {
                textBox.setText("Carga algo...");
            } else {
                textBox.setText("¿Qué tal si cargas algo primero?");
            }
        } else {
            aegisubActions(0);
            textBox.setText("Actor pasados a estilo");
        }
    }//GEN-LAST:event_styleActorActionPerformed

    /**
     * Event that calls a method for change the field "actor" to "style".
     */
    private void actorStyleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actorStyleActionPerformed
        if (file == null || filename == null) {
            if (textBox.getText().equals("¿Qué tal si cargas "
                    + "algo primero?")) {
                textBox.setText("Carga algo...");
            } else {
                textBox.setText("¿Qué tal si cargas algo primero?");
            }
        } else {
            aegisubActions(1);
            textBox.setText("Estilos pasados a actor");
        }
    }//GEN-LAST:event_actorStyleActionPerformed

    /**
     * Event that calls a method for clean all tags.
     */
    private void deleteTagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTagsActionPerformed
        if (file == null || filename == null) {
            if (textBox.getText().equals("¿Qué tal si cargas "
                    + "algo primero?")) {
                textBox.setText("Carga algo...");
            } else {
                textBox.setText("¿Qué tal si cargas algo primero?");
            }
        } else {
            aegisubActions(2);
            textBox.setText("Etiquetas borradas");
        }
    }//GEN-LAST:event_deleteTagsActionPerformed

    /**
     * Event that calls a method for add tags of "pensamiento".
     */
    private void putThoughtsTagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putThoughtsTagsActionPerformed
        if (file == null || filename == null) {
            if (textBox.getText().equals("¿Qué tal si cargas "
                    + "algo primero?")) {
                textBox.setText("Carga algo...");
            } else {
                textBox.setText("¿Qué tal si cargas algo primero?");
            }
        } else {
            aegisubActions(3);
            textBox.setText("Pensamientos colocados");
        }
    }//GEN-LAST:event_putThoughtsTagsActionPerformed

    /**
     * Event that calls a method for add tags of flashback.
     */
    private void putFlashbacksTagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putFlashbacksTagsActionPerformed
        if (file == null || filename == null) {
            if (textBox.getText().equals("¿Qué tal si cargas "
                    + "algo primero?")) {
                textBox.setText("Carga algo...");
            } else {
                textBox.setText("¿Qué tal si cargas algo primero?");
            }
        } else {
            aegisubActions(4);
            textBox.setText("Flashbacks puestos");
        }
    }//GEN-LAST:event_putFlashbacksTagsActionPerformed

    /**
     * Event that calls a method for add tags of radio.
     */
    private void putRadioTagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putRadioTagsActionPerformed
        if (file == null || filename == null) {
            if (textBox.getText().equals("¿Qué tal si cargas "
                    + "algo primero?")) {
                textBox.setText("Carga algo...");
            } else {
                textBox.setText("¿Qué tal si cargas algo primero?");
            }
        } else {
            aegisubActions(5);
            textBox.setText("Aparatos electrónicos puestos");
        }
    }//GEN-LAST:event_putRadioTagsActionPerformed

    /**
     * Event that calls a method for add italic tags.
     */
    private void putItalicTagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putItalicTagsActionPerformed
        if (file == null || filename == null) {
            if (textBox.getText().equals("¿Qué tal si cargas "
                    + "algo primero?")) {
                textBox.setText("Carga algo...");
            } else {
                textBox.setText("¿Qué tal si cargas algo primero?");
            }
        } else {
            aegisubActions(6);
            textBox.setText("Se ha cursivado con éxito");
        }
    }//GEN-LAST:event_putItalicTagsActionPerformed

    /**
     * Event that calls a method for add blur tags.
     */
    private void putBlurTagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putBlurTagsActionPerformed

        if (file == null || filename == null) {
            if (textBox.getText().equals("¿Qué tal si cargas "
                    + "algo primero?")) {
                textBox.setText("Carga algo...");
            } else {
                textBox.setText("¿Qué tal si cargas algo primero?");
            }
        } else {
            aegisubActions(7);
            Font italic = new Font("Calibri", Font.ITALIC, 12);
            textBox.setFont(italic);
            textBox.setText("Tá' tó' difumina'o");
        }
    }//GEN-LAST:event_putBlurTagsActionPerformed

    /**
     * Event that calls a method for add tags of translation.
     */
    private void putTranslatorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putTranslatorsActionPerformed
        if (file == null || filename == null) {
            if (textBox.getText().equals("¿Qué tal si cargas "
                    + "algo primero?")) {
                textBox.setText("Carga algo...");
            } else {
                textBox.setText("¿Qué tal si cargas algo primero?");
            }
        } else {
            aegisubActions(8);
            textBox.setText("Traduce sabiamente");
        }
    }//GEN-LAST:event_putTranslatorsActionPerformed

    /**
     * Event that calls a method for add all tags.
     */
    private void putAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putAllActionPerformed
        if (file == null || filename == null) {
            if (textBox.getText().equals("¿Qué tal si cargas "
                    + "algo primero?")) {
                textBox.setText("Carga algo...");
            } else {
                textBox.setText("¿Qué tal si cargas algo primero?");
            }
        } else {
            aegisubActions(-1);
            textBox.setText("Pues ya no tienes que hacer mucho más...");
        }
    }//GEN-LAST:event_putAllActionPerformed

    /**
     * Event that calls a method for add tags on top.
     */
    private void putOnTopTagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putOnTopTagsActionPerformed
        if (file == null || filename == null) {
            if (textBox.getText().equals("¿Qué tal si cargas "
                    + "algo primero?")) {
                textBox.setText("Carga algo...");
            } else {
                textBox.setText("¿Qué tal si cargas algo primero?");
            }
        } else {
            aegisubActions(9);
            textBox.setText("Todo arribita");
        }
    }//GEN-LAST:event_putOnTopTagsActionPerformed

    /**
     * Establishes app icon.
     *
     * @return Returns retValue.
     */
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("resources/Icono.png"));

        return retValue;
    }

    /**
     * Main method that establishes app's look and feel.
     *
     */
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            /*
             * UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus." +
             * "NimbusLookAndFeel");
             * UIManager.setLookAndFeel("javax.swing.plaf.metal." +
             * "MetalLookAndFeel");
             * UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows." +
             * "WindowsLookAndFeel");
             * UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif." +
             * "MotifLookAndFeel");
             */
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
         * Bootstrap app.
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Replacer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu about;
    private javax.swing.JFrame aboutReplacer;
    private javax.swing.JButton actorStyle;
    private javax.swing.JToolBar bar;
    private javax.swing.JMenuItem content;
    private javax.swing.JLabel creador;
    private javax.swing.JToggleButton deleteAll;
    private javax.swing.JButton deleteTags;
    private javax.swing.JButton eightField;
    private javax.swing.JTextField eightLeft;
    private javax.swing.JTextField eightRight;
    private javax.swing.JLabel eighthField;
    private javax.swing.JLabel emptyLabel;
    private javax.swing.JMenuItem exit;
    private javax.swing.JButton fieldFive;
    private javax.swing.JButton fieldOne;
    private javax.swing.JLabel fifthField;
    private javax.swing.JMenu fileBar;
    private javax.swing.JLabel firstField;
    private javax.swing.JPopupMenu.Separator firstMenuSeparator;
    private javax.swing.JTextField fiveLeft;
    private javax.swing.JTextField fiveRight;
    private javax.swing.JButton fourField;
    private javax.swing.JTextField fourLeft;
    private javax.swing.JTextField fourRight;
    private javax.swing.JLabel fourthField;
    private javax.swing.ButtonGroup groupBar;
    private javax.swing.JLabel iconoApp;
    private javax.swing.JLabel imageReplacer;
    private javax.swing.JLabel imagenCC;
    private javax.swing.JPanel inside;
    private javax.swing.JLabel licence;
    private javax.swing.JMenuItem load;
    private javax.swing.JButton loadOnBar;
    private javax.swing.JFileChooser loadedFileSelector;
    private javax.swing.JSeparator mediumSeparator;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JToolBar.Separator menuSeparator;
    private javax.swing.JPopupMenu.Separator menuSeparator2;
    private javax.swing.JToolBar.Separator menuSeparator3;
    private javax.swing.JToolBar.Separator menuSeparator4;
    private javax.swing.JButton newFile;
    private javax.swing.JMenuItem newOnMenu;
    private javax.swing.JButton nineField;
    private javax.swing.JTextField nineLeft;
    private javax.swing.JTextField nineRight;
    private javax.swing.JLabel ninthField;
    private javax.swing.JButton oneDown;
    private javax.swing.JTextField oneLeft;
    private javax.swing.JTextField oneRight;
    private javax.swing.JButton oneUp;
    private javax.swing.JButton putAll;
    private javax.swing.JButton putBlurTags;
    private javax.swing.JButton putFlashbacksTags;
    private javax.swing.JButton putItalicTags;
    private javax.swing.JButton putOnTopTags;
    private javax.swing.JButton putRadioTags;
    private javax.swing.JButton putThoughtsTags;
    private javax.swing.JButton putTranslators;
    private javax.swing.JButton replace;
    private javax.swing.JTextField replaceLabel;
    private javax.swing.JLabel replacer;
    private javax.swing.JSeparator replacerSeparator;
    private javax.swing.JMenuItem save;
    private javax.swing.JMenuItem saveAs;
    private javax.swing.JButton saveOnBar;
    private javax.swing.JFileChooser savedFileSelector;
    private javax.swing.JTextField searchLabel;
    private javax.swing.JLabel secondField;
    private javax.swing.JSeparator separate;
    private javax.swing.JButton sevenField;
    private javax.swing.JTextField sevenLeft;
    private javax.swing.JTextField sevenRight;
    private javax.swing.JLabel seventhField;
    private javax.swing.JButton sixField;
    private javax.swing.JTextField sixLeft;
    private javax.swing.JTextField sixRight;
    private javax.swing.JLabel sixthField;
    private javax.swing.JButton styleActor;
    private javax.swing.JSeparator superiorSeparator;
    private javax.swing.JButton tenField;
    private javax.swing.JTextField tenLeft;
    private javax.swing.JTextField tenRight;
    private javax.swing.JLabel tenthField;
    private javax.swing.JTextField textBox;
    private javax.swing.JLabel thirdField;
    private javax.swing.JButton threeField;
    private javax.swing.JTextField threeLeft;
    private javax.swing.JTextField threeRight;
    private javax.swing.JButton twoField;
    private javax.swing.JTextField twoLeft;
    private javax.swing.JTextField twoRight;
    private javax.swing.JLabel version;
    // End of variables declaration//GEN-END:variables
}
