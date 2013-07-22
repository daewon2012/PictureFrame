package com.example.pictureframe;

import android.os.Bundle;
import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.view.Menu;
import android.widget.RemoteViews;

public class MainActivity extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager,
    		int[] appWidgetIds) {
    	RemoteViews remoteViews = new RemoteViews(context.getPackageName(),
    			R.layout.picture_frame_layout);
    	appWidgetManager.updateAppWidget(appWidgetIds[0], remoteViews);
    	//super.onUpdate(context, appWidgetManager, appWidgetIds);
    }
}
