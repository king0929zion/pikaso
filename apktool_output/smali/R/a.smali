.class public final synthetic LR/a;
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

    iput p1, p0, LR/a;->d:I

    iput-object p2, p0, LR/a;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 26

    move-object/from16 v1, p0

    const/4 v0, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    iget v5, v1, LR/a;->d:I

    packed-switch v5, :pswitch_data_0

    iget-object v0, v1, LR/a;->e:Ljava/lang/Object;

    check-cast v0, Lz/t;

    invoke-static {v0}, Lz/t;->a(Lz/t;)V

    return-void

    :pswitch_0
    iget-object v0, v1, LR/a;->e:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lo1/q;

    const-string v0, "fetchFonts result is not OK. ("

    iget-object v5, v4, Lo1/q;->d:Ljava/lang/Object;

    monitor-enter v5

    :try_start_0
    iget-object v6, v4, Lo1/q;->h:LZ0/d;

    if-nez v6, :cond_0

    monitor-exit v5

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_0
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v4}, Lo1/q;->b()La1/h;

    move-result-object v5

    iget v6, v5, La1/h;->e:I

    if-ne v6, v2, :cond_1

    iget-object v2, v4, Lo1/q;->d:Ljava/lang/Object;

    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    monitor-exit v2

    goto :goto_0

    :catchall_1
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v0

    goto/16 :goto_3

    :cond_1
    :goto_0
    if-nez v6, :cond_4

    :try_start_4
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    sget v2, LZ0/e;->a:I

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    iget-object v0, v4, Lo1/q;->c:LX1/e;

    iget-object v2, v4, Lo1/q;->a:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    filled-new-array {v5}, [La1/h;

    move-result-object v0

    sget-object v6, LV0/g;->a:La/a;

    invoke-virtual {v6, v2, v0, v3}, La/a;->s(Landroid/content/Context;[La1/h;I)Landroid/graphics/Typeface;

    move-result-object v0

    iget-object v2, v4, Lo1/q;->a:Landroid/content/Context;

    iget-object v3, v5, La1/h;->a:Landroid/net/Uri;

    invoke-static {v2, v3}, Lr2/a;->O(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    if-eqz v2, :cond_3

    if-eqz v0, :cond_3

    :try_start_5
    const-string v3, "EmojiCompat.MetadataRepo.create"

    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    new-instance v3, LD1/w;

    invoke-static {v2}, LZ0/d;->L(Ljava/nio/MappedByteBuffer;)Lp1/b;

    move-result-object v2

    invoke-direct {v3, v0, v2}, LD1/w;-><init>(Landroid/graphics/Typeface;Lp1/b;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    iget-object v2, v4, Lo1/q;->d:Ljava/lang/Object;

    monitor-enter v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    iget-object v0, v4, Lo1/q;->h:LZ0/d;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v3}, LZ0/d;->J(LD1/w;)V

    goto :goto_1

    :catchall_3
    move-exception v0

    goto :goto_2

    :cond_2
    :goto_1
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :try_start_9
    invoke-virtual {v4}, Lo1/q;->a()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto :goto_5

    :goto_2
    :try_start_a
    monitor-exit v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :try_start_b
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :catchall_4
    move-exception v0

    :try_start_c
    sget v2, LZ0/e;->a:I

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "Unable to open file."

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    :catchall_5
    move-exception v0

    :try_start_d
    sget v2, LZ0/e;->a:I

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_4
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    :goto_3
    iget-object v2, v4, Lo1/q;->d:Ljava/lang/Object;

    monitor-enter v2

    :try_start_e
    iget-object v3, v4, Lo1/q;->h:LZ0/d;

    if-eqz v3, :cond_5

    invoke-virtual {v3, v0}, LZ0/d;->I(Ljava/lang/Throwable;)V

    goto :goto_4

    :catchall_6
    move-exception v0

    goto :goto_6

    :cond_5
    :goto_4
    monitor-exit v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    invoke-virtual {v4}, Lo1/q;->a()V

    :goto_5
    return-void

    :goto_6
    :try_start_f
    monitor-exit v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    throw v0

    :goto_7
    :try_start_10
    monitor-exit v5
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    throw v0

    :pswitch_1
    iget-object v0, v1, LR/a;->e:Ljava/lang/Object;

    check-cast v0, Lo0/E;

    const-string v2, "measureAndLayout"

    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_11
    iget-object v2, v0, Lo0/E;->d:Lo0/u;

    invoke-virtual {v2, v4}, Lo0/u;->s(Z)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    invoke-static {}, Landroid/os/Trace;->endSection()V

    const-string v2, "checkForSemanticsChanges"

    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_12
    invoke-virtual {v0}, Lo0/E;->o()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    invoke-static {}, Landroid/os/Trace;->endSection()V

    iput-boolean v3, v0, Lo0/E;->H:Z

    return-void

    :catchall_7
    move-exception v0

    move-object v2, v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v2

    :catchall_8
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :pswitch_2
    iget-object v0, v1, LR/a;->e:Ljava/lang/Object;

    check-cast v0, Lo2/a;

    invoke-interface {v0}, Lo2/a;->c()Ljava/lang/Object;

    return-void

    :pswitch_3
    iget-object v0, v1, LR/a;->e:Ljava/lang/Object;

    check-cast v0, Lo0/u;

    iput-boolean v3, v0, Lo0/u;->u0:Z

    iget-object v2, v0, Lo0/u;->o0:Landroid/view/MotionEvent;

    invoke-static {v2}, Lp2/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    const/16 v4, 0xa

    if-ne v3, v4, :cond_6

    invoke-virtual {v0, v2}, Lo0/u;->E(Landroid/view/MotionEvent;)I

    return-void

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "The ACTION_HOVER_EXIT event was not cleared."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_4
    iget-object v0, v1, LR/a;->e:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/timepicker/e;

    invoke-virtual {v0}, Lcom/google/android/material/timepicker/e;->f()V

    return-void

    :pswitch_5
    iget-object v2, v1, LR/a;->e:Ljava/lang/Object;

    check-cast v2, Lb/j;

    iget-object v3, v2, Lb/j;->e:Ljava/lang/Runnable;

    if-eqz v3, :cond_7

    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    iput-object v0, v2, Lb/j;->e:Ljava/lang/Runnable;

    :cond_7
    return-void

    :pswitch_6
    iget-object v0, v1, LR/a;->e:Ljava/lang/Object;

    check-cast v0, Lcom/ai/assistance/operit/provider/MainComposeActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    return-void

    :pswitch_7
    iget-object v0, v1, LR/a;->e:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/A;

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, v0, Landroidx/lifecycle/A;->e:I

    iget-object v3, v0, Landroidx/lifecycle/A;->i:Landroidx/lifecycle/t;

    if-nez v2, :cond_8

    iput-boolean v4, v0, Landroidx/lifecycle/A;->f:Z

    sget-object v2, Landroidx/lifecycle/l;->ON_PAUSE:Landroidx/lifecycle/l;

    invoke-virtual {v3, v2}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    :cond_8
    iget v2, v0, Landroidx/lifecycle/A;->d:I

    if-nez v2, :cond_9

    iget-boolean v2, v0, Landroidx/lifecycle/A;->f:Z

    if-eqz v2, :cond_9

    sget-object v2, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    invoke-virtual {v3, v2}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    iput-boolean v4, v0, Landroidx/lifecycle/A;->g:Z

    :cond_9
    return-void

    :pswitch_8
    iget-object v0, v1, LR/a;->e:Ljava/lang/Object;

    check-cast v0, La2/k;

    iget-object v2, v0, La2/k;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v2}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    move-result v2

    invoke-virtual {v0, v2}, La2/k;->t(Z)V

    iput-boolean v2, v0, La2/k;->m:Z

    return-void

    :pswitch_9
    iget-object v0, v1, LR/a;->e:Ljava/lang/Object;

    check-cast v0, La2/e;

    invoke-virtual {v0, v4}, La2/e;->t(Z)V

    return-void

    :pswitch_a
    iget-object v0, v1, LR/a;->e:Ljava/lang/Object;

    check-cast v0, LM1/i;

    iput-boolean v3, v0, LM1/i;->c:Z

    iget-object v3, v0, LM1/i;->e:Ljava/lang/Object;

    check-cast v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget-object v4, v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:Ln1/e;

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Ln1/e;->f()Z

    move-result v4

    if-eqz v4, :cond_a

    iget v2, v0, LM1/i;->b:I

    invoke-virtual {v0, v2}, LM1/i;->a(I)V

    goto :goto_8

    :cond_a
    iget v4, v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    if-ne v4, v2, :cond_b

    iget v0, v0, LM1/i;->b:I

    invoke-virtual {v3, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    :cond_b
    :goto_8
    return-void

    :pswitch_b
    iget-object v0, v1, LR/a;->e:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-class v3, Landroid/view/inputmethod/InputMethodManager;

    invoke-static {v2, v3}, LT0/b;->b(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v2, v0, v4}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    return-void

    :pswitch_c
    iget-object v5, v1, LR/a;->e:Ljava/lang/Object;

    check-cast v5, LR/e;

    invoke-virtual {v5}, LR/e;->h()Z

    move-result v6

    if-nez v6, :cond_c

    goto/16 :goto_19

    :cond_c
    iget-object v6, v5, LR/e;->d:Lo0/u;

    invoke-virtual {v6, v4}, Lo0/u;->s(Z)V

    invoke-virtual {v6}, Lo0/u;->getSemanticsOwner()Lt0/l;

    move-result-object v7

    invoke-virtual {v7}, Lt0/l;->a()Lt0/k;

    move-result-object v7

    iget-object v8, v5, LR/e;->r:Lo0/A0;

    invoke-virtual {v5, v7, v8}, LR/e;->l(Lt0/k;Lo0/A0;)V

    invoke-virtual {v6}, Lo0/u;->getSemanticsOwner()Lt0/l;

    move-result-object v7

    invoke-virtual {v7}, Lt0/l;->a()Lt0/k;

    move-result-object v7

    iget-object v8, v5, LR/e;->r:Lo0/A0;

    invoke-virtual {v5, v7, v8}, LR/e;->j(Lt0/k;Lo0/A0;)V

    invoke-virtual {v5}, LR/e;->g()Ln/r;

    move-result-object v7

    iget-object v8, v7, Ln/r;->b:[I

    iget-object v9, v7, Ln/r;->a:[J

    array-length v10, v9

    sub-int/2addr v10, v2

    iget-object v11, v5, LR/e;->q:Ln/r;

    const-wide/16 v12, 0x80

    const-wide/16 v14, 0xff

    const/16 v3, 0x8

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v18, 0x7

    if-ltz v10, :cond_1d

    const/4 v2, 0x0

    :goto_9
    aget-wide v0, v9, v2

    move-object/from16 v21, v5

    not-long v4, v0

    shl-long v4, v4, v18

    and-long/2addr v4, v0

    and-long v4, v4, v16

    cmp-long v4, v4, v16

    if-eqz v4, :cond_1c

    sub-int v4, v2, v10

    not-int v4, v4

    ushr-int/lit8 v4, v4, 0x1f

    rsub-int/lit8 v4, v4, 0x8

    const/4 v5, 0x0

    :goto_a
    if-ge v5, v4, :cond_1b

    and-long v22, v0, v14

    cmp-long v22, v22, v12

    if-gez v22, :cond_1a

    shl-int/lit8 v22, v2, 0x3

    add-int v22, v22, v5

    aget v12, v8, v22

    invoke-virtual {v11, v12}, Ln/r;->f(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lo0/A0;

    invoke-virtual {v7, v12}, Ln/r;->f(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lo0/B0;

    if-eqz v12, :cond_d

    iget-object v12, v12, Lo0/B0;->a:Lt0/k;

    goto :goto_b

    :cond_d
    const/4 v12, 0x0

    :goto_b
    if-eqz v12, :cond_19

    iget-object v14, v12, Lt0/k;->d:Lt0/g;

    iget v12, v12, Lt0/k;->g:I

    iget-object v15, v14, Lt0/g;->d:Ljava/util/LinkedHashMap;

    if-nez v13, :cond_12

    invoke-virtual {v14}, Lt0/g;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_c
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_11

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/Map$Entry;

    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    sget-object v3, Lt0/n;->s:Lt0/q;

    invoke-static {v14, v3}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_10

    invoke-virtual {v15, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_e

    const/4 v3, 0x0

    :cond_e
    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_f

    invoke-static {v3}, Ld2/k;->b0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv0/c;

    goto :goto_d

    :cond_f
    const/4 v3, 0x0

    :goto_d
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v14, v21

    invoke-virtual {v14, v3, v12}, LR/e;->k(Ljava/lang/String;I)V

    :cond_10
    const/16 v3, 0x8

    goto :goto_c

    :cond_11
    move-object/from16 v24, v7

    move-object/from16 v3, v21

    :goto_e
    move-object/from16 v21, v8

    goto :goto_12

    :cond_12
    move-object/from16 v3, v21

    invoke-virtual {v14}, Lt0/g;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_f
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_18

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    check-cast v21, Ljava/util/Map$Entry;

    invoke-interface/range {v21 .. v21}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v24, v7

    move-object/from16 v7, v21

    check-cast v7, Lt0/q;

    move-object/from16 v21, v8

    sget-object v8, Lt0/n;->s:Lt0/q;

    invoke-static {v7, v8}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_17

    iget-object v7, v13, Lo0/A0;->a:Lt0/g;

    iget-object v7, v7, Lt0/g;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v7, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_13

    const/4 v7, 0x0

    :cond_13
    check-cast v7, Ljava/util/List;

    if-eqz v7, :cond_14

    invoke-static {v7}, Ld2/k;->b0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lv0/c;

    goto :goto_10

    :cond_14
    const/4 v7, 0x0

    :goto_10
    invoke-virtual {v15, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_15

    const/4 v8, 0x0

    :cond_15
    check-cast v8, Ljava/util/List;

    if-eqz v8, :cond_16

    invoke-static {v8}, Ld2/k;->b0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lv0/c;

    goto :goto_11

    :cond_16
    const/4 v8, 0x0

    :goto_11
    invoke-static {v7, v8}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_17

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7, v12}, LR/e;->k(Ljava/lang/String;I)V

    :cond_17
    move-object/from16 v8, v21

    move-object/from16 v7, v24

    goto :goto_f

    :cond_18
    move-object/from16 v24, v7

    goto :goto_e

    :goto_12
    const/4 v7, 0x0

    :goto_13
    const/16 v8, 0x8

    goto :goto_14

    :cond_19
    const-string v0, "no value for specified key"

    invoke-static {v0}, LZ0/d;->T(Ljava/lang/String;)V

    const/4 v7, 0x0

    throw v7

    :cond_1a
    move-object/from16 v24, v7

    move-object/from16 v3, v21

    const/4 v7, 0x0

    move-object/from16 v21, v8

    goto :goto_13

    :goto_14
    shr-long/2addr v0, v8

    const/4 v12, 0x1

    add-int/2addr v5, v12

    move-object/from16 v7, v24

    const-wide/16 v12, 0x80

    const-wide/16 v14, 0xff

    move-object/from16 v25, v21

    move-object/from16 v21, v3

    move v3, v8

    move-object/from16 v8, v25

    goto/16 :goto_a

    :cond_1b
    move-object/from16 v24, v7

    const/4 v7, 0x0

    const/4 v12, 0x1

    move-object/from16 v25, v8

    move v8, v3

    move-object/from16 v3, v21

    move-object/from16 v21, v25

    if-ne v4, v8, :cond_1e

    goto :goto_15

    :cond_1c
    move-object/from16 v24, v7

    move-object/from16 v3, v21

    const/4 v7, 0x0

    const/4 v12, 0x1

    move-object/from16 v21, v8

    :goto_15
    if-eq v2, v10, :cond_1e

    add-int/2addr v2, v12

    move-object v5, v3

    move v4, v12

    move-object/from16 v8, v21

    move-object/from16 v7, v24

    const/16 v3, 0x8

    const-wide/16 v12, 0x80

    const-wide/16 v14, 0xff

    goto/16 :goto_9

    :cond_1d
    move-object v3, v5

    :cond_1e
    invoke-virtual {v11}, Ln/r;->a()V

    invoke-virtual {v3}, LR/e;->g()Ln/r;

    move-result-object v0

    iget-object v1, v0, Ln/r;->b:[I

    iget-object v2, v0, Ln/r;->c:[Ljava/lang/Object;

    iget-object v0, v0, Ln/r;->a:[J

    array-length v4, v0

    const/4 v5, 0x2

    sub-int/2addr v4, v5

    if-ltz v4, :cond_22

    const/4 v5, 0x0

    :goto_16
    aget-wide v7, v0, v5

    not-long v9, v7

    shl-long v9, v9, v18

    and-long/2addr v9, v7

    and-long v9, v9, v16

    cmp-long v9, v9, v16

    if-eqz v9, :cond_21

    sub-int v9, v5, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    const/4 v10, 0x0

    :goto_17
    if-ge v10, v9, :cond_20

    const-wide/16 v12, 0xff

    and-long v14, v7, v12

    const-wide/16 v19, 0x80

    cmp-long v14, v14, v19

    if-gez v14, :cond_1f

    shl-int/lit8 v14, v5, 0x3

    add-int/2addr v14, v10

    aget v15, v1, v14

    aget-object v14, v2, v14

    check-cast v14, Lo0/B0;

    new-instance v12, Lo0/A0;

    iget-object v13, v14, Lo0/B0;->a:Lt0/k;

    invoke-virtual {v3}, LR/e;->g()Ln/r;

    move-result-object v14

    invoke-direct {v12, v13, v14}, Lo0/A0;-><init>(Lt0/k;Ln/r;)V

    invoke-virtual {v11, v15, v12}, Ln/r;->i(ILjava/lang/Object;)V

    :cond_1f
    const/16 v12, 0x8

    shr-long/2addr v7, v12

    const/4 v13, 0x1

    add-int/2addr v10, v13

    goto :goto_17

    :cond_20
    const/16 v12, 0x8

    const/4 v13, 0x1

    const-wide/16 v19, 0x80

    if-ne v9, v12, :cond_22

    goto :goto_18

    :cond_21
    const/16 v12, 0x8

    const/4 v13, 0x1

    const-wide/16 v19, 0x80

    :goto_18
    if-eq v5, v4, :cond_22

    add-int/2addr v5, v13

    goto :goto_16

    :cond_22
    new-instance v0, Lo0/A0;

    invoke-virtual {v6}, Lo0/u;->getSemanticsOwner()Lt0/l;

    move-result-object v1

    invoke-virtual {v1}, Lt0/l;->a()Lt0/k;

    move-result-object v1

    invoke-virtual {v3}, LR/e;->g()Ln/r;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo0/A0;-><init>(Lt0/k;Ln/r;)V

    iput-object v0, v3, LR/e;->r:Lo0/A0;

    const/4 v0, 0x0

    iput-boolean v0, v3, LR/e;->s:Z

    :goto_19
    return-void

    :pswitch_data_0
    .packed-switch 0x0
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
