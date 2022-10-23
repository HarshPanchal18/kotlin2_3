// Generated by view binder compiler. Do not edit!
package com.example.kotlin2_3.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.viewbinding.ViewBindings;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.example.kotlin2_3.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnR;

  @NonNull
  public final Button btnShowToast;

  @NonNull
  public final TextView msgtxt;

  @NonNull
  public final Button sendIntent;

  @NonNull
  public final EditText usermessage;

  private ActivityMainBinding(@NonNull RelativeLayout rootView, @NonNull Button btnR,
      @NonNull Button btnShowToast, @NonNull TextView msgtxt, @NonNull Button sendIntent,
      @NonNull EditText usermessage) {
    this.rootView = rootView;
    this.btnR = btnR;
    this.btnShowToast = btnShowToast;
    this.msgtxt = msgtxt;
    this.sendIntent = sendIntent;
    this.usermessage = usermessage;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnR;
      Button btnR = ViewBindings.findChildViewById(rootView, id);
      if (btnR == null) {
        break missingId;
      }

      id = R.id.btnShowToast;
      Button btnShowToast = ViewBindings.findChildViewById(rootView, id);
      if (btnShowToast == null) {
        break missingId;
      }

      id = R.id.msgtxt;
      TextView msgtxt = ViewBindings.findChildViewById(rootView, id);
      if (msgtxt == null) {
        break missingId;
      }

      id = R.id.sendIntent;
      Button sendIntent = ViewBindings.findChildViewById(rootView, id);
      if (sendIntent == null) {
        break missingId;
      }

      id = R.id.usermessage;
      EditText usermessage = ViewBindings.findChildViewById(rootView, id);
      if (usermessage == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, btnR, btnShowToast, msgtxt,
          sendIntent, usermessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
