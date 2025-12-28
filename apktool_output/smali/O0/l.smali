.class public final LO0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:[I

.field public static final e:Landroid/util/SparseIntArray;


# instance fields
.field public final a:Ljava/util/HashMap;

.field public final b:Z

.field public final c:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/16 v2, 0x8

    filled-new-array {v0, v1, v2}, [I

    move-result-object v3

    sput-object v3, LO0/l;->d:[I

    new-instance v3, Landroid/util/SparseIntArray;

    invoke-direct {v3}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v3, LO0/l;->e:Landroid/util/SparseIntArray;

    const/16 v4, 0x4c

    const/16 v5, 0x19

    invoke-virtual {v3, v4, v5}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v6, 0x4d

    const/16 v7, 0x1a

    invoke-virtual {v3, v6, v7}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v8, 0x4f

    const/16 v9, 0x1d

    invoke-virtual {v3, v8, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v10, 0x50

    const/16 v11, 0x1e

    invoke-virtual {v3, v10, v11}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v12, 0x56

    const/16 v13, 0x24

    invoke-virtual {v3, v12, v13}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v12, 0x55

    const/16 v13, 0x23

    invoke-virtual {v3, v12, v13}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v12, 0x3a

    invoke-virtual {v3, v12, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v13, 0x39

    const/4 v14, 0x3

    invoke-virtual {v3, v13, v14}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v15, 0x37

    const/4 v10, 0x1

    invoke-virtual {v3, v15, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v6, 0x5e

    const/4 v4, 0x6

    invoke-virtual {v3, v6, v4}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v6, 0x5f

    const/4 v11, 0x7

    invoke-virtual {v3, v6, v11}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v6, 0x41

    const/16 v9, 0x11

    invoke-virtual {v3, v6, v9}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v10, 0x12

    const/16 v8, 0x42

    invoke-virtual {v3, v8, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v10, 0x43

    const/16 v8, 0x13

    invoke-virtual {v3, v10, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v8, 0x1b

    invoke-virtual {v3, v0, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x51

    const/16 v8, 0x20

    invoke-virtual {v3, v0, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x21

    const/16 v8, 0x52

    invoke-virtual {v3, v8, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x40

    const/16 v10, 0xa

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x3f

    const/16 v10, 0x9

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x62

    const/16 v10, 0xd

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x65

    const/16 v10, 0x10

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x63

    const/16 v10, 0xe

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x60

    const/16 v10, 0xb

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x64

    const/16 v10, 0xf

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x61

    const/16 v10, 0xc

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x59

    const/16 v10, 0x28

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x4a

    const/16 v10, 0x27

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x49

    const/16 v10, 0x29

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x58

    const/16 v10, 0x2a

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x48

    const/16 v10, 0x14

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x57

    const/16 v10, 0x25

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x3e

    const/4 v10, 0x5

    invoke-virtual {v3, v0, v10}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x4b

    invoke-virtual {v3, v0, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x54

    invoke-virtual {v3, v0, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x4e

    invoke-virtual {v3, v0, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x38

    invoke-virtual {v3, v0, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x36

    invoke-virtual {v3, v0, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v0, 0x5

    const/16 v8, 0x18

    invoke-virtual {v3, v0, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x1c

    invoke-virtual {v3, v11, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x17

    const/16 v8, 0x1f

    invoke-virtual {v3, v0, v8}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x18

    invoke-virtual {v3, v0, v2}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x22

    invoke-virtual {v3, v4, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v0, 0x2

    invoke-virtual {v3, v2, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x17

    invoke-virtual {v3, v14, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x15

    invoke-virtual {v3, v1, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/4 v0, 0x2

    const/16 v1, 0x16

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0xd

    const/16 v1, 0x2b

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x2c

    invoke-virtual {v3, v7, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x15

    const/16 v1, 0x2d

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x16

    const/16 v1, 0x2e

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x14

    const/16 v1, 0x3c

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x12

    const/16 v1, 0x2f

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x13

    const/16 v1, 0x30

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0xe

    const/16 v1, 0x31

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0xf

    const/16 v1, 0x32

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x10

    const/16 v1, 0x33

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x34

    invoke-virtual {v3, v9, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x35

    invoke-virtual {v3, v5, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x5a

    const/16 v1, 0x36

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x44

    invoke-virtual {v3, v0, v15}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x5b

    const/16 v1, 0x38

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x45

    invoke-virtual {v3, v0, v13}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x5c

    invoke-virtual {v3, v0, v12}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x46

    const/16 v1, 0x3b

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x3b

    const/16 v1, 0x3d

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x3d

    const/16 v1, 0x3e

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x3c

    const/16 v1, 0x3f

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x1b

    const/16 v1, 0x40

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x6a

    invoke-virtual {v3, v0, v6}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x21

    const/16 v1, 0x42

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x6b

    const/16 v1, 0x43

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x67

    const/16 v1, 0x4f

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x26

    const/4 v1, 0x1

    invoke-virtual {v3, v1, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x66

    const/16 v1, 0x44

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x5d

    const/16 v1, 0x45

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x47

    const/16 v1, 0x46

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x1f

    const/16 v1, 0x47

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x48

    const/16 v1, 0x1d

    invoke-virtual {v3, v1, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x49

    const/16 v1, 0x1e

    invoke-virtual {v3, v1, v0}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x20

    const/16 v1, 0x4a

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x1c

    const/16 v1, 0x4b

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x68

    const/16 v1, 0x4c

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x53

    const/16 v1, 0x4d

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x6c

    const/16 v1, 0x4e

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x35

    const/16 v1, 0x50

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    const/16 v0, 0x34

    const/16 v1, 0x51

    invoke-virtual {v3, v0, v1}, Landroid/util/SparseIntArray;->append(II)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LO0/l;->a:Ljava/util/HashMap;

    const/4 v0, 0x1

    iput-boolean v0, p0, LO0/l;->b:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LO0/l;->c:Ljava/util/HashMap;

    return-void
.end method

.method public static c(Landroidx/constraintlayout/widget/Barrier;Ljava/lang/String;)[I
    .locals 10

    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    array-length v1, p1

    new-array v1, v1, [I

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    array-length v5, p1

    if-ge v3, v5, :cond_4

    aget-object v5, p1, v3

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    :try_start_0
    const-class v7, LO0/o;

    invoke-virtual {v7, v5}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move v7, v2

    :goto_1
    if-nez v7, :cond_0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const-string v8, "id"

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v5, v8, v9}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    :cond_0
    if-nez v7, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v8

    instance-of v8, v8, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v8, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v8

    check-cast v8, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v5, :cond_1

    iget-object v9, v8, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Ljava/util/HashMap;

    if-eqz v9, :cond_2

    invoke-virtual {v9, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    iget-object v6, v8, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Ljava/util/HashMap;

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_2

    :cond_1
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_2
    :goto_2
    if-eqz v6, :cond_3

    instance-of v5, v6, Ljava/lang/Integer;

    if-eqz v5, :cond_3

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v7

    :cond_3
    add-int/lit8 v5, v4, 0x1

    aput v7, v1, v4

    add-int/lit8 v3, v3, 0x1

    move v4, v5

    goto :goto_0

    :cond_4
    array-length p0, p1

    if-eq v4, p0, :cond_5

    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    :cond_5
    return-object v1
.end method

.method public static d(Landroid/content/Context;Landroid/util/AttributeSet;)LO0/g;
    .locals 14

    new-instance v0, LO0/g;

    invoke-direct {v0}, LO0/g;-><init>()V

    sget-object v1, LO0/p;->a:[I

    invoke-virtual {p0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p1, :cond_2

    invoke-virtual {p0, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    iget-object v4, v0, LO0/g;->b:LO0/j;

    const/4 v5, 0x1

    iget-object v6, v0, LO0/g;->c:LO0/i;

    iget-object v7, v0, LO0/g;->e:LO0/k;

    iget-object v8, v0, LO0/g;->d:LO0/h;

    if-eq v3, v5, :cond_0

    const/16 v9, 0x17

    if-eq v9, v3, :cond_0

    const/16 v9, 0x18

    if-eq v9, v3, :cond_0

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    sget-object v9, LO0/l;->e:Landroid/util/SparseIntArray;

    invoke-virtual {v9, v3}, Landroid/util/SparseIntArray;->get(I)I

    move-result v10

    const/high16 v11, 0x3f800000    # 1.0f

    const-string v12, "   "

    const-string v13, "ConstraintSet"

    packed-switch v10, :pswitch_data_0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Unknown attribute 0x"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Landroid/util/SparseIntArray;->get(I)I

    move-result v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v13, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    :pswitch_0
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "unused attribute 0x"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Landroid/util/SparseIntArray;->get(I)I

    move-result v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v13, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    :pswitch_1
    iget-boolean v4, v8, LO0/h;->h0:Z

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, v8, LO0/h;->h0:Z

    goto/16 :goto_1

    :pswitch_2
    iget-boolean v4, v8, LO0/h;->g0:Z

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, v8, LO0/h;->g0:Z

    goto/16 :goto_1

    :pswitch_3
    iget v4, v6, LO0/i;->c:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v6, LO0/i;->c:F

    goto/16 :goto_1

    :pswitch_4
    iget v5, v4, LO0/j;->b:I

    invoke-virtual {p0, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, v4, LO0/j;->b:I

    goto/16 :goto_1

    :pswitch_5
    invoke-virtual {p0, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v8, LO0/h;->f0:Ljava/lang/String;

    goto/16 :goto_1

    :pswitch_6
    iget v4, v6, LO0/i;->b:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, v6, LO0/i;->b:I

    goto/16 :goto_1

    :pswitch_7
    iget-boolean v4, v8, LO0/h;->i0:Z

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, v8, LO0/h;->i0:Z

    goto/16 :goto_1

    :pswitch_8
    invoke-virtual {p0, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v8, LO0/h;->e0:Ljava/lang/String;

    goto/16 :goto_1

    :pswitch_9
    iget v4, v8, LO0/h;->b0:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, LO0/h;->b0:I

    goto/16 :goto_1

    :pswitch_a
    iget v4, v8, LO0/h;->a0:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, v8, LO0/h;->a0:I

    goto/16 :goto_1

    :pswitch_b
    const-string v3, "CURRENTLY UNSUPPORTED"

    invoke-static {v13, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p0, v3, v11}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v8, LO0/h;->Z:F

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {p0, v3, v11}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v8, LO0/h;->Y:F

    goto/16 :goto_1

    :pswitch_e
    iget v5, v4, LO0/j;->d:F

    invoke-virtual {p0, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v4, LO0/j;->d:F

    goto/16 :goto_1

    :pswitch_f
    iget v4, v6, LO0/i;->d:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v6, LO0/i;->d:F

    goto/16 :goto_1

    :pswitch_10
    invoke-virtual {p0, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_1

    :pswitch_11
    invoke-virtual {p0, v3}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v4

    iget v4, v4, Landroid/util/TypedValue;->type:I

    const/4 v5, 0x3

    if-ne v4, v5, :cond_1

    invoke-virtual {p0, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_1

    :cond_1
    sget-object v4, LK0/a;->a:[Ljava/lang/String;

    invoke-virtual {p0, v3, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    aget-object v3, v4, v3

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_1

    :pswitch_12
    iget v4, v6, LO0/i;->a:I

    invoke-static {p0, v3, v4}, LO0/l;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v6, LO0/i;->a:I

    goto/16 :goto_1

    :pswitch_13
    iget v4, v8, LO0/h;->y:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v8, LO0/h;->y:F

    goto/16 :goto_1

    :pswitch_14
    iget v4, v8, LO0/h;->x:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, LO0/h;->x:I

    goto/16 :goto_1

    :pswitch_15
    iget v4, v8, LO0/h;->w:I

    invoke-static {p0, v3, v4}, LO0/l;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, LO0/h;->w:I

    goto/16 :goto_1

    :pswitch_16
    iget v4, v7, LO0/k;->a:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v7, LO0/k;->a:F

    goto/16 :goto_1

    :pswitch_17
    iget v4, v8, LO0/h;->X:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, LO0/h;->X:I

    goto/16 :goto_1

    :pswitch_18
    iget v4, v8, LO0/h;->W:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, LO0/h;->W:I

    goto/16 :goto_1

    :pswitch_19
    iget v4, v8, LO0/h;->V:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, LO0/h;->V:I

    goto/16 :goto_1

    :pswitch_1a
    iget v4, v8, LO0/h;->U:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, LO0/h;->U:I

    goto/16 :goto_1

    :pswitch_1b
    iget v4, v8, LO0/h;->T:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, v8, LO0/h;->T:I

    goto/16 :goto_1

    :pswitch_1c
    iget v4, v8, LO0/h;->S:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, v8, LO0/h;->S:I

    goto/16 :goto_1

    :pswitch_1d
    iget v4, v7, LO0/k;->j:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, v7, LO0/k;->j:F

    goto/16 :goto_1

    :pswitch_1e
    iget v4, v7, LO0/k;->i:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, v7, LO0/k;->i:F

    goto/16 :goto_1

    :pswitch_1f
    iget v4, v7, LO0/k;->h:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, v7, LO0/k;->h:F

    goto/16 :goto_1

    :pswitch_20
    iget v4, v7, LO0/k;->g:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, v7, LO0/k;->g:F

    goto/16 :goto_1

    :pswitch_21
    iget v4, v7, LO0/k;->f:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, v7, LO0/k;->f:F

    goto/16 :goto_1

    :pswitch_22
    iget v4, v7, LO0/k;->e:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v7, LO0/k;->e:F

    goto/16 :goto_1

    :pswitch_23
    iget v4, v7, LO0/k;->d:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v7, LO0/k;->d:F

    goto/16 :goto_1

    :pswitch_24
    iget v4, v7, LO0/k;->c:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v7, LO0/k;->c:F

    goto/16 :goto_1

    :pswitch_25
    iget v4, v7, LO0/k;->b:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v7, LO0/k;->b:F

    goto/16 :goto_1

    :pswitch_26
    iput-boolean v5, v7, LO0/k;->k:Z

    iget v4, v7, LO0/k;->l:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, v7, LO0/k;->l:F

    goto/16 :goto_1

    :pswitch_27
    iget v5, v4, LO0/j;->c:F

    invoke-virtual {p0, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v4, LO0/j;->c:F

    goto/16 :goto_1

    :pswitch_28
    iget v4, v8, LO0/h;->R:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, v8, LO0/h;->R:I

    goto/16 :goto_1

    :pswitch_29
    iget v4, v8, LO0/h;->Q:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, v8, LO0/h;->Q:I

    goto/16 :goto_1

    :pswitch_2a
    iget v4, v8, LO0/h;->O:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v8, LO0/h;->O:F

    goto/16 :goto_1

    :pswitch_2b
    iget v4, v8, LO0/h;->P:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v8, LO0/h;->P:F

    goto/16 :goto_1

    :pswitch_2c
    iget v4, v0, LO0/g;->a:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, v0, LO0/g;->a:I

    goto/16 :goto_1

    :pswitch_2d
    iget v4, v8, LO0/h;->u:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v8, LO0/h;->u:F

    goto/16 :goto_1

    :pswitch_2e
    iget v4, v8, LO0/h;->k:I

    invoke-static {p0, v3, v4}, LO0/l;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, LO0/h;->k:I

    goto/16 :goto_1

    :pswitch_2f
    iget v4, v8, LO0/h;->l:I

    invoke-static {p0, v3, v4}, LO0/l;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, LO0/h;->l:I

    goto/16 :goto_1

    :pswitch_30
    iget v4, v8, LO0/h;->E:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, LO0/h;->E:I

    goto/16 :goto_1

    :pswitch_31
    iget v4, v8, LO0/h;->q:I

    invoke-static {p0, v3, v4}, LO0/l;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, LO0/h;->q:I

    goto/16 :goto_1

    :pswitch_32
    iget v4, v8, LO0/h;->p:I

    invoke-static {p0, v3, v4}, LO0/l;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, LO0/h;->p:I

    goto/16 :goto_1

    :pswitch_33
    iget v4, v8, LO0/h;->H:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, LO0/h;->H:I

    goto/16 :goto_1

    :pswitch_34
    iget v4, v8, LO0/h;->j:I

    invoke-static {p0, v3, v4}, LO0/l;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, LO0/h;->j:I

    goto/16 :goto_1

    :pswitch_35
    iget v4, v8, LO0/h;->i:I

    invoke-static {p0, v3, v4}, LO0/l;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, LO0/h;->i:I

    goto/16 :goto_1

    :pswitch_36
    iget v4, v8, LO0/h;->D:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, LO0/h;->D:I

    goto/16 :goto_1

    :pswitch_37
    iget v4, v8, LO0/h;->B:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, v8, LO0/h;->B:I

    goto/16 :goto_1

    :pswitch_38
    iget v4, v8, LO0/h;->h:I

    invoke-static {p0, v3, v4}, LO0/l;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, LO0/h;->h:I

    goto/16 :goto_1

    :pswitch_39
    iget v4, v8, LO0/h;->g:I

    invoke-static {p0, v3, v4}, LO0/l;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, LO0/h;->g:I

    goto/16 :goto_1

    :pswitch_3a
    iget v4, v8, LO0/h;->C:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, LO0/h;->C:I

    goto/16 :goto_1

    :pswitch_3b
    iget v4, v8, LO0/h;->b:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v3

    iput v3, v8, LO0/h;->b:I

    goto/16 :goto_1

    :pswitch_3c
    iget v5, v4, LO0/j;->a:I

    invoke-virtual {p0, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, v4, LO0/j;->a:I

    sget-object v5, LO0/l;->d:[I

    aget v3, v5, v3

    iput v3, v4, LO0/j;->a:I

    goto/16 :goto_1

    :pswitch_3d
    iget v4, v8, LO0/h;->c:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v3

    iput v3, v8, LO0/h;->c:I

    goto/16 :goto_1

    :pswitch_3e
    iget v4, v8, LO0/h;->t:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v8, LO0/h;->t:F

    goto/16 :goto_1

    :pswitch_3f
    iget v4, v8, LO0/h;->f:F

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, v8, LO0/h;->f:F

    goto/16 :goto_1

    :pswitch_40
    iget v4, v8, LO0/h;->e:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, v8, LO0/h;->e:I

    goto/16 :goto_1

    :pswitch_41
    iget v4, v8, LO0/h;->d:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, v8, LO0/h;->d:I

    goto/16 :goto_1

    :pswitch_42
    iget v4, v8, LO0/h;->J:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, LO0/h;->J:I

    goto/16 :goto_1

    :pswitch_43
    iget v4, v8, LO0/h;->N:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, LO0/h;->N:I

    goto/16 :goto_1

    :pswitch_44
    iget v4, v8, LO0/h;->K:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, LO0/h;->K:I

    goto/16 :goto_1

    :pswitch_45
    iget v4, v8, LO0/h;->I:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, LO0/h;->I:I

    goto/16 :goto_1

    :pswitch_46
    iget v4, v8, LO0/h;->M:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, LO0/h;->M:I

    goto :goto_1

    :pswitch_47
    iget v4, v8, LO0/h;->L:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, LO0/h;->L:I

    goto :goto_1

    :pswitch_48
    iget v4, v8, LO0/h;->r:I

    invoke-static {p0, v3, v4}, LO0/l;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, LO0/h;->r:I

    goto :goto_1

    :pswitch_49
    iget v4, v8, LO0/h;->s:I

    invoke-static {p0, v3, v4}, LO0/l;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, LO0/h;->s:I

    goto :goto_1

    :pswitch_4a
    iget v4, v8, LO0/h;->G:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, LO0/h;->G:I

    goto :goto_1

    :pswitch_4b
    iget v4, v8, LO0/h;->A:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, v8, LO0/h;->A:I

    goto :goto_1

    :pswitch_4c
    iget v4, v8, LO0/h;->z:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, v8, LO0/h;->z:I

    goto :goto_1

    :pswitch_4d
    invoke-virtual {p0, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v8, LO0/h;->v:Ljava/lang/String;

    goto :goto_1

    :pswitch_4e
    iget v4, v8, LO0/h;->m:I

    invoke-static {p0, v3, v4}, LO0/l;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, LO0/h;->m:I

    goto :goto_1

    :pswitch_4f
    iget v4, v8, LO0/h;->n:I

    invoke-static {p0, v3, v4}, LO0/l;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, LO0/h;->n:I

    goto :goto_1

    :pswitch_50
    iget v4, v8, LO0/h;->F:I

    invoke-virtual {p0, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, v8, LO0/h;->F:I

    goto :goto_1

    :pswitch_51
    iget v4, v8, LO0/h;->o:I

    invoke-static {p0, v3, v4}, LO0/l;->f(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, v8, LO0/h;->o:I

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_2
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static f(Landroid/content/res/TypedArray;II)I
    .locals 1

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    :cond_0
    return p2
.end method


# virtual methods
.method public final a(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    new-instance v4, Ljava/util/HashSet;

    iget-object v5, v1, LO0/l;->c:Ljava/util/HashMap;

    invoke-virtual {v5}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 v0, 0x0

    move v6, v0

    :goto_0
    const/4 v0, 0x1

    const/4 v7, -0x1

    if-ge v6, v3, :cond_e

    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getId()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    const-string v11, "ConstraintSet"

    if-nez v10, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v7, "id unknown "

    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v8}, Landroid/view/View;->getId()I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v7, "UNKNOWN"

    :goto_1
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    move/from16 v16, v3

    goto/16 :goto_b

    :cond_0
    iget-boolean v10, v1, LO0/l;->b:Z

    if-eqz v10, :cond_2

    if-eq v9, v7, :cond_1

    goto :goto_3

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "All children of ConstraintLayout must have ids to use ConstraintSet"

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_3
    if-ne v9, v7, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v4, v10}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LO0/g;

    instance-of v11, v8, Landroidx/constraintlayout/widget/Barrier;

    if-eqz v11, :cond_4

    iget-object v11, v10, LO0/g;->d:LO0/h;

    iput v0, v11, LO0/h;->c0:I

    :cond_4
    iget-object v11, v10, LO0/g;->d:LO0/h;

    iget v11, v11, LO0/h;->c0:I

    if-eq v11, v7, :cond_7

    if-eq v11, v0, :cond_5

    goto :goto_4

    :cond_5
    move-object v0, v8

    check-cast v0, Landroidx/constraintlayout/widget/Barrier;

    invoke-virtual {v0, v9}, Landroid/view/View;->setId(I)V

    iget-object v7, v10, LO0/g;->d:LO0/h;

    iget v9, v7, LO0/h;->a0:I

    invoke-virtual {v0, v9}, Landroidx/constraintlayout/widget/Barrier;->setType(I)V

    iget v9, v7, LO0/h;->b0:I

    invoke-virtual {v0, v9}, Landroidx/constraintlayout/widget/Barrier;->setMargin(I)V

    iget-boolean v9, v7, LO0/h;->i0:Z

    invoke-virtual {v0, v9}, Landroidx/constraintlayout/widget/Barrier;->setAllowsGoneWidget(Z)V

    iget-object v9, v7, LO0/h;->d0:[I

    if-eqz v9, :cond_6

    invoke-virtual {v0, v9}, LO0/b;->setReferencedIds([I)V

    goto :goto_4

    :cond_6
    iget-object v9, v7, LO0/h;->e0:Ljava/lang/String;

    if-eqz v9, :cond_7

    invoke-static {v0, v9}, LO0/l;->c(Landroidx/constraintlayout/widget/Barrier;Ljava/lang/String;)[I

    move-result-object v9

    iput-object v9, v7, LO0/h;->d0:[I

    invoke-virtual {v0, v9}, LO0/b;->setReferencedIds([I)V

    :cond_7
    :goto_4
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LO0/d;

    invoke-virtual {v7}, LO0/d;->a()V

    invoke-virtual {v10, v7}, LO0/g;->a(LO0/d;)V

    iget-object v9, v10, LO0/g;->f:Ljava/util/HashMap;

    const-string v11, "\" not found on "

    const-string v12, " Custom Attribute \""

    const-string v13, "TransitionLayout"

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v9}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_5
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v9, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO0/a;

    move/from16 v16, v3

    new-instance v3, Ljava/lang/StringBuilder;

    move-object/from16 v17, v9

    const-string v9, "set"

    invoke-direct {v3, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :try_start_1
    iget v9, v0, LO0/a;->a:I

    invoke-static {v9}, Lp/f;->b(I)I

    move-result v9

    packed-switch v9, :pswitch_data_0

    :goto_6
    move-object/from16 v18, v15

    goto/16 :goto_a

    :pswitch_0
    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v14, v3, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    iget v0, v0, LO0/a;->c:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v9, v8, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :catch_1
    move-exception v0

    move-object/from16 v18, v15

    goto/16 :goto_7

    :catch_2
    move-exception v0

    move-object/from16 v18, v15

    goto/16 :goto_8

    :catch_3
    move-exception v0

    move-object/from16 v18, v15

    goto/16 :goto_9

    :pswitch_1
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v14, v3, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    iget-boolean v0, v0, LO0/a;->e:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v9, v8, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :pswitch_2
    const-class v9, Ljava/lang/CharSequence;

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v14, v3, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    iget-object v0, v0, LO0/a;->d:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v9, v8, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :pswitch_3
    const-class v9, Landroid/graphics/drawable/Drawable;

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v14, v3, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 v18, v15

    :try_start_2
    new-instance v15, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v15}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    iget v0, v0, LO0/a;->f:I

    invoke-virtual {v15, v0}, Landroid/graphics/drawable/ColorDrawable;->setColor(I)V

    filled-new-array {v15}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v9, v8, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_a

    :catch_4
    move-exception v0

    goto :goto_7

    :catch_5
    move-exception v0

    goto :goto_8

    :catch_6
    move-exception v0

    goto/16 :goto_9

    :pswitch_4
    move-object/from16 v18, v15

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v14, v3, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    iget v0, v0, LO0/a;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v9, v8, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_a

    :pswitch_5
    move-object/from16 v18, v15

    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v14, v3, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    iget v0, v0, LO0/a;->c:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v9, v8, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_a

    :pswitch_6
    move-object/from16 v18, v15

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v14, v3, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    iget v0, v0, LO0/a;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v9, v8, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_4

    goto :goto_a

    :goto_7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v13, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_a

    :goto_8
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v13, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_a

    :goto_9
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v13, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v13, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " must have a method "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v13, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_a
    move-object/from16 v1, p0

    move/from16 v3, v16

    move-object/from16 v9, v17

    move-object/from16 v15, v18

    goto/16 :goto_5

    :cond_8
    move/from16 v16, v3

    invoke-virtual {v8, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, v10, LO0/g;->b:LO0/j;

    iget v1, v0, LO0/j;->b:I

    if-nez v1, :cond_9

    iget v1, v0, LO0/j;->a:I

    invoke-virtual {v8, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_9
    iget v0, v0, LO0/j;->c:F

    invoke-virtual {v8, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, v10, LO0/g;->e:LO0/k;

    iget v1, v0, LO0/k;->a:F

    invoke-virtual {v8, v1}, Landroid/view/View;->setRotation(F)V

    iget v1, v0, LO0/k;->b:F

    invoke-virtual {v8, v1}, Landroid/view/View;->setRotationX(F)V

    iget v1, v0, LO0/k;->c:F

    invoke-virtual {v8, v1}, Landroid/view/View;->setRotationY(F)V

    iget v1, v0, LO0/k;->d:F

    invoke-virtual {v8, v1}, Landroid/view/View;->setScaleX(F)V

    iget v1, v0, LO0/k;->e:F

    invoke-virtual {v8, v1}, Landroid/view/View;->setScaleY(F)V

    iget v1, v0, LO0/k;->f:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_a

    iget v1, v0, LO0/k;->f:F

    invoke-virtual {v8, v1}, Landroid/view/View;->setPivotX(F)V

    :cond_a
    iget v1, v0, LO0/k;->g:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_b

    iget v1, v0, LO0/k;->g:F

    invoke-virtual {v8, v1}, Landroid/view/View;->setPivotY(F)V

    :cond_b
    iget v1, v0, LO0/k;->h:F

    invoke-virtual {v8, v1}, Landroid/view/View;->setTranslationX(F)V

    iget v1, v0, LO0/k;->i:F

    invoke-virtual {v8, v1}, Landroid/view/View;->setTranslationY(F)V

    iget v1, v0, LO0/k;->j:F

    invoke-virtual {v8, v1}, Landroid/view/View;->setTranslationZ(F)V

    iget-boolean v1, v0, LO0/k;->k:Z

    if-eqz v1, :cond_d

    iget v0, v0, LO0/k;->l:F

    invoke-virtual {v8, v0}, Landroid/view/View;->setElevation(F)V

    goto :goto_b

    :cond_c
    move/from16 v16, v3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "WARNING NO CONSTRAINTS for view "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_d
    :goto_b
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v1, p0

    move/from16 v3, v16

    goto/16 :goto_0

    :cond_e
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_f
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LO0/g;

    iget-object v6, v4, LO0/g;->d:LO0/h;

    iget v8, v6, LO0/h;->c0:I

    if-eq v8, v7, :cond_13

    if-eq v8, v0, :cond_10

    goto :goto_e

    :cond_10
    new-instance v8, Landroidx/constraintlayout/widget/Barrier;

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-direct {v8, v9}, Landroidx/constraintlayout/widget/Barrier;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-virtual {v8, v9}, Landroid/view/View;->setId(I)V

    iget-object v9, v6, LO0/h;->d0:[I

    if-eqz v9, :cond_11

    invoke-virtual {v8, v9}, LO0/b;->setReferencedIds([I)V

    goto :goto_d

    :cond_11
    iget-object v9, v6, LO0/h;->e0:Ljava/lang/String;

    if-eqz v9, :cond_12

    invoke-static {v8, v9}, LO0/l;->c(Landroidx/constraintlayout/widget/Barrier;Ljava/lang/String;)[I

    move-result-object v9

    iput-object v9, v6, LO0/h;->d0:[I

    invoke-virtual {v8, v9}, LO0/b;->setReferencedIds([I)V

    :cond_12
    :goto_d
    iget v9, v6, LO0/h;->a0:I

    invoke-virtual {v8, v9}, Landroidx/constraintlayout/widget/Barrier;->setType(I)V

    iget v9, v6, LO0/h;->b0:I

    invoke-virtual {v8, v9}, Landroidx/constraintlayout/widget/Barrier;->setMargin(I)V

    invoke-static {}, Landroidx/constraintlayout/widget/ConstraintLayout;->a()LO0/d;

    move-result-object v9

    invoke-virtual {v8}, LO0/b;->g()V

    invoke-virtual {v4, v9}, LO0/g;->a(LO0/d;)V

    invoke-virtual {v2, v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_13
    :goto_e
    iget-boolean v6, v6, LO0/h;->a:Z

    if-eqz v6, :cond_f

    new-instance v6, LO0/n;

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v6, v8}, LO0/n;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v6, v3}, Landroid/view/View;->setId(I)V

    invoke-static {}, Landroidx/constraintlayout/widget/ConstraintLayout;->a()LO0/d;

    move-result-object v3

    invoke-virtual {v4, v3}, LO0/g;->a(LO0/d;)V

    invoke-virtual {v2, v6, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_c

    :cond_14
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 16

    move-object/from16 v1, p0

    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    iget-object v3, v1, LO0/l;->c:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    move v4, v0

    :goto_0
    if-ge v4, v2, :cond_9

    move-object/from16 v5, p1

    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LO0/d;

    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v8

    iget-boolean v0, v1, LO0/l;->b:Z

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    if-eq v8, v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "All children of ConstraintLayout must have ids to use ConstraintSet"

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_1
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v9, LO0/g;

    invoke-direct {v9}, LO0/g;-><init>()V

    invoke-virtual {v3, v0, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, LO0/g;

    iget-object v10, v1, LO0/l;->a:Ljava/util/HashMap;

    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v10}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v10, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LO0/a;

    :try_start_0
    const-string v15, "BackgroundColor"

    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3

    invoke-virtual {v6}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v15

    check-cast v15, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {v15}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    new-instance v1, LO0/a;

    invoke-direct {v1, v14, v15}, LO0/a;-><init>(LO0/a;Ljava/lang/Object;)V

    invoke-virtual {v11, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_4

    :catch_2
    move-exception v0

    goto :goto_5

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "getMap"

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v15, 0x0

    invoke-virtual {v12, v1, v15}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v6, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    new-instance v15, LO0/a;

    invoke-direct {v15, v14, v1}, LO0/a;-><init>(LO0/a;Ljava/lang/Object;)V

    invoke-virtual {v11, v0, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_6

    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_6

    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_6
    move-object/from16 v1, p0

    goto :goto_2

    :cond_4
    iput-object v11, v9, LO0/g;->f:Ljava/util/HashMap;

    iput v8, v9, LO0/g;->a:I

    iget v0, v7, LO0/d;->d:I

    iget-object v1, v9, LO0/g;->d:LO0/h;

    iput v0, v1, LO0/h;->g:I

    iget v0, v7, LO0/d;->e:I

    iput v0, v1, LO0/h;->h:I

    iget v0, v7, LO0/d;->f:I

    iput v0, v1, LO0/h;->i:I

    iget v0, v7, LO0/d;->g:I

    iput v0, v1, LO0/h;->j:I

    iget v0, v7, LO0/d;->h:I

    iput v0, v1, LO0/h;->k:I

    iget v0, v7, LO0/d;->i:I

    iput v0, v1, LO0/h;->l:I

    iget v0, v7, LO0/d;->j:I

    iput v0, v1, LO0/h;->m:I

    iget v0, v7, LO0/d;->k:I

    iput v0, v1, LO0/h;->n:I

    iget v0, v7, LO0/d;->l:I

    iput v0, v1, LO0/h;->o:I

    iget v0, v7, LO0/d;->p:I

    iput v0, v1, LO0/h;->p:I

    iget v0, v7, LO0/d;->q:I

    iput v0, v1, LO0/h;->q:I

    iget v0, v7, LO0/d;->r:I

    iput v0, v1, LO0/h;->r:I

    iget v0, v7, LO0/d;->s:I

    iput v0, v1, LO0/h;->s:I

    iget v0, v7, LO0/d;->z:F

    iput v0, v1, LO0/h;->t:F

    iget v0, v7, LO0/d;->A:F

    iput v0, v1, LO0/h;->u:F

    iget-object v0, v7, LO0/d;->B:Ljava/lang/String;

    iput-object v0, v1, LO0/h;->v:Ljava/lang/String;

    iget v0, v7, LO0/d;->m:I

    iput v0, v1, LO0/h;->w:I

    iget v0, v7, LO0/d;->n:I

    iput v0, v1, LO0/h;->x:I

    iget v0, v7, LO0/d;->o:F

    iput v0, v1, LO0/h;->y:F

    iget v0, v7, LO0/d;->P:I

    iput v0, v1, LO0/h;->z:I

    iget v0, v7, LO0/d;->Q:I

    iput v0, v1, LO0/h;->A:I

    iget v0, v7, LO0/d;->R:I

    iput v0, v1, LO0/h;->B:I

    iget v0, v7, LO0/d;->c:F

    iput v0, v1, LO0/h;->f:F

    iget v0, v7, LO0/d;->a:I

    iput v0, v1, LO0/h;->d:I

    iget v0, v7, LO0/d;->b:I

    iput v0, v1, LO0/h;->e:I

    iget v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iput v0, v1, LO0/h;->b:I

    iget v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iput v0, v1, LO0/h;->c:I

    iget v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v0, v1, LO0/h;->C:I

    iget v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v0, v1, LO0/h;->D:I

    iget v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v0, v1, LO0/h;->E:I

    iget v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v0, v1, LO0/h;->F:I

    iget v0, v7, LO0/d;->E:F

    iput v0, v1, LO0/h;->O:F

    iget v0, v7, LO0/d;->D:F

    iput v0, v1, LO0/h;->P:F

    iget v0, v7, LO0/d;->G:I

    iput v0, v1, LO0/h;->R:I

    iget v0, v7, LO0/d;->F:I

    iput v0, v1, LO0/h;->Q:I

    iget-boolean v0, v7, LO0/d;->S:Z

    iput-boolean v0, v1, LO0/h;->g0:Z

    iget-boolean v0, v7, LO0/d;->T:Z

    iput-boolean v0, v1, LO0/h;->h0:Z

    iget v0, v7, LO0/d;->H:I

    iput v0, v1, LO0/h;->S:I

    iget v0, v7, LO0/d;->I:I

    iput v0, v1, LO0/h;->T:I

    iget v0, v7, LO0/d;->L:I

    iput v0, v1, LO0/h;->U:I

    iget v0, v7, LO0/d;->M:I

    iput v0, v1, LO0/h;->V:I

    iget v0, v7, LO0/d;->J:I

    iput v0, v1, LO0/h;->W:I

    iget v0, v7, LO0/d;->K:I

    iput v0, v1, LO0/h;->X:I

    iget v0, v7, LO0/d;->N:F

    iput v0, v1, LO0/h;->Y:F

    iget v0, v7, LO0/d;->O:F

    iput v0, v1, LO0/h;->Z:F

    iget-object v0, v7, LO0/d;->U:Ljava/lang/String;

    iput-object v0, v1, LO0/h;->f0:Ljava/lang/String;

    iget v0, v7, LO0/d;->u:I

    iput v0, v1, LO0/h;->J:I

    iget v0, v7, LO0/d;->w:I

    iput v0, v1, LO0/h;->L:I

    iget v0, v7, LO0/d;->t:I

    iput v0, v1, LO0/h;->I:I

    iget v0, v7, LO0/d;->v:I

    iput v0, v1, LO0/h;->K:I

    iget v0, v7, LO0/d;->x:I

    iput v0, v1, LO0/h;->N:I

    iget v0, v7, LO0/d;->y:I

    iput v0, v1, LO0/h;->M:I

    invoke-virtual {v7}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    move-result v0

    iput v0, v1, LO0/h;->G:I

    invoke-virtual {v7}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    move-result v0

    iput v0, v1, LO0/h;->H:I

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v0

    iget-object v7, v9, LO0/g;->b:LO0/j;

    iput v0, v7, LO0/j;->a:I

    invoke-virtual {v6}, Landroid/view/View;->getAlpha()F

    move-result v0

    iput v0, v7, LO0/j;->c:F

    invoke-virtual {v6}, Landroid/view/View;->getRotation()F

    move-result v0

    iget-object v7, v9, LO0/g;->e:LO0/k;

    iput v0, v7, LO0/k;->a:F

    invoke-virtual {v6}, Landroid/view/View;->getRotationX()F

    move-result v0

    iput v0, v7, LO0/k;->b:F

    invoke-virtual {v6}, Landroid/view/View;->getRotationY()F

    move-result v0

    iput v0, v7, LO0/k;->c:F

    invoke-virtual {v6}, Landroid/view/View;->getScaleX()F

    move-result v0

    iput v0, v7, LO0/k;->d:F

    invoke-virtual {v6}, Landroid/view/View;->getScaleY()F

    move-result v0

    iput v0, v7, LO0/k;->e:F

    invoke-virtual {v6}, Landroid/view/View;->getPivotX()F

    move-result v0

    invoke-virtual {v6}, Landroid/view/View;->getPivotY()F

    move-result v8

    float-to-double v9, v0

    const-wide/16 v11, 0x0

    cmpl-double v9, v9, v11

    if-nez v9, :cond_5

    float-to-double v9, v8

    cmpl-double v9, v9, v11

    if-eqz v9, :cond_6

    :cond_5
    iput v0, v7, LO0/k;->f:F

    iput v8, v7, LO0/k;->g:F

    :cond_6
    invoke-virtual {v6}, Landroid/view/View;->getTranslationX()F

    move-result v0

    iput v0, v7, LO0/k;->h:F

    invoke-virtual {v6}, Landroid/view/View;->getTranslationY()F

    move-result v0

    iput v0, v7, LO0/k;->i:F

    invoke-virtual {v6}, Landroid/view/View;->getTranslationZ()F

    move-result v0

    iput v0, v7, LO0/k;->j:F

    iget-boolean v0, v7, LO0/k;->k:Z

    if-eqz v0, :cond_7

    invoke-virtual {v6}, Landroid/view/View;->getElevation()F

    move-result v0

    iput v0, v7, LO0/k;->l:F

    :cond_7
    instance-of v0, v6, Landroidx/constraintlayout/widget/Barrier;

    if-eqz v0, :cond_8

    check-cast v6, Landroidx/constraintlayout/widget/Barrier;

    iget-object v0, v6, Landroidx/constraintlayout/widget/Barrier;->l:LM0/a;

    iget-boolean v0, v0, LM0/a;->g0:Z

    iput-boolean v0, v1, LO0/h;->i0:Z

    invoke-virtual {v6}, LO0/b;->getReferencedIds()[I

    move-result-object v0

    iput-object v0, v1, LO0/h;->d0:[I

    invoke-virtual {v6}, Landroidx/constraintlayout/widget/Barrier;->getType()I

    move-result v0

    iput v0, v1, LO0/h;->a0:I

    invoke-virtual {v6}, Landroidx/constraintlayout/widget/Barrier;->getMargin()I

    move-result v0

    iput v0, v1, LO0/h;->b0:I

    :cond_8
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v1, p0

    goto/16 :goto_0

    :cond_9
    return-void
.end method

.method public final e(Landroid/content/Context;I)V
    .locals 4

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p2

    :try_start_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    :goto_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v2

    invoke-static {p1, v2}, LO0/l;->d(Landroid/content/Context;Landroid/util/AttributeSet;)LO0/g;

    move-result-object v2

    const-string v3, "Guideline"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v2, LO0/g;->d:LO0/h;

    iput-boolean v1, v0, LO0/h;->a:Z

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_4

    :cond_1
    :goto_1
    iget-object v0, p0, LO0/l;->c:Ljava/util/HashMap;

    iget v1, v2, LO0/g;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    :goto_2
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_5

    :goto_4
    invoke-virtual {p1}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    :cond_3
    :goto_5
    return-void
.end method
