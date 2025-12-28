package Z0;

import A.AbstractC0000a;
import A.t;
import D.C0032d;
import D.C0048l;
import D.C0052n;
import D.C0053n0;
import D.InterfaceC0045j0;
import D1.w;
import M1.j;
import P.i;
import P.l;
import P.m;
import V.f;
import W.C0089l;
import a.AbstractC0090a;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import b0.AbstractC0135b;
import b1.C0138c;
import c2.C0170i;
import com.ai.assistance.operit.provider.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d1.AbstractC0189K;
import d1.C0188J;
import g2.C0269b;
import g2.C0277j;
import g2.InterfaceC0274g;
import g2.InterfaceC0275h;
import g2.InterfaceC0276i;
import h0.k;
import j1.n;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import k.J;
import l0.C0354d;
import l0.C0355e;
import l0.InterfaceC0357g;
import l0.InterfaceC0360j;
import l0.o;
import l0.s;
import n0.AbstractC0409C;
import n0.AbstractC0418L;
import n0.AbstractC0428i;
import n0.C0423d;
import n0.C0424e;
import n0.C0429j;
import n0.C0444z;
import n0.InterfaceC0425f;
import n0.Y;
import n0.l0;
import o0.AbstractC0479f0;
import p1.C0546b;
import q.C0548A;
import q.C0549B;
import q.z;
import t.r;
import t0.h;
import v0.C0612A;
import v0.C0613B;
import v0.C0618c;
import w.C0627a;
import w.C0629c;
import w2.g;
import y.AbstractC0664b;
import z0.InterfaceC0721e;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2902a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f2903b;

    public static final int A(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static boolean B(int i3, Rect rect, Rect rect2) {
        if (i3 == 17) {
            int i4 = rect.right;
            int i5 = rect2.right;
            return (i4 > i5 || rect.left >= i5) && rect.left > rect2.left;
        }
        if (i3 == 33) {
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            return (i6 > i7 || rect.top >= i7) && rect.top > rect2.top;
        }
        if (i3 == 66) {
            int i8 = rect.left;
            int i9 = rect2.left;
            return (i8 < i9 || rect.right <= i9) && rect.right < rect2.right;
        }
        if (i3 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i10 = rect.top;
        int i11 = rect2.top;
        return (i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom;
    }

    public static final boolean C(k kVar, long j3) {
        long j4 = kVar.f4366c;
        float b3 = V.c.b(j4);
        float c3 = V.c.c(j4);
        return b3 < 0.0f || b3 > ((float) ((int) (j3 >> 32))) || c3 < 0.0f || c3 > ((float) ((int) (j3 & 4294967295L)));
    }

    public static g D(o2.e eVar) {
        g gVar = new g();
        gVar.f6573f = Z.b.n(gVar, gVar, eVar);
        return gVar;
    }

    public static int E(int i3, Rect rect, Rect rect2) {
        int i4;
        int i5;
        if (i3 == 17) {
            i4 = rect.left;
            i5 = rect2.right;
        } else if (i3 == 33) {
            i4 = rect.top;
            i5 = rect2.bottom;
        } else if (i3 == 66) {
            i4 = rect2.left;
            i5 = rect.right;
        } else {
            if (i3 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i4 = rect2.top;
            i5 = rect.bottom;
        }
        return Math.max(0, i4 - i5);
    }

    public static j F(r rVar, int i3, int i4, int i5, int i6, int i7, AbstractC0418L abstractC0418L, List list, o[] oVarArr, int i8) {
        int[] iArr = new int[i8];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i9 < i8) {
            InterfaceC0360j interfaceC0360j = (InterfaceC0360j) list.get(i9);
            interfaceC0360j.o();
            int i13 = i5 - i10;
            o oVar = oVarArr[i9];
            if (oVar == null) {
                oVar = interfaceC0360j.a(rVar.b(i5 != Integer.MAX_VALUE ? i13 < 0 ? 0 : i13 : Integer.MAX_VALUE, i6, false));
            }
            int d3 = rVar.d(oVar);
            int c3 = rVar.c(oVar);
            iArr[i9] = d3;
            int i14 = i13 - d3;
            if (i14 < 0) {
                i14 = 0;
            }
            int min = Math.min(i7, i14);
            i10 += d3 + min;
            i12 = Math.max(i12, c3);
            oVarArr[i9] = oVar;
            i9++;
            i11 = min;
        }
        int i15 = i10 - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int max = Math.max(i15, i3);
        int max2 = Math.max(i12, Math.max(i4, 0));
        int[] iArr2 = new int[i8];
        for (int i16 = 0; i16 < i8; i16++) {
            iArr2[i16] = 0;
        }
        rVar.e(max, iArr, iArr2, abstractC0418L);
        return rVar.a(oVarArr, abstractC0418L, iArr2, max, max2);
    }

    public static int G(int i3, Rect rect, Rect rect2) {
        if (i3 != 17) {
            if (i3 != 33) {
                if (i3 != 66) {
                    if (i3 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static InterfaceC0276i H(InterfaceC0274g interfaceC0274g, InterfaceC0275h interfaceC0275h) {
        p2.g.e(interfaceC0275h, "key");
        return p2.g.a(interfaceC0274g.getKey(), interfaceC0275h) ? C0277j.f4334d : interfaceC0274g;
    }

    public static InterfaceC0276i K(InterfaceC0274g interfaceC0274g, InterfaceC0276i interfaceC0276i) {
        p2.g.e(interfaceC0276i, "context");
        return interfaceC0276i == C0277j.f4334d ? interfaceC0274g : (InterfaceC0276i) interfaceC0276i.l(interfaceC0274g, C0269b.f4329g);
    }

    public static C0546b L(MappedByteBuffer mappedByteBuffer) {
        long j3;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i3 = duplicate.getShort() & 65535;
        if (i3 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                j3 = -1;
                break;
            }
            int i5 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j3 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i5) {
                break;
            }
            i4++;
        }
        if (j3 != -1) {
            duplicate.position(duplicate.position() + ((int) (j3 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j4 = duplicate.getInt() & 4294967295L;
            for (int i6 = 0; i6 < j4; i6++) {
                int i7 = duplicate.getInt();
                long j5 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i7 || 1701669481 == i7) {
                    duplicate.position((int) (j5 + j3));
                    C0546b c0546b = new C0546b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    c0546b.f5940b = duplicate;
                    c0546b.f5939a = position;
                    int i8 = position - duplicate.getInt(position);
                    c0546b.f5941c = i8;
                    c0546b.f5942d = c0546b.f5940b.getShort(i8);
                    return c0546b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void M(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        W0.a.h(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static void N(TextView textView, int i3) {
        Z.b.f(i3);
        if (Build.VERSION.SDK_INT >= 28) {
            n.d(textView, i3);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i3 > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), i3 + i4, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void O(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        Field field = AbstractC0189K.f4150a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z3 = onLongClickListener != null;
        boolean z4 = hasOnClickListeners || z3;
        checkableImageButton.setFocusable(z4);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z3);
        checkableImageButton.setImportantForAccessibility(z4 ? 1 : 2);
    }

    public static void P(TextView textView, int i3) {
        Z.b.f(i3);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i3 > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i3 - i4);
        }
    }

    public static void Q(EditorInfo editorInfo, CharSequence charSequence, int i3, int i4) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i3);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i4);
    }

    public static final void R(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void S(String str) {
        throw new IllegalStateException(str);
    }

    public static final void T(String str) {
        throw new IllegalStateException(str);
    }

    public static final void U(Object obj) {
        if (obj instanceof C0170i) {
            throw ((C0170i) obj).f3835d;
        }
    }

    public static final long V(long j3, long j4) {
        float d3 = f.d(j3);
        long j5 = s.f4937a;
        if (j4 == j5) {
            S("ScaleFactor is unspecified");
            throw null;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) * d3;
        float b3 = f.b(j3);
        if (j4 != j5) {
            return AbstractC0090a.d(intBitsToFloat, Float.intBitsToFloat((int) (j4 & 4294967295L)) * b3);
        }
        S("ScaleFactor is unspecified");
        throw null;
    }

    public static ActionMode.Callback W(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof j1.o) || callback == null) ? callback : new j1.o(callback, textView);
    }

    public static final void a(String str, l lVar, C0613B c0613b, o2.c cVar, int i3, boolean z3, int i4, int i5, t tVar, C0052n c0052n, int i6) {
        int i7;
        t tVar2;
        C0052n c0052n2;
        l c3;
        c0052n.O(-1186827822);
        if ((i6 & 6) == 0) {
            i7 = (c0052n.f(str) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0052n.f(lVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0052n.f(c0613b) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0052n.h(cVar) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0052n.d(i3) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i7 |= c0052n.g(z3) ? 131072 : 65536;
        }
        if ((1572864 & i6) == 0) {
            i7 |= c0052n.d(i4) ? 1048576 : 524288;
        }
        if ((12582912 & i6) == 0) {
            i7 |= c0052n.d(i5) ? 8388608 : 4194304;
        }
        if (((i7 | 100663296) & 38347923) == 38347922 && c0052n.y()) {
            c0052n.K();
            tVar2 = tVar;
        } else {
            if (i5 <= 0 || i4 <= 0) {
                throw new IllegalArgumentException(("both minLines " + i5 + " and maxLines " + i4 + " must be greater than zero").toString());
            }
            if (i5 > i4) {
                throw new IllegalArgumentException(AbstractC0000a.d("minLines ", i5, " must be less than or equal to maxLines ", i4).toString());
            }
            if (c0052n.k(AbstractC0664b.f6737a) != null) {
                throw new ClassCastException();
            }
            c0052n.N(-1588686502);
            c0052n.q(false);
            tVar2 = null;
            if (cVar != null) {
                c0052n.N(-1588564052);
                c3 = androidx.compose.ui.graphics.a.a(lVar, 0.0f, null, false, 131071).c(i.f2087a).c(new TextAnnotatedStringElement(new C0618c(str, null, null, null), c0613b, (InterfaceC0721e) c0052n.k(AbstractC0479f0.f5576i), cVar, i3, z3, i4, i5, null));
                c0052n.q(false);
                c0052n2 = c0052n;
            } else {
                c0052n.N(-1587866335);
                c0052n2 = c0052n;
                c3 = androidx.compose.ui.graphics.a.a(lVar, 0.0f, null, false, 131071).c(new TextStringSimpleElement(str, c0613b, (InterfaceC0721e) c0052n.k(AbstractC0479f0.f5576i), i3, z3, i4, i5, null));
                c0052n2.q(false);
            }
            C0629c c0629c = C0629c.f6494a;
            int i8 = c0052n2.f805M;
            l b3 = m.b(c0052n2, c3);
            InterfaceC0045j0 m2 = c0052n.m();
            InterfaceC0425f.f5247c.getClass();
            C0429j c0429j = C0424e.f5242b;
            c0052n.P();
            if (c0052n2.f804L) {
                c0052n2.l(c0429j);
            } else {
                c0052n.Y();
            }
            C0032d.G(c0052n2, c0629c, C0424e.f5245e);
            C0032d.G(c0052n2, m2, C0424e.f5244d);
            C0032d.G(c0052n2, b3, C0424e.f5243c);
            C0423d c0423d = C0424e.f5246f;
            if (c0052n2.f804L || !p2.g.a(c0052n.H(), Integer.valueOf(i8))) {
                c0052n2.V(Integer.valueOf(i8));
                c0052n2.b(Integer.valueOf(i8), c0423d);
            }
            c0052n2.q(true);
        }
        C0053n0 s3 = c0052n.s();
        if (s3 != null) {
            s3.f834d = new C0627a(str, lVar, c0613b, cVar, i3, z3, i4, i5, tVar2, i6);
        }
    }

    public static final void b(AbstractC0135b abstractC0135b, String str, l lVar, P.d dVar, C0354d c0354d, float f3, C0089l c0089l, C0052n c0052n, int i3) {
        int i4;
        P.d dVar2;
        l lVar2;
        float f4;
        C0089l c0089l2;
        C0354d c0354d2;
        int i5 = 0;
        c0052n.O(1142754848);
        if ((i3 & 6) == 0) {
            i4 = (c0052n.h(abstractC0135b) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0052n.f(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0052n.f(lVar) ? 256 : 128;
        }
        int i6 = i4 | 1797120;
        if ((599187 & i6) == 599186 && c0052n.y()) {
            c0052n.K();
            dVar2 = dVar;
            c0354d2 = c0354d;
            f4 = f3;
            c0089l2 = c0089l;
        } else {
            dVar2 = P.a.h;
            C0354d c0354d3 = C0355e.f4920a;
            if (str != null) {
                c0052n.N(1040258775);
                boolean z3 = (i6 & 112) == 32;
                Object H2 = c0052n.H();
                if (z3 || H2 == C0048l.f781a) {
                    H2 = new C0549B(str, i5);
                    c0052n.V(H2);
                }
                AtomicInteger atomicInteger = h.f6233a;
                lVar2 = new AppendedSemanticsElement((o2.c) H2, false);
                c0052n.q(false);
            } else {
                c0052n.N(1040398089);
                c0052n.q(false);
                lVar2 = i.f2087a;
            }
            l a3 = androidx.compose.ui.draw.a.a(androidx.compose.ui.graphics.a.a(lVar.c(lVar2), 0.0f, null, true, 126975), abstractC0135b, dVar2, c0354d3, 1.0f, null);
            z zVar = z.f6047a;
            int i7 = c0052n.f805M;
            l b3 = m.b(c0052n, a3);
            InterfaceC0045j0 m2 = c0052n.m();
            InterfaceC0425f.f5247c.getClass();
            C0429j c0429j = C0424e.f5242b;
            c0052n.P();
            if (c0052n.f804L) {
                c0052n.l(c0429j);
            } else {
                c0052n.Y();
            }
            C0032d.G(c0052n, zVar, C0424e.f5245e);
            C0032d.G(c0052n, m2, C0424e.f5244d);
            C0032d.G(c0052n, b3, C0424e.f5243c);
            C0423d c0423d = C0424e.f5246f;
            if (c0052n.f804L || !p2.g.a(c0052n.H(), Integer.valueOf(i7))) {
                c0052n.V(Integer.valueOf(i7));
                c0052n.b(Integer.valueOf(i7), c0423d);
            }
            c0052n.q(true);
            f4 = 1.0f;
            c0089l2 = null;
            c0354d2 = c0354d3;
        }
        C0053n0 s3 = c0052n.s();
        if (s3 != null) {
            s3.f834d = new C0548A(abstractC0135b, str, lVar, dVar2, c0354d2, f4, c0089l2, i3);
        }
    }

    public static final long c(float f3, float f4) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
        int i3 = s.f4938b;
        return floatToRawIntBits;
    }

    public static final t0.k d(C0444z c0444z, boolean z3) {
        P.k kVar = (P.k) c0444z.f5319x.f857f;
        Object obj = null;
        if ((kVar.f2091g & 8) != 0) {
            loop0: while (true) {
                if (kVar == null) {
                    break;
                }
                if ((kVar.f2090f & 8) != 0) {
                    P.k kVar2 = kVar;
                    F.d dVar = null;
                    while (kVar2 != null) {
                        if (kVar2 instanceof l0) {
                            obj = kVar2;
                            break loop0;
                        }
                        if ((kVar2.f2090f & 8) != 0 && (kVar2 instanceof AbstractC0428i)) {
                            int i3 = 0;
                            for (P.k kVar3 = ((AbstractC0428i) kVar2).f5256r; kVar3 != null; kVar3 = kVar3.f2092i) {
                                if ((kVar3.f2090f & 8) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        kVar2 = kVar3;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new F.d(new P.k[16]);
                                        }
                                        if (kVar2 != null) {
                                            dVar.b(kVar2);
                                            kVar2 = null;
                                        }
                                        dVar.b(kVar3);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        kVar2 = AbstractC0409C.e(dVar);
                    }
                }
                if ((kVar.f2091g & 8) == 0) {
                    break;
                }
                kVar = kVar.f2092i;
            }
        }
        p2.g.b(obj);
        P.k kVar4 = ((P.k) ((l0) obj)).f2088d;
        t0.g i4 = c0444z.i();
        p2.g.b(i4);
        return new t0.k(kVar4, z3, c0444z, i4);
    }

    public static final long e(int i3, int i4) {
        if (i3 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i3 + ", end: " + i4 + ']').toString());
        }
        if (i4 >= 0) {
            long j3 = (i4 & 4294967295L) | (i3 << 32);
            int i5 = C0612A.f6316c;
            return j3;
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i3 + ", end: " + i4 + ']').toString());
    }

    public static void f(Throwable th, Throwable th2) {
        p2.g.e(th, "<this>");
        p2.g.e(th2, "exception");
        if (th != th2) {
            Integer num = k2.a.f4911a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = j2.a.f4630a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void g(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                W0.a.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                W0.a.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                W0.a.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0056 -> B:10:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(h0.p r7, i2.a r8) {
        /*
            boolean r0 = r8 instanceof r.C0576a
            if (r0 == 0) goto L13
            r0 = r8
            r.a r0 = (r.C0576a) r0
            int r1 = r0.f6070i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6070i = r1
            goto L18
        L13:
            r.a r0 = new r.a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.h
            h2.a r1 = h2.a.f4407d
            int r2 = r0.f6070i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            h0.p r7 = r0.f6069g
            U(r8)
            goto L59
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            U(r8)
            h0.r r8 = r7.h
            h0.f r8 = r8.f4402v
            java.lang.Object r8 = r8.f4356a
            int r2 = r8.size()
            r5 = r4
        L40:
            if (r5 >= r2) goto L75
            java.lang.Object r6 = r8.get(r5)
            h0.k r6 = (h0.k) r6
            boolean r6 = r6.f4367d
            if (r6 == 0) goto L72
        L4c:
            h0.g r8 = h0.g.f4360f
            r0.f6069g = r7
            r0.f6070i = r3
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            h0.f r8 = (h0.f) r8
            java.lang.Object r8 = r8.f4356a
            int r2 = r8.size()
            r5 = r4
        L62:
            if (r5 >= r2) goto L75
            java.lang.Object r6 = r8.get(r5)
            h0.k r6 = (h0.k) r6
            boolean r6 = r6.f4367d
            if (r6 == 0) goto L6f
            goto L4c
        L6f:
            int r5 = r5 + 1
            goto L62
        L72:
            int r5 = r5 + 1
            goto L40
        L75:
            c2.m r7 = c2.C0174m.f3840a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.d.h(h0.p, i2.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r9 == 17) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = E(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003a, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0041, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = j(r9, r10, r11)
            boolean r1 = j(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L78
            if (r0 != 0) goto Lf
            goto L78
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L77
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L77
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L77
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L77
        L43:
            if (r9 == r5) goto L77
            if (r9 != r4) goto L48
            goto L77
        L48:
            int r11 = E(r9, r10, r11)
            if (r9 == r5) goto L6a
            if (r9 == r3) goto L65
            if (r9 == r4) goto L60
            if (r9 != r1) goto L5a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L58:
            int r9 = r9 - r10
            goto L6f
        L5a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L60:
            int r9 = r12.right
            int r10 = r10.right
            goto L58
        L65:
            int r9 = r10.top
            int r10 = r12.top
            goto L58
        L6a:
            int r9 = r10.left
            int r10 = r12.left
            goto L58
        L6f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L76
            r2 = r6
        L76:
            return r2
        L77:
            return r6
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.d.i(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean j(int i3, Rect rect, Rect rect2) {
        if (i3 != 17) {
            if (i3 != 33) {
                if (i3 != 66) {
                    if (i3 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final V.d k(InterfaceC0357g interfaceC0357g) {
        InterfaceC0357g p3 = interfaceC0357g.p();
        return p3 != null ? p3.h(interfaceC0357g, true) : new V.d(0.0f, 0.0f, (int) (interfaceC0357g.t() >> 32), (int) (interfaceC0357g.t() & 4294967295L));
    }

    public static final V.d l(Y y3) {
        InterfaceC0357g v3 = v(y3);
        float t3 = (int) (v3.t() >> 32);
        float t4 = (int) (v3.t() & 4294967295L);
        V.d h = v(y3).h(y3, true);
        float f3 = h.f2446a;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > t3) {
            f3 = t3;
        }
        float f4 = h.f2447b;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > t4) {
            f4 = t4;
        }
        float f5 = h.f2448c;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 <= t3) {
            t3 = f5;
        }
        float f6 = h.f2449d;
        float f7 = f6 >= 0.0f ? f6 : 0.0f;
        if (f7 <= t4) {
            t4 = f7;
        }
        if (f3 == t3 || f4 == t4) {
            return V.d.f2445e;
        }
        long j3 = v3.j(r2.a.f(f3, f4));
        long j4 = v3.j(r2.a.f(t3, f4));
        long j5 = v3.j(r2.a.f(t3, t4));
        long j6 = v3.j(r2.a.f(f3, t4));
        float b3 = V.c.b(j3);
        float b4 = V.c.b(j4);
        float b5 = V.c.b(j6);
        float b6 = V.c.b(j5);
        float min = Math.min(b3, Math.min(b4, Math.min(b5, b6)));
        float max = Math.max(b3, Math.max(b4, Math.max(b5, b6)));
        float c3 = V.c.c(j3);
        float c4 = V.c.c(j4);
        float c5 = V.c.c(j6);
        float c6 = V.c.c(j5);
        return new V.d(min, Math.min(c3, Math.min(c4, Math.min(c5, c6))), max, Math.max(c3, Math.max(c4, Math.max(c5, c6))));
    }

    public static final boolean m(k kVar) {
        return !kVar.h && kVar.f4367d;
    }

    public static final boolean n(k kVar) {
        return kVar.h && !kVar.f4367d;
    }

    public static ImageView.ScaleType o(int i3) {
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 5 ? i3 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static Handler p(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e5) {
            e = e5;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final C0170i q(Throwable th) {
        p2.g.e(th, "exception");
        return new C0170i(th);
    }

    public static boolean r(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        Field field = AbstractC0189K.f4150a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C0188J.f4146d;
        C0188J c0188j = (C0188J) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c0188j == null) {
            c0188j = new C0188J();
            c0188j.f4147a = null;
            c0188j.f4148b = null;
            c0188j.f4149c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c0188j);
        }
        WeakReference weakReference2 = c0188j.f4149c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c0188j.f4149c = new WeakReference(keyEvent);
        if (c0188j.f4148b == null) {
            c0188j.f4148b = new SparseArray();
        }
        SparseArray sparseArray = c0188j.f4148b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static final boolean s(long j3, long j4) {
        return j3 == j4;
    }

    public static final int t(int i3, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            v0.k kVar = (v0.k) arrayList.get(i5);
            char c3 = kVar.f6360b > i3 ? (char) 1 : kVar.f6361c <= i3 ? (char) 65535 : (char) 0;
            if (c3 < 0) {
                i4 = i5 + 1;
            } else {
                if (c3 <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static final int u(int i3, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            v0.k kVar = (v0.k) arrayList.get(i5);
            char c3 = kVar.f6362d > i3 ? (char) 1 : kVar.f6363e <= i3 ? (char) 65535 : (char) 0;
            if (c3 < 0) {
                i4 = i5 + 1;
            } else {
                if (c3 <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static final InterfaceC0357g v(InterfaceC0357g interfaceC0357g) {
        InterfaceC0357g interfaceC0357g2;
        InterfaceC0357g p3 = interfaceC0357g.p();
        while (true) {
            InterfaceC0357g interfaceC0357g3 = p3;
            interfaceC0357g2 = interfaceC0357g;
            interfaceC0357g = interfaceC0357g3;
            if (interfaceC0357g == null) {
                break;
            }
            p3 = interfaceC0357g.p();
        }
        Y y3 = interfaceC0357g2 instanceof Y ? (Y) interfaceC0357g2 : null;
        if (y3 == null) {
            return interfaceC0357g2;
        }
        Y y4 = y3.f5219p;
        while (true) {
            Y y5 = y4;
            Y y6 = y3;
            y3 = y5;
            if (y3 == null) {
                return y6;
            }
            y4 = y3.f5219p;
        }
    }

    public static InterfaceC0274g w(InterfaceC0274g interfaceC0274g, InterfaceC0275h interfaceC0275h) {
        p2.g.e(interfaceC0275h, "key");
        if (p2.g.a(interfaceC0274g.getKey(), interfaceC0275h)) {
            return interfaceC0274g;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class x(v2.b bVar) {
        p2.g.e(bVar, "<this>");
        Class a3 = ((p2.c) bVar).a();
        if (!a3.isPrimitive()) {
            return a3;
        }
        String name = a3.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return a3;
    }

    public static final l0 y(C0444z c0444z) {
        P.k kVar = (P.k) c0444z.f5319x.f857f;
        Object obj = null;
        if ((kVar.f2091g & 8) != 0) {
            loop0: while (true) {
                if (kVar == null) {
                    break;
                }
                if ((kVar.f2090f & 8) != 0) {
                    P.k kVar2 = kVar;
                    F.d dVar = null;
                    while (kVar2 != null) {
                        if (kVar2 instanceof l0) {
                            if (((l0) kVar2).G()) {
                                obj = kVar2;
                                break loop0;
                            }
                        } else if ((kVar2.f2090f & 8) != 0 && (kVar2 instanceof AbstractC0428i)) {
                            int i3 = 0;
                            for (P.k kVar3 = ((AbstractC0428i) kVar2).f5256r; kVar3 != null; kVar3 = kVar3.f2092i) {
                                if ((kVar3.f2090f & 8) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        kVar2 = kVar3;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new F.d(new P.k[16]);
                                        }
                                        if (kVar2 != null) {
                                            dVar.b(kVar2);
                                            kVar2 = null;
                                        }
                                        dVar.b(kVar3);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        kVar2 = AbstractC0409C.e(dVar);
                    }
                }
                if ((kVar.f2091g & 8) == 0) {
                    break;
                }
                kVar = kVar.f2092i;
            }
        }
        return (l0) obj;
    }

    public static C0138c z(J j3) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            return new C0138c(n.c(j3));
        }
        TextPaint textPaint = new TextPaint(j3.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a3 = j1.l.a(j3);
        int d3 = j1.l.d(j3);
        if (j3.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i3 < 28 || (j3.getInputType() & 15) != 3) {
                boolean z3 = j3.getLayoutDirection() == 1;
                switch (j3.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z3) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(n.b(j1.m.a(j3.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new C0138c(textPaint, textDirectionHeuristic, a3, d3);
    }

    public abstract void I(Throwable th);

    public abstract void J(w wVar);
}
