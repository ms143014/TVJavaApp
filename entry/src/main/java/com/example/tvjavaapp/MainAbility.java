package com.example.tvjavaapp;

import com.example.tvjavaapp.slice.MainAbilitySlice;
import debugger.GlobalObject;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.app.dispatcher.TaskDispatcher;
import ohos.eventhandler.EventHandler;

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());
        GlobalObject.task = getUITaskDispatcher();
        new Thread(()->{
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i=0; i < 10; i++){
                System.out.println("pause");
            }
        }).start();

    }
}
