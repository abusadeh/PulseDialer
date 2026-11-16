package ru.pulsedialer.app;

import android.telecom.Call;
import android.telecom.InCallService;

/**
 * System-bound in-call service. When the app is set as the default dialer
 * (ROLE_DIALER), Android routes active calls here so the Engine can drive
 * the in-call UI and optional call recording.
 */
public class CallService extends InCallService {

    @Override
    public void onCallAdded(Call call) {
        super.onCallAdded(call);
        Engine.attach(this, call);
    }

    @Override
    public void onCallRemoved(Call call) {
        super.onCallRemoved(call);
        Engine.detach(call);
    }
}
