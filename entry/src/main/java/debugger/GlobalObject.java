package debugger;

import ohos.agp.components.Text;
import ohos.app.dispatcher.TaskDispatcher;

public class GlobalObject {
    public static Text text = null;

    public static TaskDispatcher task = null;
    public static void refresh(){
        task.syncDispatch(()->{
            System.out.println("OKX");
        });
    }
}
