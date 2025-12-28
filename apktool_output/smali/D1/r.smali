.class public final LD1/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public d:LD1/o;

.field public e:Landroid/view/ViewGroup;


# virtual methods
.method public final onPreDraw()Z
    .locals 17

    move-object/from16 v0, p0

    const/4 v1, 0x1

    iget-object v2, v0, LD1/r;->e:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    sget-object v2, LD1/s;->c:Ljava/util/ArrayList;

    iget-object v4, v0, LD1/r;->e:Landroid/view/ViewGroup;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    return v1

    :cond_0
    invoke-static {}, LD1/s;->b()Ln/f;

    move-result-object v2

    invoke-virtual {v2, v4}, Ln/F;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    if-nez v3, :cond_2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v4, v3}, Ln/F;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const/4 v6, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_1

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_0
    iget-object v9, v0, LD1/r;->d:LD1/o;

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, LD1/q;

    invoke-direct {v3, v0, v2}, LD1/q;-><init>(LD1/r;Ln/f;)V

    invoke-virtual {v9, v3}, LD1/o;->a(LD1/n;)V

    const/4 v2, 0x0

    invoke-virtual {v9, v4, v2}, LD1/o;->g(Landroid/view/ViewGroup;Z)V

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LD1/o;

    invoke-virtual {v6, v4}, LD1/o;->v(Landroid/view/View;)V

    goto :goto_1

    :cond_3
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v9, LD1/o;->n:Ljava/util/ArrayList;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v9, LD1/o;->o:Ljava/util/ArrayList;

    iget-object v3, v9, LD1/o;->j:LD1/w;

    iget-object v6, v9, LD1/o;->k:LD1/w;

    new-instance v7, Ln/f;

    iget-object v8, v3, LD1/w;->a:Ljava/lang/Object;

    check-cast v8, Ln/f;

    invoke-direct {v7, v8}, Ln/f;-><init>(Ln/F;)V

    new-instance v8, Ln/f;

    iget-object v10, v6, LD1/w;->a:Ljava/lang/Object;

    check-cast v10, Ln/f;

    invoke-direct {v8, v10}, Ln/f;-><init>(Ln/F;)V

    move v10, v2

    :goto_2
    iget-object v11, v9, LD1/o;->m:[I

    array-length v12, v11

    if-ge v10, v12, :cond_11

    aget v11, v11, v10

    if-eq v11, v1, :cond_f

    const/4 v12, 0x2

    if-eq v11, v12, :cond_c

    const/4 v12, 0x3

    if-eq v11, v12, :cond_8

    const/4 v12, 0x4

    if-eq v11, v12, :cond_5

    :cond_4
    move v0, v1

    move-object v2, v3

    goto/16 :goto_9

    :cond_5
    iget-object v11, v3, LD1/w;->d:Ljava/lang/Object;

    check-cast v11, Ln/m;

    invoke-virtual {v11}, Ln/m;->g()I

    move-result v12

    move v13, v2

    :goto_3
    if-ge v13, v12, :cond_4

    invoke-virtual {v11, v13}, Ln/m;->h(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/view/View;

    if-eqz v14, :cond_6

    invoke-virtual {v9, v14}, LD1/o;->r(Landroid/view/View;)Z

    move-result v15

    if-eqz v15, :cond_6

    move-object/from16 v16, v3

    invoke-virtual {v11, v13}, Ln/m;->d(I)J

    move-result-wide v2

    iget-object v15, v6, LD1/w;->d:Ljava/lang/Object;

    check-cast v15, Ln/m;

    invoke-virtual {v15, v2, v3}, Ln/m;->b(J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_7

    invoke-virtual {v9, v2}, LD1/o;->r(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v7, v14}, Ln/F;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LD1/v;

    invoke-virtual {v8, v2}, Ln/F;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LD1/v;

    if-eqz v3, :cond_7

    if-eqz v15, :cond_7

    iget-object v5, v9, LD1/o;->n:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v9, LD1/o;->o:Ljava/util/ArrayList;

    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7, v14}, Ln/F;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8, v2}, Ln/F;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_6
    move-object/from16 v16, v3

    :cond_7
    :goto_4
    add-int/2addr v13, v1

    move-object/from16 v3, v16

    const/4 v2, 0x0

    goto :goto_3

    :cond_8
    move-object v2, v3

    iget-object v3, v2, LD1/w;->c:Ljava/lang/Object;

    check-cast v3, Landroid/util/SparseArray;

    iget-object v5, v6, LD1/w;->c:Ljava/lang/Object;

    check-cast v5, Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v11

    const/4 v12, 0x0

    :goto_5
    if-ge v12, v11, :cond_b

    invoke-virtual {v3, v12}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/view/View;

    if-eqz v13, :cond_a

    invoke-virtual {v9, v13}, LD1/o;->r(Landroid/view/View;)Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-virtual {v3, v12}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v14

    invoke-virtual {v5, v14}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/view/View;

    if-eqz v14, :cond_a

    invoke-virtual {v9, v14}, LD1/o;->r(Landroid/view/View;)Z

    move-result v15

    if-eqz v15, :cond_a

    invoke-virtual {v7, v13}, Ln/F;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LD1/v;

    invoke-virtual {v8, v14}, Ln/F;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v1, v16

    check-cast v1, LD1/v;

    if-eqz v15, :cond_9

    if-eqz v1, :cond_9

    iget-object v0, v9, LD1/o;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v9, LD1/o;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7, v13}, Ln/F;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8, v14}, Ln/F;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    const/4 v0, 0x1

    goto :goto_6

    :cond_a
    move v0, v1

    :goto_6
    add-int/2addr v12, v0

    move v1, v0

    move-object/from16 v0, p0

    goto :goto_5

    :cond_b
    move v0, v1

    goto/16 :goto_9

    :cond_c
    move-object v2, v3

    iget-object v0, v2, LD1/w;->b:Ljava/lang/Object;

    check-cast v0, Ln/f;

    iget v1, v0, Ln/F;->f:I

    const/4 v3, 0x0

    :goto_7
    if-ge v3, v1, :cond_e

    invoke-virtual {v0, v3}, Ln/F;->i(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    if-eqz v5, :cond_d

    invoke-virtual {v9, v5}, LD1/o;->r(Landroid/view/View;)Z

    move-result v11

    if-eqz v11, :cond_d

    invoke-virtual {v0, v3}, Ln/F;->f(I)Ljava/lang/Object;

    move-result-object v11

    iget-object v12, v6, LD1/w;->b:Ljava/lang/Object;

    check-cast v12, Ln/f;

    invoke-virtual {v12, v11}, Ln/F;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/view/View;

    if-eqz v11, :cond_d

    invoke-virtual {v9, v11}, LD1/o;->r(Landroid/view/View;)Z

    move-result v12

    if-eqz v12, :cond_d

    invoke-virtual {v7, v5}, Ln/F;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LD1/v;

    invoke-virtual {v8, v11}, Ln/F;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LD1/v;

    if-eqz v12, :cond_d

    if-eqz v13, :cond_d

    iget-object v14, v9, LD1/o;->n:Ljava/util/ArrayList;

    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v12, v9, LD1/o;->o:Ljava/util/ArrayList;

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7, v5}, Ln/F;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8, v11}, Ln/F;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    const/4 v5, 0x1

    add-int/2addr v3, v5

    goto :goto_7

    :cond_e
    const/4 v0, 0x1

    goto :goto_9

    :cond_f
    move v5, v1

    move-object v2, v3

    iget v0, v7, Ln/F;->f:I

    sub-int/2addr v0, v5

    :goto_8
    if-ltz v0, :cond_e

    invoke-virtual {v7, v0}, Ln/F;->f(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_10

    invoke-virtual {v9, v1}, LD1/o;->r(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-virtual {v8, v1}, Ln/F;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD1/v;

    if-eqz v1, :cond_10

    iget-object v3, v1, LD1/v;->b:Landroid/view/View;

    invoke-virtual {v9, v3}, LD1/o;->r(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-virtual {v7, v0}, Ln/F;->g(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LD1/v;

    iget-object v5, v9, LD1/o;->n:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v9, LD1/o;->o:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    :goto_9
    add-int/2addr v10, v0

    move v1, v0

    move-object v3, v2

    const/4 v2, 0x0

    move-object/from16 v0, p0

    goto/16 :goto_2

    :cond_11
    const/4 v0, 0x0

    :goto_a
    iget v1, v7, Ln/F;->f:I

    if-ge v0, v1, :cond_13

    invoke-virtual {v7, v0}, Ln/F;->i(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD1/v;

    iget-object v2, v1, LD1/v;->b:Landroid/view/View;

    invoke-virtual {v9, v2}, LD1/o;->r(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_12

    iget-object v2, v9, LD1/o;->n:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v9, LD1/o;->o:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_12
    const/4 v1, 0x1

    add-int/2addr v0, v1

    goto :goto_a

    :cond_13
    const/4 v2, 0x0

    :goto_b
    iget v0, v8, Ln/F;->f:I

    if-ge v2, v0, :cond_15

    invoke-virtual {v8, v2}, Ln/F;->i(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD1/v;

    iget-object v1, v0, LD1/v;->b:Landroid/view/View;

    invoke-virtual {v9, v1}, LD1/o;->r(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_14

    iget-object v1, v9, LD1/o;->o:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v9, LD1/o;->n:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_c
    const/4 v0, 0x1

    goto :goto_d

    :cond_14
    const/4 v1, 0x0

    goto :goto_c

    :goto_d
    add-int/2addr v2, v0

    goto :goto_b

    :cond_15
    const/4 v0, 0x1

    invoke-static {}, LD1/o;->n()Ln/f;

    move-result-object v1

    iget v2, v1, Ln/F;->f:I

    sget-object v3, LD1/x;->a:LD1/y;

    invoke-virtual {v4}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    move-result-object v3

    sub-int/2addr v2, v0

    :goto_e
    if-ltz v2, :cond_1b

    invoke-virtual {v1, v2}, Ln/F;->f(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/animation/Animator;

    if-eqz v0, :cond_1a

    invoke-virtual {v1, v0}, Ln/F;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LD1/m;

    if-eqz v5, :cond_1a

    iget-object v6, v5, LD1/m;->a:Landroid/view/View;

    if-eqz v6, :cond_1a

    iget-object v7, v5, LD1/m;->d:LD1/D;

    if-eqz v7, :cond_1a

    iget-object v7, v7, LD1/D;->a:Landroid/view/WindowId;

    invoke-virtual {v7, v3}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1a

    const/4 v7, 0x1

    invoke-virtual {v9, v6, v7}, LD1/o;->p(Landroid/view/View;Z)LD1/v;

    move-result-object v8

    invoke-virtual {v9, v6, v7}, LD1/o;->m(Landroid/view/View;Z)LD1/v;

    move-result-object v10

    if-nez v8, :cond_16

    if-nez v10, :cond_16

    iget-object v7, v9, LD1/o;->k:LD1/w;

    iget-object v7, v7, LD1/w;->a:Ljava/lang/Object;

    check-cast v7, Ln/f;

    invoke-virtual {v7, v6}, Ln/F;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, LD1/v;

    :cond_16
    if-nez v8, :cond_17

    if-eqz v10, :cond_1a

    :cond_17
    iget-object v6, v5, LD1/m;->e:LD1/o;

    iget-object v5, v5, LD1/m;->c:LD1/v;

    invoke-virtual {v6, v5, v10}, LD1/o;->q(LD1/v;LD1/v;)Z

    move-result v5

    if-eqz v5, :cond_1a

    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    move-result v5

    if-nez v5, :cond_19

    invoke-virtual {v0}, Landroid/animation/Animator;->isStarted()Z

    move-result v5

    if-eqz v5, :cond_18

    goto :goto_f

    :cond_18
    invoke-virtual {v1, v0}, Ln/F;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_10

    :cond_19
    :goto_f
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    :cond_1a
    :goto_10
    add-int/lit8 v2, v2, -0x1

    goto :goto_e

    :cond_1b
    iget-object v5, v9, LD1/o;->j:LD1/w;

    iget-object v6, v9, LD1/o;->k:LD1/w;

    iget-object v7, v9, LD1/o;->n:Ljava/util/ArrayList;

    iget-object v8, v9, LD1/o;->o:Ljava/util/ArrayList;

    move-object v3, v9

    invoke-virtual/range {v3 .. v8}, LD1/o;->k(Landroid/view/ViewGroup;LD1/w;LD1/w;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {v9}, LD1/o;->w()V

    const/4 v0, 0x1

    return v0
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, LD1/r;->e:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    sget-object p1, LD1/s;->c:Ljava/util/ArrayList;

    iget-object v0, p0, LD1/r;->e:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-static {}, LD1/s;->b()Ln/f;

    move-result-object p1

    invoke-virtual {p1, v0}, Ln/F;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD1/o;

    invoke-virtual {v1, v0}, LD1/o;->v(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LD1/r;->d:LD1/o;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LD1/o;->h(Z)V

    return-void
.end method
