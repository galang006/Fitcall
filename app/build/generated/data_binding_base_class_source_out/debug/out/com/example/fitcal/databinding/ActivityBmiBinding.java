// Generated by view binder compiler. Do not edit!
package com.example.fitcal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.fitcal.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBmiBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout calculate;

  @NonNull
  public final Button calculateButton;

  @NonNull
  public final TextView cmTextView;

  @NonNull
  public final ConstraintLayout height;

  @NonNull
  public final EditText heightEditText;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView instructionTextView;

  @NonNull
  public final TextView kgTextView;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final ConstraintLayout weight;

  @NonNull
  public final EditText weightEditText;

  private ActivityBmiBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout calculate, @NonNull Button calculateButton,
      @NonNull TextView cmTextView, @NonNull ConstraintLayout height,
      @NonNull EditText heightEditText, @NonNull ImageView imageView,
      @NonNull TextView instructionTextView, @NonNull TextView kgTextView,
      @NonNull ConstraintLayout main, @NonNull TextView textView2, @NonNull ConstraintLayout weight,
      @NonNull EditText weightEditText) {
    this.rootView = rootView;
    this.calculate = calculate;
    this.calculateButton = calculateButton;
    this.cmTextView = cmTextView;
    this.height = height;
    this.heightEditText = heightEditText;
    this.imageView = imageView;
    this.instructionTextView = instructionTextView;
    this.kgTextView = kgTextView;
    this.main = main;
    this.textView2 = textView2;
    this.weight = weight;
    this.weightEditText = weightEditText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBmiBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBmiBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_bmi, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBmiBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.calculate;
      ConstraintLayout calculate = ViewBindings.findChildViewById(rootView, id);
      if (calculate == null) {
        break missingId;
      }

      id = R.id.calculateButton;
      Button calculateButton = ViewBindings.findChildViewById(rootView, id);
      if (calculateButton == null) {
        break missingId;
      }

      id = R.id.cmTextView;
      TextView cmTextView = ViewBindings.findChildViewById(rootView, id);
      if (cmTextView == null) {
        break missingId;
      }

      id = R.id.height;
      ConstraintLayout height = ViewBindings.findChildViewById(rootView, id);
      if (height == null) {
        break missingId;
      }

      id = R.id.heightEditText;
      EditText heightEditText = ViewBindings.findChildViewById(rootView, id);
      if (heightEditText == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.instructionTextView;
      TextView instructionTextView = ViewBindings.findChildViewById(rootView, id);
      if (instructionTextView == null) {
        break missingId;
      }

      id = R.id.kgTextView;
      TextView kgTextView = ViewBindings.findChildViewById(rootView, id);
      if (kgTextView == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.weight;
      ConstraintLayout weight = ViewBindings.findChildViewById(rootView, id);
      if (weight == null) {
        break missingId;
      }

      id = R.id.weightEditText;
      EditText weightEditText = ViewBindings.findChildViewById(rootView, id);
      if (weightEditText == null) {
        break missingId;
      }

      return new ActivityBmiBinding((ConstraintLayout) rootView, calculate, calculateButton,
          cmTextView, height, heightEditText, imageView, instructionTextView, kgTextView, main,
          textView2, weight, weightEditText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
