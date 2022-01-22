package auth;

import net.minecraft.client.Minecraft;

import javax.swing.*;
import java.util.ArrayList;

public class MCNameAuth extends RuntimeException {
    public static final ArrayList<String> users = new ArrayList<>();

    public static void Users() {
        users.add("CReb0rn");
        users.add("kyv3");
        users.add("LigmaBallz");
        //users.add("");
        //users.add("");
        //users.add("");
        //users.add("");
        //users.add("");
        //users.add("");
        //users.add("");
        //users.add("");
        //users.add("");
        //users.add("");
        //users.add("");
        //users.add("");
        //users.add("");
        //users.add("");
        //users.add("");
        //users.add("");
    }

    public static void listUsers() {
        String list = "";
        for (String user : users) {
            list = list + user + "\n";
        }
        JOptionPane.showMessageDialog(null, list);
    }

    public static void UsersShit() {
        boolean isUserPresent = users.contains(Minecraft.getMinecraft().getSession().getUsername());
        if (! isUserPresent) {
            Display();
            throw new MCNameAuth("");
        }
    }

    public static
    void Display() {
        Frame frame = new Frame();
        frame.setVisible(false);
        throw new MCNameAuth("Verification was unsuccessful!");
    }

    public static
    class Frame extends JFrame {
        public
        Frame() {
            this.setTitle("Verification failed.");
            this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            this.setLocationRelativeTo(null);
            String message = "lolz, u dont have access.";
            JOptionPane.showMessageDialog(this, message, "Go away", JOptionPane.PLAIN_MESSAGE, UIManager.getIcon("OptionPane.errorIcon"));
        }
    }

    public
    MCNameAuth(final String msg) {
        super(msg);
        this.setStackTrace(new StackTraceElement[0]);
    }

    @Override
    public
    String toString() {
        return "1.0.0";
    }

    @Override
    public synchronized
    Throwable fillInStackTrace() {
        return this;
    }
}
