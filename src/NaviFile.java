import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by ContraBass on 2015/10/31.
 */
public class NaviFile extends AnAction {
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        Notifications.Bus.notify(
                new Notification("group", "Hello World Title", "Hello World Content", NotificationType.INFORMATION));
    }
}
