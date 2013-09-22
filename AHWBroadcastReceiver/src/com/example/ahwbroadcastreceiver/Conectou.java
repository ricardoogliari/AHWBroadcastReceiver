package com.example.ahwbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Conectou extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent arg1) {
		// TODO Auto-generated method stub
		Toast.makeText(context, "Concetou!!!!", 8000).show();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
