package PACKAGE_NAME;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class QuizDota extends JFrame implements ActionListener {
    private String[][] heroAtrib = {
            {"Abaddon", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Alchemist", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Ancient Apparition", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Anti-Mage", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Arc Warden", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Axe", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Bane", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Batrider", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Beastmaster", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Bloodseeker", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Bounty Hunter", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Brewmaster", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Bristleback", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Broodmother", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Centaur Warrunner", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Chaos Knight", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Chen", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Clinkz", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Clockwerk", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Crystal Maiden", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Dark Seer", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Dark Willow", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Dawnbreaker", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Dazzle", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Death Prophet", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Disruptor", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Doom", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Dragon Knight", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Drow Ranger", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Earth Spirit", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Earthshaker", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Elder Titan", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Ember Spirit", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Enchantress", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Enigma", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Faceless Void", "Agilidade", "Força", "Inteligência", "Universal"},
            {"Grimstroke", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Gyrocopter", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Hoodwink", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Huskar", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Invoker", "Universal", "Inteligência", "Agilidade", "Força"},
            {"IO", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Jakiro", "Inteligência", "Força", "Agilidade", "Força"},
            {"Juggernaut", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Keeper of the Light", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Kunkka", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Legion Commander", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Leshrac", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Lich", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Lifestealer", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Lina", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Lion", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Lone Druid", "Universal", "Força", "Agilidade", "Força"},
            {"Luna", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Lycan", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Magnus", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Marci", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Mars", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Medusa", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Meepo", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Mirana", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Monkey King", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Morphling", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Muerta", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Naga Siren", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Natures's Prophet", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Necrophos", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Night Stalker", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Nyx Assassin", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Ogre Magi", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Omniknight", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Oracle", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Outworld Destroyer", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Pangolier", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Phantom Assassin", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Phantom Lancer", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Phoenix", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Primal Beast", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Puck", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Pudge", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Pugna", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Queen of Pain", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Razor", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Riki", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Rubick", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Sand King", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Shadow Demon", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Shadow Fiend", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Shadow Shaman", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Silencer", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Skywrath Mage", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Slardar", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Slark", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Snapfire", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Sniper", "Agilidade", "Inteligência", "Universal", "Universal"},
            {"Spectre", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Spirit Breaker", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Storm Spirit", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Sven", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Techies", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Templar Assassin", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Terrorblade", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Tidehunter", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Timbersaw", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Tinker", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Tiny", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Treant Protector", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Troll Warlord", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Tusk", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Underlord", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Undying", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Ursa", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Vengeful Spirit", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Venomancer", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Viper", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Visage", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Void Spirit", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Warlock", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Weaver", "Agilidade", "Inteligência", "Força", "Universal"},
            {"Windranger", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Winter Wyvern", "Universal", "Inteligência", "Agilidade", "Força"},
            {"Witch Doctor", "Inteligência", "Força", "Agilidade", "Universal"},
            {"Wraith King", "Força", "Inteligência", "Agilidade", "Universal"},
            {"Zeus", "Inteligência", "Força", "Agilidade", "Universal"},
    };

    private JButton[] bot;
    private JButton n;
    private JLabel visor;
    private int heroI;

    public QuizDota(){
        this.setTitle("DOTA 2 - QUIZ: Qual é o atributo do herói?");
        this.setSize(500,500);
        //this.setBounds(400, 130, 500, 500);
        this.setLocationRelativeTo(null); //Centraliza a tela
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        setContentPane(mainPanel); // Defina o painel principal do JFrame

        visor = new JLabel();
        visor.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(visor, BorderLayout.NORTH);
        visor.setFont(new Font("Arial", Font.BOLD,40));

        JPanel pb = new JPanel();
        pb.setLayout(new GridLayout(2,2,2,2));

        bot = new JButton[4];
        for (int i = 0; i < bot.length; i++) {
            bot[i] = new JButton();
            bot[i].addActionListener(this);
            pb.add(bot[i]);
        }

        add(pb, BorderLayout.CENTER);

        n = new JButton("Next");
        n.addActionListener(this);
        add(n, BorderLayout.SOUTH);

        heroI = -1;
        showNextHero();
    }

    private void showNextHero() {
        heroI = new Random().nextInt(heroAtrib.length);
        visor.setText(heroAtrib[heroI][0]);

        // Embaralhar as respostas (atributos) e definir os textos dos botões
        List<String> atributos = new ArrayList<>();
        atributos.add(heroAtrib[heroI][1]);
        atributos.add(heroAtrib[heroI][2]);
        atributos.add(heroAtrib[heroI][3]);
        atributos.add(heroAtrib[heroI][4]);
        Collections.shuffle(atributos);

        // Embaralhar as respostas e definir os textos dos botões
        for (int i = 0; i < bot.length; i++) {
            bot[i].setText(atributos.get(i));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == n){
        showNextHero();
    }else {
        String atribSelect = ((JButton)e.getSource()).getText();
        String atribCorret = heroAtrib[heroI][1];

        if (atribSelect.equals(atribCorret)){
            JOptionPane.showMessageDialog(this, "ACERTOU!");
            showNextHero();
        }else {
            JOptionPane.showMessageDialog(this, "ERROU!");
            }
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            QuizDota quizD = new QuizDota();
            quizD.setVisible(true);
        });
    }
}
