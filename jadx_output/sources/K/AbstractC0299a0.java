package k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.ai.assistance.operit.provider.R;
import java.lang.reflect.InvocationTargetException;

/* renamed from: k.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0299a0 extends ListView {

    /* renamed from: d, reason: collision with root package name */
    public final Rect f4742d;

    /* renamed from: e, reason: collision with root package name */
    public int f4743e;

    /* renamed from: f, reason: collision with root package name */
    public int f4744f;

    /* renamed from: g, reason: collision with root package name */
    public int f4745g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f4746i;

    /* renamed from: j, reason: collision with root package name */
    public Y f4747j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4748k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4749l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4750m;

    /* renamed from: n, reason: collision with root package name */
    public j1.g f4751n;

    /* renamed from: o, reason: collision with root package name */
    public M1.h f4752o;

    public AbstractC0299a0(Context context, boolean z3) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f4742d = new Rect();
        this.f4743e = 0;
        this.f4744f = 0;
        this.f4745g = 0;
        this.h = 0;
        this.f4749l = z3;
        setCacheColorHint(0);
    }

    public final int a(int i3, int i4) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i5 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            view.measure(i3, i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i4) {
                return i4;
            }
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0147 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractC0299a0.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f4742d;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f4752o != null) {
            return;
        }
        super.drawableStateChanged();
        Y y3 = this.f4747j;
        if (y3 != null) {
            y3.f4738e = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f4750m && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f4749l || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f4749l || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f4749l || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f4749l && this.f4748k) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f4752o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i3 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f4752o == null) {
            M1.h hVar = new M1.h(3, this);
            this.f4752o = hVar;
            post(hVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i3 < 30 || !W.f4735d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            W.f4732a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            W.f4733b.invoke(this, Integer.valueOf(pointToPosition));
                            W.f4734c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e3) {
                            e3.printStackTrace();
                        } catch (InvocationTargetException e4) {
                            e4.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f4750m && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4746i = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        M1.h hVar = this.f4752o;
        if (hVar != null) {
            AbstractC0299a0 abstractC0299a0 = (AbstractC0299a0) hVar.f1689e;
            abstractC0299a0.f4752o = null;
            abstractC0299a0.removeCallbacks(hVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z3) {
        this.f4748k = z3;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        Y y3 = null;
        if (drawable != null) {
            Y y4 = new Y();
            Drawable drawable2 = y4.f4737d;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            y4.f4737d = drawable;
            drawable.setCallback(y4);
            y4.f4738e = true;
            y3 = y4;
        }
        this.f4747j = y3;
        super.setSelector(y3);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f4743e = rect.left;
        this.f4744f = rect.top;
        this.f4745g = rect.right;
        this.h = rect.bottom;
    }
}
