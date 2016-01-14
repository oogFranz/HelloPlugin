import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.editor.Document;

import java.awt.event.MouseEvent;

/**
 * Created by ContraBass on 2015/10/31.
 */
public class GoToFile extends AnAction {
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        Project project = e.getProject();
        if(project == null){
            return;
        }
        Editor editor = FileEditorManager.getInstance(project).getSelectedTextEditor();
        if(editor ==null){
            return;
        }
        Document document =  editor.getDocument();
        String text;
        VirtualFile currentFile = FileDocumentManager.getInstance().getFile(document);
        if(currentFile ==null){
            return;
        }
        //Document opendoc = FileEditorManager.getInstance(project).openEditor()
        //VirtualFile file = FileDocumentManager.getInstance().
        String fileName = currentFile.getPath();
        //FileEditorManager.getInstance(project).openFile()
        Notifications.Bus.notify(
          new Notification("group", "Hello World Title", "Hello World Content!!!" + fileName, NotificationType.INFORMATION));
    }
}
