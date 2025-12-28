.class public final LD0/b;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/f;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    iput p2, p0, LD0/b;->e:I

    iput-object p1, p0, LD0/b;->f:Ljava/lang/Object;

    iput-object p3, p0, LD0/b;->g:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;)Ljava/lang/Object;
    .locals 72

    move-object/from16 v1, p0

    const/4 v3, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    iget v0, v1, LD0/b;->e:I

    packed-switch v0, :pswitch_data_0

    move-object/from16 v0, p1

    check-cast v0, LP/l;

    move-object/from16 v0, p2

    check-cast v0, LD/n;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    const v2, -0x15193045

    invoke-virtual {v0, v2}, LD/n;->N(I)V

    iget-object v2, v1, LD0/b;->f:Ljava/lang/Object;

    check-cast v2, Lq/C;

    iget-object v3, v1, LD0/b;->g:Ljava/lang/Object;

    check-cast v3, Ls/g;

    invoke-interface {v2, v3, v0}, Lq/C;->b(Ls/g;LD/n;)Lq/D;

    move-result-object v2

    invoke-virtual {v0, v2}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v0}, LD/n;->H()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_0

    sget-object v3, LD/l;->a:LD/U;

    if-ne v4, v3, :cond_1

    :cond_0
    new-instance v4, Lq/F;

    invoke-direct {v4, v2}, Lq/F;-><init>(Lq/D;)V

    invoke-virtual {v0, v4}, LD/n;->V(Ljava/lang/Object;)V

    :cond_1
    check-cast v4, Lq/F;

    invoke-virtual {v0, v5}, LD/n;->q(Z)V

    return-object v4

    :pswitch_0
    move-object/from16 v0, p1

    check-cast v0, Lt/m;

    move-object/from16 v15, p2

    check-cast v15, LD/n;

    move-object/from16 v7, p3

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    const-string v8, "$this$Card"

    invoke-static {v0, v8}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, v7, 0x51

    const/16 v14, 0x10

    if-ne v0, v14, :cond_3

    invoke-virtual {v15}, LD/n;->y()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v15}, LD/n;->K()V

    goto/16 :goto_34

    :cond_3
    :goto_0
    const/16 v0, 0x18

    int-to-float v13, v0

    invoke-static {v13}, Landroidx/compose/foundation/layout/b;->c(F)LP/l;

    move-result-object v0

    sget-object v7, LP/a;->p:LP/b;

    iget-object v8, v1, LD0/b;->f:Ljava/lang/Object;

    move-object/from16 v32, v8

    check-cast v32, LD/Z;

    iget-object v8, v1, LD0/b;->g:Ljava/lang/Object;

    move-object v12, v8

    check-cast v12, Lp2/o;

    sget-object v8, Lt/c;->a:Ls1/c;

    const/16 v8, 0x30

    invoke-static {v7, v15, v8}, Lt/j;->a(LP/b;LD/n;I)Lt/l;

    move-result-object v7

    iget v8, v15, LD/n;->M:I

    invoke-virtual {v15}, LD/n;->m()LD/j0;

    move-result-object v9

    invoke-static {v15, v0}, LP/m;->b(LD/n;LP/l;)LP/l;

    move-result-object v0

    sget-object v10, Ln0/f;->c:Ln0/e;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, Ln0/e;->b:Ln0/j;

    invoke-virtual {v15}, LD/n;->P()V

    iget-boolean v11, v15, LD/n;->L:Z

    if-eqz v11, :cond_4

    invoke-virtual {v15, v10}, LD/n;->l(Ln0/j;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v15}, LD/n;->Y()V

    :goto_1
    sget-object v10, Ln0/e;->e:Ln0/d;

    invoke-static {v15, v7, v10}, LD/d;->G(LD/n;Ljava/lang/Object;Lo2/e;)V

    sget-object v7, Ln0/e;->d:Ln0/d;

    invoke-static {v15, v9, v7}, LD/d;->G(LD/n;Ljava/lang/Object;Lo2/e;)V

    sget-object v7, Ln0/e;->f:Ln0/d;

    iget-boolean v9, v15, LD/n;->L:Z

    if-nez v9, :cond_5

    invoke-virtual {v15}, LD/n;->H()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    :cond_5
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v15, v9}, LD/n;->V(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v15, v8, v7}, LD/n;->b(Ljava/lang/Object;Lo2/e;)V

    :cond_6
    sget-object v7, Ln0/e;->c:Ln0/d;

    invoke-static {v15, v0, v7}, LD/d;->G(LD/n;Ljava/lang/Object;Lo2/e;)V

    sget-object v0, Lo0/S;->b:LD/M0;

    invoke-virtual {v15, v0}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    sget-object v7, Lo0/S;->a:LD/H;

    invoke-virtual {v15, v7}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget-object v8, Lo0/S;->d:LD/M0;

    invoke-virtual {v15, v8}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lr0/d;

    monitor-enter v8

    :try_start_0
    iget-object v9, v8, Lr0/d;->a:Ln/r;

    const v10, 0x7f070094

    invoke-virtual {v9, v10}, Ln/r;->f(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/util/TypedValue;

    if-nez v9, :cond_7

    new-instance v9, Landroid/util/TypedValue;

    invoke-direct {v9}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v7, v10, v9, v6}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    iget-object v11, v8, Lr0/d;->a:Ln/r;

    invoke-virtual {v11, v10}, Ln/r;->d(I)I

    move-result v16

    iget-object v14, v11, Ln/r;->c:[Ljava/lang/Object;

    aget-object v17, v14, v16

    iget-object v11, v11, Ln/r;->b:[I

    aput v10, v11, v16

    aput-object v9, v14, v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_35

    :cond_7
    :goto_2
    monitor-exit v8

    iget-object v8, v9, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    const/4 v11, 0x4

    if-eqz v8, :cond_9

    const-string v14, ".xml"

    instance-of v4, v8, Ljava/lang/String;

    if-eqz v4, :cond_8

    move-object v4, v8

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4, v14}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    goto :goto_3

    :cond_8
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v4

    add-int/lit8 v17, v4, -0x4

    const/16 v19, 0x0

    const/16 v20, 0x4

    const/16 v21, 0x0

    move-object/from16 v16, v8

    move-object/from16 v18, v14

    invoke-static/range {v16 .. v21}, Lx2/j;->m(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    move-result v4

    :goto_3
    if-ne v4, v6, :cond_9

    move v4, v6

    goto :goto_4

    :cond_9
    move v4, v5

    :goto_4
    const/4 v14, 0x3

    move/from16 v16, v13

    move-object/from16 p2, v12

    const/16 v12, 0x8

    if-eqz v4, :cond_47

    const v4, -0x2fdd6c65

    invoke-virtual {v15, v4}, LD/n;->N(I)V

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    iget v8, v9, Landroid/util/TypedValue;->changingConfigurations:I

    sget-object v0, Lo0/S;->c:LD/M0;

    invoke-virtual {v15, v0}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lr0/c;

    new-instance v13, Lr0/b;

    invoke-direct {v13, v4}, Lr0/b;-><init>(Landroid/content/res/Resources$Theme;)V

    iget-object v0, v9, Lr0/c;->a:Ljava/util/HashMap;

    invoke-virtual {v0, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr0/a;

    goto :goto_5

    :cond_a
    const/4 v0, 0x0

    :goto_5
    if-nez v0, :cond_40

    invoke-virtual {v7, v10}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v10

    invoke-interface {v10}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    :goto_6
    if-eq v0, v3, :cond_b

    if-eq v0, v6, :cond_b

    invoke-interface {v10}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    goto :goto_6

    :cond_b
    if-ne v0, v3, :cond_3f

    invoke-interface {v10}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v11, "vector"

    invoke-static {v0, v11}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3e

    invoke-static {v10}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v11

    new-instance v2, Ld0/a;

    invoke-direct {v2, v10}, Ld0/a;-><init>(Landroid/content/res/XmlResourceParser;)V

    sget-object v0, Ld0/b;->a:[I

    invoke-static {v7, v4, v11, v0}, LU0/b;->f(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v0

    invoke-virtual {v2, v0}, Ld0/a;->b(I)V

    const-string v0, "autoMirrored"

    invoke-static {v10, v0}, LU0/b;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v0

    const/4 v3, 0x5

    if-nez v0, :cond_c

    move/from16 v43, v5

    goto :goto_7

    :cond_c
    invoke-virtual {v6, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    move/from16 v43, v0

    :goto_7
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v0

    invoke-virtual {v2, v0}, Ld0/a;->b(I)V

    const-string v0, "viewportWidth"

    const/4 v3, 0x7

    const/4 v5, 0x0

    invoke-virtual {v2, v6, v0, v3, v5}, Ld0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v37

    const-string v0, "viewportHeight"

    invoke-virtual {v2, v6, v0, v12, v5}, Ld0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v38

    cmpg-float v0, v37, v5

    if-lez v0, :cond_3d

    cmpg-float v0, v38, v5

    if-lez v0, :cond_3c

    invoke-virtual {v6, v14, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v20

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v0

    invoke-virtual {v2, v0}, Ld0/a;->b(I)V

    const/4 v12, 0x2

    invoke-virtual {v6, v12, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v23

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v0

    invoke-virtual {v2, v0}, Ld0/a;->b(I)V

    const/4 v3, 0x1

    invoke-virtual {v6, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_12

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v6, v3, v0}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    iget v0, v0, Landroid/util/TypedValue;->type:I

    if-ne v0, v12, :cond_d

    sget-wide v25, LW/r;->f:J

    move-wide/from16 v40, v25

    goto/16 :goto_b

    :cond_d
    const-string v0, "tint"

    invoke-static {v10, v0}, LU0/b;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v6, v3, v0}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    iget v3, v0, Landroid/util/TypedValue;->type:I

    if-eq v3, v12, :cond_f

    const/16 v12, 0x1c

    if-lt v3, v12, :cond_e

    const/16 v12, 0x1f

    if-gt v3, v12, :cond_e

    iget v0, v0, Landroid/util/TypedValue;->data:I

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_9

    :cond_e
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v3, 0x1

    const/4 v12, 0x0

    invoke-virtual {v6, v3, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    sget-object v3, LU0/c;->a:Ljava/lang/ThreadLocal;

    :try_start_1
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v3

    invoke-static {v0, v3, v4}, LU0/c;->a(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_9

    :catch_0
    move-exception v0

    const-string v3, "CSLCompat"

    const-string v5, "Failed to inflate ColorStateList."

    invoke-static {v3, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_8

    :cond_f
    new-instance v2, Ljava/lang/UnsupportedOperationException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to resolve attribute at index 1: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_10
    :goto_8
    const/4 v0, 0x0

    :goto_9
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v3

    invoke-virtual {v2, v3}, Ld0/a;->b(I)V

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v0

    invoke-static {v0}, LW/D;->b(I)J

    move-result-wide v26

    :goto_a
    move-wide/from16 v40, v26

    goto :goto_b

    :cond_11
    sget-wide v26, LW/r;->f:J

    goto :goto_a

    :cond_12
    sget-wide v26, LW/r;->f:J

    goto :goto_a

    :goto_b
    const/4 v0, -0x1

    const/4 v3, 0x6

    invoke-virtual {v6, v3, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v3

    invoke-virtual {v2, v3}, Ld0/a;->b(I)V

    const/16 v12, 0x9

    if-eq v5, v0, :cond_13

    if-eq v5, v14, :cond_15

    const/4 v3, 0x5

    if-eq v5, v3, :cond_13

    if-eq v5, v12, :cond_14

    packed-switch v5, :pswitch_data_1

    :cond_13
    const/16 v42, 0x5

    goto :goto_c

    :pswitch_1
    const/16 v42, 0xc

    goto :goto_c

    :pswitch_2
    const/16 v3, 0xe

    move/from16 v42, v3

    goto :goto_c

    :pswitch_3
    const/16 v42, 0xd

    goto :goto_c

    :cond_14
    move/from16 v42, v12

    goto :goto_c

    :cond_15
    move/from16 v42, v14

    :goto_c
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    div-float v35, v20, v3

    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    div-float v36, v23, v3

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    const-string v34, ""

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Lc0/d;

    const/16 v51, 0x0

    const/16 v54, 0x3ff

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    move-object/from16 v44, v5

    invoke-direct/range {v44 .. v54}, Lc0/d;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;I)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v6, 0x0

    :goto_d
    invoke-interface {v10}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v12

    const/4 v14, 0x1

    if-eq v12, v14, :cond_3a

    invoke-interface {v10}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v12

    if-ge v12, v14, :cond_16

    invoke-interface {v10}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v12

    const/4 v14, 0x3

    if-ne v12, v14, :cond_17

    move-object/from16 v33, v5

    move/from16 v55, v8

    move-object/from16 v31, v9

    move-object/from16 v30, v13

    move-object/from16 v28, v15

    const/4 v4, 0x1

    const/16 v12, 0x8

    const/16 v13, 0xc

    goto/16 :goto_2a

    :cond_16
    const/4 v14, 0x3

    :cond_17
    iget-object v12, v2, Ld0/a;->a:Landroid/content/res/XmlResourceParser;

    invoke-interface {v12}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    const-string v1, "group"

    move-object/from16 v28, v15

    const/4 v15, 0x2

    if-eq v0, v15, :cond_1b

    if-eq v0, v14, :cond_18

    move-object v1, v4

    move-object/from16 v33, v5

    move/from16 v55, v8

    move-object/from16 v31, v9

    move-object/from16 v39, v10

    move-object/from16 v30, v13

    const/4 v4, 0x1

    const/4 v10, 0x0

    const/16 v12, 0x8

    const/16 v13, 0xc

    :goto_e
    const/4 v15, 0x4

    goto/16 :goto_29

    :cond_18
    invoke-interface {v12}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    const/4 v1, 0x1

    add-int/2addr v6, v1

    const/4 v0, 0x0

    :goto_f
    if-ge v0, v6, :cond_19

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v12

    sub-int/2addr v12, v1

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lc0/d;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v14

    sub-int/2addr v14, v1

    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc0/d;

    iget-object v1, v1, Lc0/d;->j:Ljava/util/List;

    new-instance v14, Lc0/E;

    iget-object v15, v12, Lc0/d;->a:Ljava/lang/String;

    move/from16 v29, v6

    iget v6, v12, Lc0/d;->b:F

    move-object/from16 v30, v13

    iget v13, v12, Lc0/d;->c:F

    move-object/from16 v31, v9

    iget v9, v12, Lc0/d;->d:F

    move/from16 v55, v8

    iget v8, v12, Lc0/d;->e:F

    move-object/from16 v33, v5

    iget v5, v12, Lc0/d;->f:F

    move-object/from16 v39, v10

    iget v10, v12, Lc0/d;->g:F

    move-object/from16 v56, v3

    iget v3, v12, Lc0/d;->h:F

    move-object/from16 v57, v4

    iget-object v4, v12, Lc0/d;->i:Ljava/util/List;

    iget-object v12, v12, Lc0/d;->j:Ljava/util/List;

    move-object/from16 v44, v14

    move-object/from16 v45, v15

    move/from16 v46, v6

    move/from16 v47, v13

    move/from16 v48, v9

    move/from16 v49, v8

    move/from16 v50, v5

    move/from16 v51, v10

    move/from16 v52, v3

    move-object/from16 v53, v4

    move-object/from16 v54, v12

    invoke-direct/range {v44 .. v54}, Lc0/E;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V

    invoke-interface {v1, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x1

    add-int/2addr v0, v1

    move/from16 v6, v29

    move-object/from16 v13, v30

    move-object/from16 v9, v31

    move-object/from16 v5, v33

    move-object/from16 v10, v39

    move/from16 v8, v55

    move-object/from16 v3, v56

    move-object/from16 v4, v57

    goto :goto_f

    :cond_19
    move-object/from16 v33, v5

    move/from16 v55, v8

    move-object/from16 v31, v9

    move-object/from16 v39, v10

    move-object/from16 v30, v13

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/16 v12, 0x8

    const/16 v13, 0xc

    const/4 v14, 0x3

    const/4 v15, 0x4

    move-object/from16 v71, v4

    move v4, v1

    move-object/from16 v1, v71

    goto/16 :goto_29

    :cond_1a
    move-object/from16 v33, v5

    move/from16 v55, v8

    move-object/from16 v31, v9

    move-object/from16 v39, v10

    move-object/from16 v30, v13

    move-object v1, v4

    :goto_10
    const/4 v4, 0x1

    const/4 v10, 0x0

    const/16 v12, 0x8

    const/16 v13, 0xc

    const/4 v14, 0x3

    goto/16 :goto_e

    :cond_1b
    move-object/from16 v56, v3

    move-object/from16 v57, v4

    move-object/from16 v33, v5

    move/from16 v55, v8

    move-object/from16 v31, v9

    move-object/from16 v39, v10

    move-object/from16 v30, v13

    invoke-interface {v12}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    sget-object v53, Ld2/s;->d:Ld2/s;

    const-string v4, ""

    iget-object v5, v2, Ld0/a;->c:LA/t;

    const v8, -0x624e8b7e

    if-eq v3, v8, :cond_36

    const v8, 0x346425

    const/high16 v9, 0x3f800000    # 1.0f

    if-eq v3, v8, :cond_20

    const v5, 0x5e0f67f

    if-eq v3, v5, :cond_1c

    goto :goto_11

    :cond_1c
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    :cond_1d
    :goto_11
    move-object/from16 v3, v56

    move-object/from16 v1, v57

    goto :goto_10

    :cond_1e
    sget-object v0, Ld0/b;->b:[I

    move-object/from16 v1, v57

    invoke-static {v7, v1, v11, v0}, LU0/b;->f(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v3

    invoke-virtual {v2, v3}, Ld0/a;->b(I)V

    const-string v3, "rotation"

    const/4 v5, 0x5

    const/4 v8, 0x0

    invoke-virtual {v2, v0, v3, v5, v8}, Ld0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v46

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v47

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v3

    invoke-virtual {v2, v3}, Ld0/a;->b(I)V

    const/4 v3, 0x2

    invoke-virtual {v0, v3, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v48

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v3

    invoke-virtual {v2, v3}, Ld0/a;->b(I)V

    const-string v3, "scaleX"

    const/4 v5, 0x3

    invoke-virtual {v2, v0, v3, v5, v9}, Ld0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v49

    const-string v3, "scaleY"

    const/4 v5, 0x4

    invoke-virtual {v2, v0, v3, v5, v9}, Ld0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v50

    const-string v3, "translateX"

    const/4 v5, 0x6

    invoke-virtual {v2, v0, v3, v5, v8}, Ld0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v51

    const-string v3, "translateY"

    const/4 v5, 0x7

    invoke-virtual {v2, v0, v3, v5, v8}, Ld0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v52

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v3

    invoke-virtual {v2, v3}, Ld0/a;->b(I)V

    if-nez v5, :cond_1f

    move-object/from16 v45, v4

    goto :goto_12

    :cond_1f
    move-object/from16 v45, v5

    :goto_12
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    sget v0, Lc0/F;->a:I

    new-instance v0, Lc0/d;

    const/16 v54, 0x200

    move-object/from16 v44, v0

    invoke-direct/range {v44 .. v54}, Lc0/d;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;I)V

    move-object/from16 v3, v56

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_10

    :cond_20
    move-object/from16 v3, v56

    move-object/from16 v1, v57

    const-string v8, "path"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto/16 :goto_10

    :cond_21
    sget-object v0, Ld0/b;->c:[I

    invoke-static {v7, v1, v11, v0}, LU0/b;->f(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v8

    invoke-virtual {v2, v8}, Ld0/a;->b(I)V

    const-string v8, "pathData"

    invoke-static {v12, v8}, LU0/b;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_35

    const/4 v8, 0x0

    invoke-virtual {v0, v8}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v8

    invoke-virtual {v2, v8}, Ld0/a;->b(I)V

    if-nez v10, :cond_22

    move-object/from16 v57, v4

    :goto_13
    const/4 v4, 0x2

    goto :goto_14

    :cond_22
    move-object/from16 v57, v10

    goto :goto_13

    :goto_14
    invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v4

    invoke-virtual {v2, v4}, Ld0/a;->b(I)V

    if-nez v8, :cond_23

    sget v4, Lc0/F;->a:I

    :goto_15
    move-object/from16 v58, v53

    goto :goto_16

    :cond_23
    invoke-static {v5, v8}, LA/t;->A(LA/t;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v53

    goto :goto_15

    :goto_16
    const-string v4, "fillColor"

    iget-object v5, v2, Ld0/a;->a:Landroid/content/res/XmlResourceParser;

    const/4 v8, 0x1

    invoke-static {v0, v5, v1, v4, v8}, LU0/b;->b(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)LI/m;

    move-result-object v4

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v5

    invoke-virtual {v2, v5}, Ld0/a;->b(I)V

    const-string v5, "fillAlpha"

    const/16 v13, 0xc

    invoke-virtual {v2, v0, v5, v13, v9}, Ld0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v61

    const-string v5, "strokeLineCap"

    iget-object v8, v2, Ld0/a;->a:Landroid/content/res/XmlResourceParser;

    invoke-static {v8, v5}, LU0/b;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_24

    const/4 v5, -0x1

    const/16 v12, 0x8

    goto :goto_17

    :cond_24
    const/4 v5, -0x1

    const/16 v12, 0x8

    invoke-virtual {v0, v12, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v8

    move v5, v8

    :goto_17
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v8

    invoke-virtual {v2, v8}, Ld0/a;->b(I)V

    if-eqz v5, :cond_27

    const/4 v8, 0x1

    if-eq v5, v8, :cond_26

    const/4 v8, 0x2

    if-eq v5, v8, :cond_25

    :goto_18
    const/16 v65, 0x0

    goto :goto_19

    :cond_25
    move/from16 v65, v8

    goto :goto_19

    :cond_26
    const/4 v8, 0x2

    const/16 v65, 0x1

    goto :goto_19

    :cond_27
    const/4 v8, 0x2

    goto :goto_18

    :goto_19
    const-string v5, "strokeLineJoin"

    iget-object v10, v2, Ld0/a;->a:Landroid/content/res/XmlResourceParser;

    invoke-static {v10, v5}, LU0/b;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_28

    const/4 v5, -0x1

    const/4 v10, -0x1

    const/16 v14, 0x9

    goto :goto_1a

    :cond_28
    const/4 v10, -0x1

    const/16 v14, 0x9

    invoke-virtual {v0, v14, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    :goto_1a
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v15

    invoke-virtual {v2, v15}, Ld0/a;->b(I)V

    if-eqz v5, :cond_2a

    const/4 v15, 0x1

    if-eq v5, v15, :cond_29

    move/from16 v66, v8

    goto :goto_1b

    :cond_29
    const/16 v66, 0x1

    goto :goto_1b

    :cond_2a
    const/16 v66, 0x0

    :goto_1b
    const-string v5, "strokeMiterLimit"

    const/16 v15, 0xa

    invoke-virtual {v2, v0, v5, v15, v9}, Ld0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v67

    const-string v5, "strokeColor"

    iget-object v15, v2, Ld0/a;->a:Landroid/content/res/XmlResourceParser;

    const/4 v14, 0x3

    invoke-static {v0, v15, v1, v5, v14}, LU0/b;->b(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)LI/m;

    move-result-object v5

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v15

    invoke-virtual {v2, v15}, Ld0/a;->b(I)V

    const-string v15, "strokeAlpha"

    const/16 v8, 0xb

    invoke-virtual {v2, v0, v15, v8, v9}, Ld0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v63

    const-string v8, "strokeWidth"

    const/4 v15, 0x4

    invoke-virtual {v2, v0, v8, v15, v9}, Ld0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v64

    const-string v8, "trimPathEnd"

    const/4 v10, 0x6

    invoke-virtual {v2, v0, v8, v10, v9}, Ld0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v69

    const-string v8, "trimPathOffset"

    const/4 v9, 0x7

    const/4 v10, 0x0

    invoke-virtual {v2, v0, v8, v9, v10}, Ld0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v70

    const-string v8, "trimPathStart"

    const/4 v9, 0x5

    invoke-virtual {v2, v0, v8, v9, v10}, Ld0/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v68

    const-string v8, "fillType"

    iget-object v9, v2, Ld0/a;->a:Landroid/content/res/XmlResourceParser;

    invoke-static {v9, v8}, LU0/b;->c(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_2b

    const/16 v8, 0xd

    const/16 v17, 0x0

    goto :goto_1c

    :cond_2b
    const/16 v8, 0xd

    const/4 v9, 0x0

    invoke-virtual {v0, v8, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v17

    :goto_1c
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v9

    invoke-virtual {v2, v9}, Ld0/a;->b(I)V

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    iget-object v0, v4, LI/m;->f:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Shader;

    if-eqz v0, :cond_2c

    goto :goto_1d

    :cond_2c
    iget v9, v4, LI/m;->e:I

    if-eqz v9, :cond_2d

    :goto_1d
    const/4 v9, 0x1

    goto :goto_1e

    :cond_2d
    const/4 v9, 0x0

    :goto_1e
    if-eqz v9, :cond_2f

    if-eqz v0, :cond_2e

    new-instance v4, LW/n;

    invoke-direct {v4, v0}, LW/n;-><init>(Landroid/graphics/Shader;)V

    move-object/from16 v60, v4

    goto :goto_1f

    :cond_2e
    new-instance v0, LW/J;

    iget v4, v4, LI/m;->e:I

    invoke-static {v4}, LW/D;->b(I)J

    move-result-wide v8

    invoke-direct {v0, v8, v9}, LW/J;-><init>(J)V

    move-object/from16 v60, v0

    goto :goto_1f

    :cond_2f
    const/16 v60, 0x0

    :goto_1f
    iget-object v0, v5, LI/m;->f:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Shader;

    if-eqz v0, :cond_30

    goto :goto_20

    :cond_30
    iget v4, v5, LI/m;->e:I

    if-eqz v4, :cond_31

    :goto_20
    const/4 v4, 0x1

    goto :goto_21

    :cond_31
    const/4 v4, 0x0

    :goto_21
    if-eqz v4, :cond_33

    if-eqz v0, :cond_32

    new-instance v4, LW/n;

    invoke-direct {v4, v0}, LW/n;-><init>(Landroid/graphics/Shader;)V

    move-object/from16 v62, v4

    goto :goto_22

    :cond_32
    new-instance v0, LW/J;

    iget v4, v5, LI/m;->e:I

    invoke-static {v4}, LW/D;->b(I)J

    move-result-wide v4

    invoke-direct {v0, v4, v5}, LW/J;-><init>(J)V

    move-object/from16 v62, v0

    goto :goto_22

    :cond_33
    const/16 v62, 0x0

    :goto_22
    if-nez v17, :cond_34

    const/16 v59, 0x0

    goto :goto_23

    :cond_34
    const/16 v59, 0x1

    :goto_23
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v4, 0x1

    sub-int/2addr v0, v4

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc0/d;

    iget-object v0, v0, Lc0/d;->j:Ljava/util/List;

    new-instance v4, Lc0/I;

    move-object/from16 v56, v4

    invoke-direct/range {v56 .. v70}, Lc0/I;-><init>(Ljava/lang/String;Ljava/util/List;ILW/D;FLW/D;FFIIFFFF)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_24
    const/4 v4, 0x1

    goto/16 :goto_29

    :cond_35
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No path data available"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    move-object/from16 v3, v56

    move-object/from16 v1, v57

    const/4 v10, 0x0

    const/16 v12, 0x8

    const/16 v13, 0xc

    const/4 v14, 0x3

    const/4 v15, 0x4

    const-string v8, "clip-path"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_37

    goto :goto_24

    :cond_37
    sget-object v0, Ld0/b;->d:[I

    invoke-static {v7, v1, v11, v0}, LU0/b;->f(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v8

    invoke-virtual {v2, v8}, Ld0/a;->b(I)V

    const/4 v8, 0x0

    invoke-virtual {v0, v8}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v8

    invoke-virtual {v2, v8}, Ld0/a;->b(I)V

    if-nez v9, :cond_38

    move-object/from16 v57, v4

    :goto_25
    const/4 v4, 0x1

    goto :goto_26

    :cond_38
    move-object/from16 v57, v9

    goto :goto_25

    :goto_26
    invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v4

    invoke-virtual {v2, v4}, Ld0/a;->b(I)V

    if-nez v8, :cond_39

    sget v4, Lc0/F;->a:I

    :goto_27
    move-object/from16 v65, v53

    goto :goto_28

    :cond_39
    invoke-static {v5, v8}, LA/t;->A(LA/t;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v53

    goto :goto_27

    :goto_28
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v0, Lc0/d;

    const/16 v66, 0x200

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/high16 v61, 0x3f800000    # 1.0f

    const/high16 v62, 0x3f800000    # 1.0f

    const/16 v63, 0x0

    const/16 v64, 0x0

    move-object/from16 v56, v0

    invoke-direct/range {v56 .. v66}, Lc0/d;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;I)V

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x1

    add-int/2addr v6, v4

    :goto_29
    invoke-interface/range {v39 .. v39}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-object v4, v1

    move-object/from16 v15, v28

    move-object/from16 v13, v30

    move-object/from16 v9, v31

    move-object/from16 v5, v33

    move-object/from16 v10, v39

    move/from16 v8, v55

    const/4 v0, -0x1

    move-object/from16 v1, p0

    goto/16 :goto_d

    :cond_3a
    move-object/from16 v33, v5

    move/from16 v55, v8

    move-object/from16 v31, v9

    move-object/from16 v30, v13

    move v4, v14

    move-object/from16 v28, v15

    const/16 v12, 0x8

    const/16 v13, 0xc

    const/4 v14, 0x3

    :goto_2a
    new-instance v0, Lr0/a;

    :goto_2b
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, v4, :cond_3b

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v4

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc0/d;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v4

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc0/d;

    iget-object v2, v2, Lc0/d;->j:Ljava/util/List;

    new-instance v4, Lc0/E;

    iget-object v5, v1, Lc0/d;->a:Ljava/lang/String;

    iget v6, v1, Lc0/d;->b:F

    iget v7, v1, Lc0/d;->c:F

    iget v8, v1, Lc0/d;->d:F

    iget v9, v1, Lc0/d;->e:F

    iget v10, v1, Lc0/d;->f:F

    iget v11, v1, Lc0/d;->g:F

    iget v15, v1, Lc0/d;->h:F

    iget-object v12, v1, Lc0/d;->i:Ljava/util/List;

    iget-object v1, v1, Lc0/d;->j:Ljava/util/List;

    move-object/from16 v44, v4

    move-object/from16 v45, v5

    move/from16 v46, v6

    move/from16 v47, v7

    move/from16 v48, v8

    move/from16 v49, v9

    move/from16 v50, v10

    move/from16 v51, v11

    move/from16 v52, v15

    move-object/from16 v53, v12

    move-object/from16 v54, v1

    invoke-direct/range {v44 .. v54}, Lc0/E;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x1

    const/16 v12, 0x8

    goto :goto_2b

    :cond_3b
    new-instance v1, Lc0/e;

    new-instance v39, Lc0/E;

    move-object/from16 v2, v33

    iget-object v3, v2, Lc0/d;->a:Ljava/lang/String;

    iget v4, v2, Lc0/d;->b:F

    iget v5, v2, Lc0/d;->c:F

    iget v6, v2, Lc0/d;->d:F

    iget v7, v2, Lc0/d;->e:F

    iget v8, v2, Lc0/d;->f:F

    iget v9, v2, Lc0/d;->g:F

    iget v10, v2, Lc0/d;->h:F

    iget-object v11, v2, Lc0/d;->i:Ljava/util/List;

    iget-object v12, v2, Lc0/d;->j:Ljava/util/List;

    move-object/from16 v2, v39

    invoke-direct/range {v2 .. v12}, Lc0/E;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V

    move-object/from16 v33, v1

    invoke-direct/range {v33 .. v43}, Lc0/e;-><init>(Ljava/lang/String;FFFFLc0/E;JIZ)V

    move/from16 v2, v55

    invoke-direct {v0, v1, v2}, Lr0/a;-><init>(Lc0/e;I)V

    move-object/from16 v1, v31

    iget-object v1, v1, Lr0/c;->a:Ljava/util/HashMap;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    move-object/from16 v3, v30

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2c

    :cond_3c
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "<VectorGraphic> tag requires viewportHeight > 0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3d
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "<VectorGraphic> tag requires viewportWidth > 0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3f
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "No start tag found"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_40
    move-object/from16 v28, v15

    const/16 v13, 0xc

    :goto_2c
    iget-object v0, v0, Lr0/a;->a:Lc0/e;

    sget-object v1, Lo0/f0;->f:LD/M0;

    move-object/from16 v2, v28

    invoke-virtual {v2, v1}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LG0/b;

    iget v3, v0, Lc0/e;->j:I

    int-to-float v3, v3

    invoke-interface {v1}, LG0/b;->n()F

    move-result v4

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v5, v3

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    const/16 v7, 0x20

    shl-long/2addr v5, v7

    const-wide v7, 0xffffffffL

    and-long/2addr v3, v7

    or-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, LD/n;->e(J)Z

    move-result v3

    invoke-virtual {v2}, LD/n;->H()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_41

    sget-object v3, LD/l;->a:LD/U;

    if-ne v4, v3, :cond_46

    :cond_41
    new-instance v3, Lc0/c;

    invoke-direct {v3}, Lc0/c;-><init>()V

    iget-object v4, v0, Lc0/e;->f:Lc0/E;

    invoke-static {v3, v4}, Lc0/b;->a(Lc0/c;Lc0/E;)V

    iget v4, v0, Lc0/e;->b:F

    invoke-interface {v1, v4}, LG0/b;->u(F)F

    move-result v4

    iget v5, v0, Lc0/e;->c:F

    invoke-interface {v1, v5}, LG0/b;->u(F)F

    move-result v1

    invoke-static {v4, v1}, La/a;->d(FF)J

    move-result-wide v4

    iget v1, v0, Lc0/e;->d:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-eqz v6, :cond_42

    invoke-static {v4, v5}, LV/f;->d(J)F

    move-result v1

    :cond_42
    iget v6, v0, Lc0/e;->e:F

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-eqz v7, :cond_43

    invoke-static {v4, v5}, LV/f;->b(J)F

    move-result v6

    :cond_43
    invoke-static {v1, v6}, La/a;->d(FF)J

    move-result-wide v6

    new-instance v1, Lc0/H;

    invoke-direct {v1, v3}, Lc0/H;-><init>(Lc0/c;)V

    iget-wide v8, v0, Lc0/e;->g:J

    const-wide/16 v10, 0x10

    cmp-long v3, v8, v10

    if-eqz v3, :cond_45

    new-instance v3, LW/l;

    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    iget v11, v0, Lc0/e;->h:I

    const/16 v12, 0x1d

    if-lt v10, v12, :cond_44

    sget-object v10, LW/m;->a:LW/m;

    invoke-virtual {v10, v8, v9, v11}, LW/m;->a(JI)Landroid/graphics/BlendModeColorFilter;

    move-result-object v10

    goto :goto_2d

    :cond_44
    new-instance v10, Landroid/graphics/PorterDuffColorFilter;

    invoke-static {v8, v9}, LW/D;->C(J)I

    move-result v12

    invoke-static {v11}, LW/D;->E(I)Landroid/graphics/PorterDuff$Mode;

    move-result-object v15

    invoke-direct {v10, v12, v15}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    :goto_2d
    invoke-direct {v3, v8, v9, v11, v10}, LW/l;-><init>(JILandroid/graphics/ColorFilter;)V

    goto :goto_2e

    :cond_45
    const/4 v3, 0x0

    :goto_2e
    iget-object v8, v1, Lc0/H;->e:LD/f0;

    new-instance v9, LV/f;

    invoke-direct {v9, v4, v5}, LV/f;-><init>(J)V

    invoke-virtual {v8, v9}, LD/f0;->setValue(Ljava/lang/Object;)V

    iget-object v4, v1, Lc0/H;->f:LD/f0;

    iget-boolean v5, v0, Lc0/e;->i:Z

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v4, v5}, LD/f0;->setValue(Ljava/lang/Object;)V

    iget-object v4, v1, Lc0/H;->g:Lc0/D;

    iget-object v5, v4, Lc0/D;->g:LD/f0;

    invoke-virtual {v5, v3}, LD/f0;->setValue(Ljava/lang/Object;)V

    iget-object v3, v4, Lc0/D;->i:LD/f0;

    new-instance v5, LV/f;

    invoke-direct {v5, v6, v7}, LV/f;-><init>(J)V

    invoke-virtual {v3, v5}, LD/f0;->setValue(Ljava/lang/Object;)V

    iget-object v0, v0, Lc0/e;->a:Ljava/lang/String;

    iput-object v0, v4, Lc0/D;->c:Ljava/lang/String;

    invoke-virtual {v2, v1}, LD/n;->V(Ljava/lang/Object;)V

    move-object v4, v1

    :cond_46
    check-cast v4, Lc0/H;

    const/4 v1, 0x0

    invoke-virtual {v2, v1}, LD/n;->q(Z)V

    move-object v7, v4

    goto :goto_2f

    :cond_47
    move-object v2, v15

    const/16 v13, 0xc

    const v1, -0x2fdb0c43

    invoke-virtual {v2, v1}, LD/n;->N(I)V

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-virtual {v2, v8}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v2, v10}, LD/n;->d(I)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v2, v0}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v1

    invoke-virtual {v2}, LD/n;->H()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_48

    sget-object v0, LD/l;->a:LD/U;

    if-ne v1, v0, :cond_49

    :cond_48
    const/4 v1, 0x0

    :try_start_2
    invoke-virtual {v7, v10, v1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable"

    invoke-static {v0, v1}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    new-instance v1, LW/f;

    invoke-direct {v1, v0}, LW/f;-><init>(Landroid/graphics/Bitmap;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    invoke-virtual {v2, v1}, LD/n;->V(Ljava/lang/Object;)V

    :cond_49
    check-cast v1, LW/f;

    new-instance v0, Lb0/a;

    invoke-direct {v0, v1}, Lb0/a;-><init>(LW/f;)V

    const/4 v1, 0x0

    invoke-virtual {v2, v1}, LD/n;->q(Z)V

    move-object v7, v0

    :goto_2f
    const v0, 0x7f0f001e

    invoke-static {v0, v2}, LZ/b;->O(ILD/n;)Ljava/lang/String;

    move-result-object v8

    sget-object v1, LP/i;->a:LP/i;

    const/16 v3, 0x50

    int-to-float v3, v3

    invoke-static {v3}, Landroidx/compose/foundation/layout/b;->f(F)LP/l;

    move-result-object v9

    const/4 v11, 0x0

    const/16 v15, 0x188

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v3, 0x0

    move-object/from16 v4, p2

    const/16 v5, 0x8

    move/from16 v6, v16

    move-object v13, v3

    const/16 v3, 0x10

    move-object v14, v2

    invoke-static/range {v7 .. v15}, LZ0/d;->b(Lb0/b;Ljava/lang/String;LP/l;LP/d;Ll0/d;FLW/l;LD/n;I)V

    invoke-static {v0, v2}, LZ/b;->O(ILD/n;)Ljava/lang/String;

    move-result-object v7

    const/16 v0, 0x16

    invoke-static {v0}, La/a;->L(I)J

    move-result-wide v11

    sget-object v0, Lz0/l;->h:Lz0/l;

    sget-object v14, LA/q;->a:LD/M0;

    invoke-virtual {v2, v14}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LA/o;

    iget-wide v9, v8, LA/o;->a:J

    int-to-float v8, v3

    invoke-static {v1, v8}, Landroidx/compose/foundation/layout/b;->e(LP/l;F)LP/l;

    move-result-object v8

    const/16 v30, 0x0

    const v31, 0x1ffd0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const v29, 0x30c30

    move-object v5, v14

    move-object v14, v0

    move-object/from16 v28, v2

    invoke-static/range {v7 .. v31}, LA/O;->b(Ljava/lang/String;LP/l;JJLz0/j;Lz0/l;Lz0/r;JLF0/g;LF0/f;JIZIILo2/c;Lv0/B;LD/n;III)V

    const v7, 0x7f0f0089

    invoke-static {v7, v2}, LZ/b;->O(ILD/n;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v3}, La/a;->L(I)J

    move-result-wide v11

    invoke-virtual {v2, v5}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LA/o;

    iget-wide v9, v3, LA/o;->f:J

    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    const/16 v5, 0x8

    int-to-float v5, v5

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/b;->e(LP/l;F)LP/l;

    move-result-object v8

    new-instance v5, LF0/f;

    const/4 v13, 0x3

    invoke-direct {v5, v13}, LF0/f;-><init>(I)V

    const/16 v30, 0x0

    const v31, 0x1fdf0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0xc30

    move-object/from16 v19, v5

    move-object/from16 v28, v2

    invoke-static/range {v7 .. v31}, LA/O;->b(Ljava/lang/String;LP/l;JJLz0/j;Lz0/l;Lz0/r;JLF0/g;LF0/f;JIZIILo2/c;Lv0/B;LD/n;III)V

    invoke-interface/range {v32 .. v32}, LD/L0;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_4a

    const-string v5, "\u670d\u52a1\u72b6\u6001: \u5df2\u8fde\u63a5"

    :goto_30
    move-object v7, v5

    goto :goto_31

    :cond_4a
    const-string v5, "\u670d\u52a1\u72b6\u6001: \u672a\u8fde\u63a5"

    goto :goto_30

    :goto_31
    invoke-interface/range {v32 .. v32}, LD/L0;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_4b

    const-wide v8, 0xff4caf50L

    :goto_32
    invoke-static {v8, v9}, LW/D;->c(J)J

    move-result-wide v8

    move-wide v9, v8

    goto :goto_33

    :cond_4b
    const-wide v8, 0xfff44336L

    goto :goto_32

    :goto_33
    const/16 v5, 0x12

    invoke-static {v5}, La/a;->L(I)J

    move-result-wide v11

    invoke-static {v1, v6}, Landroidx/compose/foundation/layout/b;->e(LP/l;F)LP/l;

    move-result-object v8

    const/16 v30, 0x0

    const v31, 0x1ffd0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const v29, 0x30c30

    move-object v14, v0

    move-object/from16 v28, v2

    invoke-static/range {v7 .. v31}, LA/O;->b(Ljava/lang/String;LP/l;JJLz0/j;Lz0/l;Lz0/r;JLF0/g;LF0/f;JIZIILo2/c;Lv0/B;LD/n;III)V

    new-instance v7, LA0/c;

    const/4 v1, 0x6

    invoke-direct {v7, v1, v4}, LA0/c;-><init>(ILjava/lang/Object;)V

    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/b;->e(LP/l;F)LP/l;

    move-result-object v8

    const/16 v1, 0xc

    int-to-float v0, v1

    const/4 v1, 0x0

    int-to-float v1, v1

    new-instance v13, Lt/p;

    invoke-direct {v13, v1, v0, v1, v0}, Lt/p;-><init>(FFFF)V

    sget-object v0, LG1/c;->a:LL/a;

    const/4 v12, 0x0

    const v16, 0x30c00030

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    move-object v15, v2

    invoke-static/range {v7 .. v16}, LA/C;->a(LA0/c;LP/l;ZLW/H;LA/b;LA/g;Lt/p;Ls/g;LD/n;I)V

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, LD/n;->q(Z)V

    :goto_34
    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :catch_1
    move-exception v0

    new-instance v1, LB1/c;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error attempting to load resource: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_35
    monitor-exit v8

    throw v0

    :pswitch_4
    move v1, v5

    move-object/from16 v0, p1

    check-cast v0, Lv0/v;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    new-instance v4, Lx0/b;

    iget-object v5, v0, Lv0/v;->f:Lz0/r;

    iget-object v6, v0, Lv0/v;->c:Lz0/l;

    if-nez v6, :cond_4c

    sget-object v6, Lz0/l;->f:Lz0/l;

    :cond_4c
    iget-object v7, v0, Lv0/v;->d:Lz0/j;

    if-eqz v7, :cond_4d

    iget v1, v7, Lz0/j;->a:I

    :cond_4d
    iget-object v0, v0, Lv0/v;->e:Lz0/k;

    if-eqz v0, :cond_4e

    iget v0, v0, Lz0/k;->a:I

    :goto_36
    move-object/from16 v7, p0

    goto :goto_37

    :cond_4e
    const/4 v0, 0x1

    goto :goto_36

    :goto_37
    iget-object v8, v7, LD0/b;->g:Ljava/lang/Object;

    check-cast v8, LC0/c;

    iget-object v8, v8, LC0/c;->e:LC0/d;

    iget-object v9, v8, LC0/d;->e:Lz0/e;

    check-cast v9, Lz0/f;

    invoke-virtual {v9, v5, v6, v1, v0}, Lz0/f;->b(Lz0/r;Lz0/l;II)Lz0/t;

    move-result-object v0

    instance-of v1, v0, Lz0/t;

    const-string v5, "null cannot be cast to non-null type android.graphics.Typeface"

    if-nez v1, :cond_4f

    new-instance v1, LB0/a;

    iget-object v6, v8, LC0/d;->j:LB0/a;

    invoke-direct {v1, v0, v6}, LB0/a;-><init>(Lz0/t;LB0/a;)V

    iput-object v1, v8, LC0/d;->j:LB0/a;

    iget-object v0, v1, LB0/a;->d:Ljava/lang/Object;

    invoke-static {v0, v5}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/Typeface;

    :goto_38
    const/4 v1, 0x1

    goto :goto_39

    :cond_4f
    iget-object v0, v0, Lz0/t;->d:Ljava/lang/Object;

    invoke-static {v0, v5}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/Typeface;

    goto :goto_38

    :goto_39
    invoke-direct {v4, v1, v0}, Lx0/b;-><init>(ILjava/lang/Object;)V

    const/16 v0, 0x21

    iget-object v1, v7, LD0/b;->f:Ljava/lang/Object;

    check-cast v1, Landroid/text/Spannable;

    invoke-interface {v1, v4, v2, v3, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
