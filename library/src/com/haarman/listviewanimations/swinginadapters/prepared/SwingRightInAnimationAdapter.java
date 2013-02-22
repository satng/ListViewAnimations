/*
 * Copyright 2013 Niek Haarman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.haarman.listviewanimations.swinginadapters.prepared;

import java.util.ArrayList;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.haarman.listviewanimations.swinginadapters.PropertyValuesAnimationAdapter;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.ObjectAnimator;

public abstract class SwingRightInAnimationAdapter<T> extends PropertyValuesAnimationAdapter<T> {

	public SwingRightInAnimationAdapter(Context context) {
		super(context);
	}

	public SwingRightInAnimationAdapter(Context context, ArrayList<T> items) {
		super(context, items);
	}

	@Override
	protected long getAnimationDelayMillis() {
		return 100;
	}

	@Override
	protected Animator getTranslateAnimator(ViewGroup parent, View view) {
		return ObjectAnimator.ofFloat(view, "translationX", parent.getWidth(), 0);
	}
}
