package com.guilhermetc.capacitorjs.isdebug;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "IsDebug")
public class IsDebugPlugin extends Plugin {
    private static Context ctx;

    @PluginMethod
    public void getIsDebug(PluginCall call) {
        ctx = bridge.getContext();
        JSObject ret = new JSObject();

        try {
            if ((ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 0).
                    applicationInfo.flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0)
                ret.put("value", true);
            else
                ret.put("value", false);
        } catch (PackageManager.NameNotFoundException e) {
            ret.put("value", null);
        }

        call.resolve(ret);
    }
}
