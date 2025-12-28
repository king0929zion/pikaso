package q1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* renamed from: q1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574e extends Z.b {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f6060a;

    /* renamed from: b, reason: collision with root package name */
    public final C0572c f6061b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6062c = true;

    public C0574e(TextView textView) {
        this.f6060a = textView;
        this.f6061b = new C0572c(textView);
    }

    @Override // Z.b
    public final void L(boolean z3) {
        if (z3) {
            S();
        }
    }

    @Override // Z.b
    public final void M(boolean z3) {
        this.f6062c = z3;
        S();
        TextView textView = this.f6060a;
        textView.setFilters(t(textView.getFilters()));
    }

    public final void S() {
        TextView textView = this.f6060a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f6062c) {
            if (!(transformationMethod instanceof i) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new i(transformationMethod);
            }
        } else if (transformationMethod instanceof i) {
            transformationMethod = ((i) transformationMethod).f6068a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // Z.b
    public final InputFilter[] t(InputFilter[] inputFilterArr) {
        if (!this.f6062c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i3 = 0; i3 < inputFilterArr.length; i3++) {
                InputFilter inputFilter = inputFilterArr[i3];
                if (inputFilter instanceof C0572c) {
                    sparseArray.put(i3, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                if (sparseArray.indexOfKey(i5) < 0) {
                    inputFilterArr2[i4] = inputFilterArr[i5];
                    i4++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i6 = 0;
        while (true) {
            C0572c c0572c = this.f6061b;
            if (i6 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0572c;
                return inputFilterArr3;
            }
            if (inputFilterArr[i6] == c0572c) {
                return inputFilterArr;
            }
            i6++;
        }
    }
}
