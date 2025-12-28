.class public final LM1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LM1/h;->d:I

    iput-object p2, p0, LM1/h;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    move-object/from16 v1, p0

    const/4 v0, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-object v8, v1, LM1/h;->e:Ljava/lang/Object;

    iget v9, v1, LM1/h;->d:I

    packed-switch v9, :pswitch_data_0

    check-cast v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {v8}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->N()Z

    return-void

    :pswitch_0
    check-cast v8, Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v8, Landroidx/recyclerview/widget/RecyclerView;->H:Lz1/t;

    if-eqz v0, :cond_a

    check-cast v0, Lz1/g;

    iget-object v8, v0, Lz1/g;->h:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    iget-object v10, v0, Lz1/g;->j:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v11

    iget-object v12, v0, Lz1/g;->k:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v13

    iget-object v14, v0, Lz1/g;->i:Ljava/util/ArrayList;

    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v15

    if-eqz v9, :cond_0

    if-eqz v11, :cond_0

    if-eqz v15, :cond_0

    if-eqz v13, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-nez v17, :cond_9

    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    if-nez v11, :cond_2

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v2, v0, Lz1/g;->m:Ljava/util/ArrayList;

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    new-instance v2, Lz1/c;

    invoke-direct {v2, v0, v8, v7}, Lz1/c;-><init>(Lz1/g;Ljava/util/ArrayList;I)V

    if-eqz v9, :cond_1

    invoke-virtual {v2}, Lz1/c;->run()V

    goto :goto_0

    :cond_1
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz1/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v6

    :cond_2
    :goto_0
    if-nez v13, :cond_4

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v3, v0, Lz1/g;->n:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    new-instance v3, Lz1/c;

    invoke-direct {v3, v0, v2, v4}, Lz1/c;-><init>(Lz1/g;Ljava/util/ArrayList;I)V

    if-eqz v9, :cond_3

    invoke-virtual {v3}, Lz1/c;->run()V

    goto :goto_1

    :cond_3
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz1/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v6

    :cond_4
    :goto_1
    if-nez v15, :cond_a

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v3, v0, Lz1/g;->l:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v14}, Ljava/util/ArrayList;->clear()V

    new-instance v3, Lz1/c;

    invoke-direct {v3, v0, v2, v5}, Lz1/c;-><init>(Lz1/g;Ljava/util/ArrayList;I)V

    if-eqz v9, :cond_6

    if-eqz v11, :cond_6

    if-nez v13, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v3}, Lz1/c;->run()V

    goto :goto_5

    :cond_6
    :goto_2
    if-nez v11, :cond_7

    iget-wide v3, v0, Lz1/t;->e:J

    goto :goto_3

    :cond_7
    const-wide/16 v3, 0x0

    :goto_3
    if-nez v13, :cond_8

    iget-wide v8, v0, Lz1/t;->f:J

    goto :goto_4

    :cond_8
    const-wide/16 v8, 0x0

    :goto_4
    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->max(JJ)J

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz1/I;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ld1/K;->a:Ljava/lang/reflect/Field;

    throw v6

    :cond_9
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz1/I;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v6

    :cond_a
    :goto_5
    return-void

    :pswitch_1
    check-cast v8, Lz1/i;

    iget v2, v8, Lz1/i;->v:I

    iget-object v3, v8, Lz1/i;->u:Landroid/animation/ValueAnimator;

    if-eq v2, v4, :cond_b

    if-eq v2, v5, :cond_c

    goto :goto_6

    :cond_b
    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_c
    iput v0, v8, Lz1/i;->v:I

    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    new-array v2, v5, [F

    aput v0, v2, v7

    const/4 v0, 0x0

    aput v0, v2, v4

    invoke-virtual {v3, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    const/16 v0, 0x1f4

    int-to-long v4, v0

    invoke-virtual {v3, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->start()V

    :goto_6
    return-void

    :pswitch_2
    check-cast v8, LB2/i;

    invoke-virtual {v8}, LB2/i;->i()V

    throw v6

    :pswitch_3
    check-cast v8, Ls1/d;

    iget-object v0, v8, Ls1/d;->h:Ls1/b;

    invoke-virtual {v0, v6}, Ls1/b;->onDismiss(Landroid/content/DialogInterface;)V

    return-void

    :pswitch_4
    move-object v2, v8

    check-cast v2, Lo0/u;

    invoke-virtual {v2, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v10, v2, Lo0/u;->o0:Landroid/view/MotionEvent;

    if-eqz v10, :cond_10

    invoke-virtual {v10, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v2

    if-ne v2, v0, :cond_d

    move v7, v4

    :cond_d
    invoke-virtual {v10}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-eqz v7, :cond_e

    const/16 v2, 0xa

    if-eq v0, v2, :cond_10

    if-eq v0, v4, :cond_10

    goto :goto_7

    :cond_e
    if-eq v0, v4, :cond_10

    :goto_7
    const/4 v2, 0x7

    if-eq v0, v2, :cond_f

    const/16 v3, 0x9

    if-eq v0, v3, :cond_f

    move v11, v5

    goto :goto_8

    :cond_f
    move v11, v2

    :goto_8
    move-object v9, v8

    check-cast v9, Lo0/u;

    iget-wide v12, v9, Lo0/u;->p0:J

    const/4 v14, 0x0

    invoke-virtual/range {v9 .. v14}, Lo0/u;->F(Landroid/view/MotionEvent;IJZ)V

    :cond_10
    return-void

    :pswitch_5
    check-cast v8, Ln1/e;

    invoke-virtual {v8, v7}, Ln1/e;->n(I)V

    return-void

    :pswitch_6
    check-cast v8, Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v8, Landroidx/appcompat/widget/Toolbar;->d:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v0, :cond_11

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->v:Lk/h;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Lk/h;->h()Z

    :cond_11
    return-void

    :pswitch_7
    check-cast v8, Lk/a0;

    iput-object v6, v8, Lk/a0;->o:LM1/h;

    invoke-virtual {v8}, Lk/a0;->drawableStateChanged()V

    return-void

    :pswitch_8
    check-cast v8, Lj1/g;

    iget-boolean v0, v8, Lj1/g;->r:Z

    if-nez v0, :cond_12

    goto/16 :goto_a

    :cond_12
    iget-boolean v0, v8, Lj1/g;->p:Z

    iget-object v2, v8, Lj1/g;->d:Lj1/a;

    if-eqz v0, :cond_13

    iput-boolean v7, v8, Lj1/g;->p:Z

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v3

    iput-wide v3, v2, Lj1/a;->e:J

    const-wide/16 v5, -0x1

    iput-wide v5, v2, Lj1/a;->g:J

    iput-wide v3, v2, Lj1/a;->f:J

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, v2, Lj1/a;->h:F

    :cond_13
    iget-wide v3, v2, Lj1/a;->g:J

    const-wide/16 v5, 0x0

    cmp-long v0, v3, v5

    if-lez v0, :cond_14

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v3

    iget-wide v5, v2, Lj1/a;->g:J

    iget v0, v2, Lj1/a;->i:I

    int-to-long v9, v0

    add-long/2addr v5, v9

    cmp-long v0, v3, v5

    if-lez v0, :cond_14

    goto :goto_9

    :cond_14
    invoke-virtual {v8}, Lj1/g;->e()Z

    move-result v0

    if-nez v0, :cond_15

    :goto_9
    iput-boolean v7, v8, Lj1/g;->r:Z

    goto :goto_a

    :cond_15
    iget-boolean v0, v8, Lj1/g;->q:Z

    iget-object v3, v8, Lj1/g;->f:Landroid/widget/ListView;

    if-eqz v0, :cond_16

    iput-boolean v7, v8, Lj1/g;->q:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v11

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v13, 0x3

    const/4 v14, 0x0

    move-wide v9, v11

    invoke-static/range {v9 .. v16}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    :cond_16
    iget-wide v4, v2, Lj1/a;->f:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-eqz v0, :cond_17

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lj1/a;->a(J)F

    move-result v0

    const/high16 v6, -0x3f800000    # -4.0f

    mul-float/2addr v6, v0

    mul-float/2addr v6, v0

    const/high16 v7, 0x40800000    # 4.0f

    mul-float/2addr v0, v7

    add-float/2addr v0, v6

    iget-wide v6, v2, Lj1/a;->f:J

    sub-long v6, v4, v6

    iput-wide v4, v2, Lj1/a;->f:J

    long-to-float v4, v6

    mul-float/2addr v4, v0

    iget v0, v2, Lj1/a;->d:F

    mul-float/2addr v4, v0

    float-to-int v0, v4

    iget-object v2, v8, Lj1/g;->t:Lk/a0;

    invoke-virtual {v2, v0}, Landroid/widget/AbsListView;->scrollListBy(I)V

    sget-object v0, Ld1/K;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v3, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :goto_a
    return-void

    :cond_17
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "Cannot compute scroll delta before calling start()"

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_9
    :try_start_0
    check-cast v8, Lb/k;

    invoke-static {v8}, Lb/k;->d(Lb/k;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_d

    :catch_0
    move-exception v0

    goto :goto_b

    :catch_1
    move-exception v0

    goto :goto_c

    :goto_b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Attempt to invoke virtual method \'android.os.Handler android.app.FragmentHostCallback.getHandler()\' on a null object reference"

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_18

    goto :goto_d

    :cond_18
    throw v0

    :goto_c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Can not perform this action after onSaveInstanceState"

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_19

    :goto_d
    return-void

    :cond_19
    throw v0

    :pswitch_a
    check-cast v8, LM1/i;

    iput-boolean v7, v8, LM1/i;->c:Z

    iget-object v0, v8, LM1/i;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v2, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:Ln1/e;

    if-eqz v2, :cond_1a

    invoke-virtual {v2}, Ln1/e;->f()Z

    move-result v2

    if-eqz v2, :cond_1a

    iget v0, v8, LM1/i;->b:I

    invoke-virtual {v8, v0}, LM1/i;->a(I)V

    goto :goto_e

    :cond_1a
    iget v2, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:I

    if-ne v2, v5, :cond_1b

    iget v2, v8, LM1/i;->b:I

    invoke-virtual {v0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->C(I)V

    :cond_1b
    :goto_e
    return-void

    :pswitch_data_0
    .packed-switch 0x0
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
