package androidx.appcompat.widget;

import a2.w;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import g.AbstractC0262a;
import i.InterfaceC0282a;
import i2.f;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.A0;
import k.AbstractC0307e0;
import k.AbstractC0320l;
import k.B0;
import k.C0;
import k.C0309f0;
import k.D0;
import k.E0;
import k.F0;
import k.G0;
import k.I0;
import k.RunnableC0346y0;
import k.V0;
import k.z0;

/* loaded from: classes.dex */
public class SearchView extends AbstractC0307e0 implements InterfaceC0282a {

    /* renamed from: j0, reason: collision with root package name */
    public static final f f3168j0;

    /* renamed from: A, reason: collision with root package name */
    public final View f3169A;

    /* renamed from: B, reason: collision with root package name */
    public G0 f3170B;

    /* renamed from: C, reason: collision with root package name */
    public final Rect f3171C;

    /* renamed from: D, reason: collision with root package name */
    public final Rect f3172D;

    /* renamed from: E, reason: collision with root package name */
    public final int[] f3173E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f3174F;

    /* renamed from: G, reason: collision with root package name */
    public final ImageView f3175G;

    /* renamed from: H, reason: collision with root package name */
    public final Drawable f3176H;

    /* renamed from: I, reason: collision with root package name */
    public final int f3177I;

    /* renamed from: J, reason: collision with root package name */
    public final int f3178J;

    /* renamed from: K, reason: collision with root package name */
    public final Intent f3179K;

    /* renamed from: L, reason: collision with root package name */
    public final Intent f3180L;

    /* renamed from: M, reason: collision with root package name */
    public final CharSequence f3181M;

    /* renamed from: N, reason: collision with root package name */
    public View.OnFocusChangeListener f3182N;

    /* renamed from: O, reason: collision with root package name */
    public View.OnClickListener f3183O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f3184P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f3185Q;

    /* renamed from: R, reason: collision with root package name */
    public k1.b f3186R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f3187S;

    /* renamed from: T, reason: collision with root package name */
    public CharSequence f3188T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f3189U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f3190V;

    /* renamed from: W, reason: collision with root package name */
    public int f3191W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3192a0;

    /* renamed from: b0, reason: collision with root package name */
    public CharSequence f3193b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3194c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f3195d0;

    /* renamed from: e0, reason: collision with root package name */
    public SearchableInfo f3196e0;

    /* renamed from: f0, reason: collision with root package name */
    public Bundle f3197f0;

    /* renamed from: g0, reason: collision with root package name */
    public final RunnableC0346y0 f3198g0;

    /* renamed from: h0, reason: collision with root package name */
    public final RunnableC0346y0 f3199h0;
    public final WeakHashMap i0;

    /* renamed from: s, reason: collision with root package name */
    public final SearchAutoComplete f3200s;

    /* renamed from: t, reason: collision with root package name */
    public final View f3201t;

    /* renamed from: u, reason: collision with root package name */
    public final View f3202u;

    /* renamed from: v, reason: collision with root package name */
    public final View f3203v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f3204w;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f3205x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f3206y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f3207z;

    public static class SearchAutoComplete extends AbstractC0320l {
        public int h;

        /* renamed from: i, reason: collision with root package name */
        public SearchView f3208i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f3209j;

        /* renamed from: k, reason: collision with root package name */
        public final d f3210k;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3210k = new d(this);
            this.h = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i3 = configuration.screenWidthDp;
            int i4 = configuration.screenHeightDp;
            if (i3 >= 960 && i4 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i3 < 600) {
                return (i3 < 640 || i4 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            f fVar = SearchView.f3168j0;
            fVar.getClass();
            f.a();
            Method method = fVar.f4465c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.h <= 0 || super.enoughToFilter();
        }

        @Override // k.AbstractC0320l, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f3209j) {
                d dVar = this.f3210k;
                removeCallbacks(dVar);
                post(dVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z3, int i3, Rect rect) {
            super.onFocusChanged(z3, i3, rect);
            SearchView searchView = this.f3208i;
            searchView.v(searchView.f3185Q);
            searchView.post(searchView.f3198g0);
            if (searchView.f3200s.hasFocus()) {
                searchView.k();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i3, KeyEvent keyEvent) {
            if (i3 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f3208i.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i3, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z3) {
            super.onWindowFocusChanged(z3);
            if (z3 && this.f3208i.hasFocus() && getVisibility() == 0) {
                this.f3209j = true;
                Context context = getContext();
                f fVar = SearchView.f3168j0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z3) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f3210k;
            if (!z3) {
                this.f3209j = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f3209j = true;
                    return;
                }
                this.f3209j = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f3208i = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i3) {
            super.setThreshold(i3);
            this.h = i3;
        }
    }

    static {
        f fVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            f fVar2 = new f();
            fVar2.f4463a = null;
            fVar2.f4464b = null;
            fVar2.f4465c = null;
            f.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                fVar2.f4463a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                fVar2.f4464b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                fVar2.f4465c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            fVar = fVar2;
        }
        f3168j0 = fVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f3200s;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f3190V = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f3200s;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f3190V = false;
    }

    public int getImeOptions() {
        return this.f3200s.getImeOptions();
    }

    public int getInputType() {
        return this.f3200s.getInputType();
    }

    public int getMaxWidth() {
        return this.f3191W;
    }

    public CharSequence getQuery() {
        return this.f3200s.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f3188T;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f3196e0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f3181M : getContext().getText(this.f3196e0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f3178J;
    }

    public int getSuggestionRowLayout() {
        return this.f3177I;
    }

    public k1.b getSuggestionsAdapter() {
        return this.f3186R;
    }

    public final Intent i(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f3193b0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f3197f0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f3196e0.getSearchActivity());
        return intent;
    }

    public final Intent j(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3197f0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void k() {
        int i3 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f3200s;
        if (i3 >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        f fVar = f3168j0;
        fVar.getClass();
        f.a();
        Method method = fVar.f4463a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        fVar.getClass();
        f.a();
        Method method2 = fVar.f4464b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void l() {
        SearchAutoComplete searchAutoComplete = this.f3200s;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f3184P) {
            clearFocus();
            v(true);
        }
    }

    public final void m(int i3) {
        int i4;
        String h;
        Cursor cursor = this.f3186R.f4906f;
        if (cursor != null && cursor.moveToPosition(i3)) {
            Intent intent = null;
            try {
                int i5 = I0.f4663A;
                String h3 = I0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h3 == null) {
                    h3 = this.f3196e0.getSuggestIntentAction();
                }
                if (h3 == null) {
                    h3 = "android.intent.action.SEARCH";
                }
                String h4 = I0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h4 == null) {
                    h4 = this.f3196e0.getSuggestIntentData();
                }
                if (h4 != null && (h = I0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h4 = h4 + "/" + Uri.encode(h);
                }
                intent = i(h3, h4 == null ? null : Uri.parse(h4), I0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), I0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e3) {
                try {
                    i4 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i4 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i4 + " returned exception.", e3);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e4) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e4);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f3200s;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void n(int i3) {
        Editable text = this.f3200s.getText();
        Cursor cursor = this.f3186R.f4906f;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i3)) {
            setQuery(text);
            return;
        }
        String c3 = this.f3186R.c(cursor);
        if (c3 != null) {
            setQuery(c3);
        } else {
            setQuery(text);
        }
    }

    public final void o(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f3198g0);
        post(this.f3199h0);
        super.onDetachedFromWindow();
    }

    @Override // k.AbstractC0307e0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        if (z3) {
            int[] iArr = this.f3173E;
            SearchAutoComplete searchAutoComplete = this.f3200s;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f3174F;
            getLocationInWindow(iArr2);
            int i7 = iArr[1] - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i8;
            int height = searchAutoComplete.getHeight() + i7;
            Rect rect = this.f3171C;
            rect.set(i8, i7, width, height);
            int i9 = rect.left;
            int i10 = rect.right;
            int i11 = i6 - i4;
            Rect rect2 = this.f3172D;
            rect2.set(i9, 0, i10, i11);
            G0 g02 = this.f3170B;
            if (g02 == null) {
                G0 g03 = new G0(rect2, rect, searchAutoComplete);
                this.f3170B = g03;
                setTouchDelegate(g03);
            } else {
                g02.f4650b.set(rect2);
                Rect rect3 = g02.f4652d;
                rect3.set(rect2);
                int i12 = -g02.f4653e;
                rect3.inset(i12, i12);
                g02.f4651c.set(rect);
            }
        }
    }

    @Override // k.AbstractC0307e0, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        if (this.f3185Q) {
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            int i6 = this.f3191W;
            size = i6 > 0 ? Math.min(i6, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f3191W;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i5 = this.f3191W) > 0) {
            size = Math.min(i5, size);
        }
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof F0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        F0 f02 = (F0) parcelable;
        super.onRestoreInstanceState(f02.f4957d);
        v(f02.f4648f);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        F0 f02 = new F0(super.onSaveInstanceState());
        f02.f4648f = this.f3185Q;
        return f02;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        post(this.f3198g0);
    }

    public final void p() {
        SearchAutoComplete searchAutoComplete = this.f3200s;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f3196e0 != null) {
            getContext().startActivity(i("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q() {
        boolean isEmpty = TextUtils.isEmpty(this.f3200s.getText());
        int i3 = (!isEmpty || (this.f3184P && !this.f3194c0)) ? 0 : 8;
        ImageView imageView = this.f3206y;
        imageView.setVisibility(i3);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void r() {
        int[] iArr = this.f3200s.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f3202u.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f3203v.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i3, Rect rect) {
        if (this.f3190V || !isFocusable()) {
            return false;
        }
        if (this.f3185Q) {
            return super.requestFocus(i3, rect);
        }
        boolean requestFocus = this.f3200s.requestFocus(i3, rect);
        if (requestFocus) {
            v(false);
        }
        return requestFocus;
    }

    public final void s() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z3 = this.f3184P;
        SearchAutoComplete searchAutoComplete = this.f3200s;
        if (z3 && (drawable = this.f3176H) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f3197f0 = bundle;
    }

    public void setIconified(boolean z3) {
        if (z3) {
            l();
            return;
        }
        v(false);
        SearchAutoComplete searchAutoComplete = this.f3200s;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f3183O;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z3) {
        if (this.f3184P == z3) {
            return;
        }
        this.f3184P = z3;
        v(z3);
        s();
    }

    public void setImeOptions(int i3) {
        this.f3200s.setImeOptions(i3);
    }

    public void setInputType(int i3) {
        this.f3200s.setInputType(i3);
    }

    public void setMaxWidth(int i3) {
        this.f3191W = i3;
        requestLayout();
    }

    public void setOnCloseListener(C0 c02) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f3182N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(D0 d02) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f3183O = onClickListener;
    }

    public void setOnSuggestionListener(E0 e02) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f3188T = charSequence;
        s();
    }

    public void setQueryRefinementEnabled(boolean z3) {
        this.f3189U = z3;
        k1.b bVar = this.f3186R;
        if (bVar instanceof I0) {
            ((I0) bVar).f4672s = z3 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f3196e0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f3200s;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f3196e0.getImeOptions());
            int inputType = this.f3196e0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f3196e0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            k1.b bVar = this.f3186R;
            if (bVar != null) {
                bVar.b(null);
            }
            if (this.f3196e0.getSuggestAuthority() != null) {
                I0 i0 = new I0(getContext(), this, this.f3196e0, this.i0);
                this.f3186R = i0;
                searchAutoComplete.setAdapter(i0);
                ((I0) this.f3186R).f4672s = this.f3189U ? 2 : 1;
            }
            s();
        }
        SearchableInfo searchableInfo2 = this.f3196e0;
        boolean z3 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f3196e0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f3179K;
            } else if (this.f3196e0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f3180L;
            }
            if (intent != null) {
                z3 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f3192a0 = z3;
        if (z3) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        v(this.f3185Q);
    }

    public void setSubmitButtonEnabled(boolean z3) {
        this.f3187S = z3;
        v(this.f3185Q);
    }

    public void setSuggestionsAdapter(k1.b bVar) {
        this.f3186R = bVar;
        this.f3200s.setAdapter(bVar);
    }

    public final void t() {
        this.f3203v.setVisibility(((this.f3187S || this.f3192a0) && !this.f3185Q && (this.f3205x.getVisibility() == 0 || this.f3207z.getVisibility() == 0)) ? 0 : 8);
    }

    public final void u(boolean z3) {
        boolean z4 = this.f3187S;
        this.f3205x.setVisibility((!z4 || !(z4 || this.f3192a0) || this.f3185Q || !hasFocus() || (!z3 && this.f3192a0)) ? 8 : 0);
    }

    public final void v(boolean z3) {
        this.f3185Q = z3;
        int i3 = 8;
        int i4 = z3 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f3200s.getText());
        this.f3204w.setVisibility(i4);
        u(!isEmpty);
        this.f3201t.setVisibility(z3 ? 8 : 0);
        ImageView imageView = this.f3175G;
        imageView.setVisibility((imageView.getDrawable() == null || this.f3184P) ? 8 : 0);
        q();
        if (this.f3192a0 && !this.f3185Q && isEmpty) {
            this.f3205x.setVisibility(8);
            i3 = 0;
        }
        this.f3207z.setVisibility(i3);
        t();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3171C = new Rect();
        this.f3172D = new Rect();
        this.f3173E = new int[2];
        this.f3174F = new int[2];
        this.f3198g0 = new RunnableC0346y0(this, 0);
        this.f3199h0 = new RunnableC0346y0(this, 1);
        this.i0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        A0 a02 = new A0(this);
        B0 b02 = new B0(this);
        C0309f0 c0309f0 = new C0309f0(1, this);
        w wVar = new w(this, 1);
        int[] iArr = AbstractC0262a.f4307r;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, 0);
        B0.a aVar2 = new B0.a(context, obtainStyledAttributes);
        AbstractC0189K.i(this, context, iArr, attributeSet, obtainStyledAttributes, i3);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f3200s = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f3201t = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f3202u = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f3203v = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f3204w = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f3205x = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f3206y = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f3207z = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f3175G = imageView5;
        findViewById.setBackground(aVar2.m(20));
        findViewById2.setBackground(aVar2.m(25));
        imageView.setImageDrawable(aVar2.m(23));
        imageView2.setImageDrawable(aVar2.m(15));
        imageView3.setImageDrawable(aVar2.m(12));
        imageView4.setImageDrawable(aVar2.m(28));
        imageView5.setImageDrawable(aVar2.m(23));
        this.f3176H = aVar2.m(22);
        V0.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f3177I = obtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f3178J = obtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(wVar);
        searchAutoComplete.setOnEditorActionListener(a02);
        searchAutoComplete.setOnItemClickListener(b02);
        searchAutoComplete.setOnItemSelectedListener(c0309f0);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new z0(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f3181M = obtainStyledAttributes.getText(14);
        this.f3188T = obtainStyledAttributes.getText(21);
        int i4 = obtainStyledAttributes.getInt(6, -1);
        if (i4 != -1) {
            setImeOptions(i4);
        }
        int i5 = obtainStyledAttributes.getInt(5, -1);
        if (i5 != -1) {
            setInputType(i5);
        }
        setFocusable(obtainStyledAttributes.getBoolean(1, true));
        aVar2.C();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f3179K = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f3180L = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f3169A = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new L1.a(1, this));
        }
        v(this.f3184P);
        s();
    }
}
