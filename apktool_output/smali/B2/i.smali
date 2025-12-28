.class public final LB2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB2/e;
.implements LM/f;
.implements Ld1/o;
.implements Lo1/o;


# instance fields
.field public final synthetic d:I

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, LB2/i;->d:I

    packed-switch p1, :pswitch_data_0

    .line 3
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    sget-object p1, Ln0/j;->f:Ln0/j;

    invoke-static {p1}, LZ/b;->B(Lo2/a;)Lc2/d;

    move-result-object p1

    iput-object p1, p0, LB2/i;->e:Ljava/lang/Object;

    .line 5
    new-instance p1, Ln0/c0;

    const/4 v0, 0x1

    .line 6
    invoke-direct {p1, v0}, Ln0/c0;-><init>(I)V

    .line 7
    new-instance v0, Ln0/p0;

    .line 8
    invoke-direct {v0, p1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 9
    iput-object v0, p0, LB2/i;->f:Ljava/lang/Object;

    return-void

    .line 10
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance p1, Ln/F;

    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, v0}, Ln/F;-><init>(I)V

    .line 13
    iput-object p1, p0, LB2/i;->e:Ljava/lang/Object;

    .line 14
    new-instance p1, Ln/m;

    const/4 v0, 0x0

    .line 15
    invoke-direct {p1, v0}, Ln/m;-><init>(Ljava/lang/Object;)V

    .line 16
    iput-object p1, p0, LB2/i;->f:Ljava/lang/Object;

    return-void

    .line 17
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance p1, LX1/e;

    const/4 v0, 0x1

    .line 19
    invoke-direct {p1, v0}, LX1/e;-><init>(I)V

    .line 20
    iput-object p1, p0, LB2/i;->e:Ljava/lang/Object;

    .line 21
    new-instance p1, Lo1/p;

    invoke-direct {p1}, Lo1/p;-><init>()V

    iput-object p1, p0, LB2/i;->f:Ljava/lang/Object;

    return-void

    .line 22
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LB2/i;->e:Ljava/lang/Object;

    .line 24
    new-instance p1, Ls1/c;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Ls1/c;-><init>(I)V

    .line 25
    new-instance p1, Ls1/f;

    invoke-direct {p1, p0}, Ls1/f;-><init>(LB2/i;)V

    .line 26
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, LB2/i;->f:Ljava/lang/Object;

    .line 27
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 28
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 29
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 30
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 31
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 32
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 33
    new-instance p1, Ls1/c;

    invoke-direct {p1, p0}, Ls1/c;-><init>(LB2/i;)V

    .line 34
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 35
    new-instance p1, Ls1/g;

    .line 36
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 37
    new-instance p1, LM1/h;

    const/16 v0, 0x8

    invoke-direct {p1, v0, p0}, LM1/h;-><init>(ILjava/lang/Object;)V

    return-void

    .line 38
    :pswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance p1, LF/d;

    const/16 v0, 0x10

    new-array v0, v0, [Ljava/lang/ref/Reference;

    invoke-direct {p1, v0}, LF/d;-><init>([Ljava/lang/Object;)V

    .line 40
    iput-object p1, p0, LB2/i;->e:Ljava/lang/Object;

    .line 41
    new-instance p1, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object p1, p0, LB2/i;->f:Ljava/lang/Object;

    return-void

    .line 42
    :pswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance p1, LF/d;

    const/16 v0, 0x10

    new-array v0, v0, [Ln0/z;

    invoke-direct {p1, v0}, LF/d;-><init>([Ljava/lang/Object;)V

    .line 44
    iput-object p1, p0, LB2/i;->e:Ljava/lang/Object;

    return-void

    .line 45
    :pswitch_6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance p1, LB2/i;

    const/16 v0, 0xb

    invoke-direct {p1, v0}, LB2/i;-><init>(I)V

    iput-object p1, p0, LB2/i;->e:Ljava/lang/Object;

    .line 47
    new-instance p1, LB2/i;

    invoke-direct {p1, v0}, LB2/i;-><init>(I)V

    iput-object p1, p0, LB2/i;->f:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, LB2/i;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;I)V
    .locals 4

    const/4 v0, 0x0

    iput p2, p0, LB2/i;->d:I

    packed-switch p2, :pswitch_data_0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, LB2/i;->e:Ljava/lang/Object;

    .line 50
    new-instance p2, Lk/H;

    invoke-direct {p2, p1}, Lk/H;-><init>(Landroid/widget/EditText;)V

    iput-object p2, p0, LB2/i;->f:Ljava/lang/Object;

    return-void

    .line 51
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, LB2/i;->e:Ljava/lang/Object;

    .line 53
    new-instance p2, Lq1/h;

    invoke-direct {p2, p1}, Lq1/h;-><init>(Landroid/widget/EditText;)V

    iput-object p2, p0, LB2/i;->f:Ljava/lang/Object;

    .line 54
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 55
    sget-object p2, Lq1/a;->b:Lq1/a;

    if-nez p2, :cond_1

    .line 56
    sget-object p2, Lq1/a;->a:Ljava/lang/Object;

    monitor-enter p2

    .line 57
    :try_start_0
    sget-object v1, Lq1/a;->b:Lq1/a;

    if-nez v1, :cond_0

    .line 58
    new-instance v1, Lq1/a;

    .line 59
    invoke-direct {v1}, Landroid/text/Editable$Factory;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 60
    :try_start_1
    const-string v2, "android.text.DynamicLayout$ChangeWatcher"

    .line 61
    const-class v3, Lq1/a;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-static {v2, v0, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lq1/a;->c:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    :catchall_0
    :try_start_2
    sput-object v1, Lq1/a;->b:Lq1/a;

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    .line 63
    :cond_0
    :goto_0
    monitor-exit p2

    goto :goto_2

    :goto_1
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    .line 64
    :cond_1
    :goto_2
    sget-object p2, Lq1/a;->b:Lq1/a;

    .line 65
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setEditableFactory(Landroid/text/Editable$Factory;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p2, p0, LB2/i;->d:I

    iput-object p1, p0, LB2/i;->e:Ljava/lang/Object;

    iput-object p3, p0, LB2/i;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lo2/c;Lo2/c;)V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, LB2/i;->d:I

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    check-cast p1, Lp2/h;

    iput-object p1, p0, LB2/i;->e:Ljava/lang/Object;

    .line 68
    check-cast p2, Lp2/h;

    iput-object p2, p0, LB2/i;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lz1/v;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, LB2/i;->d:I

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, LB2/i;->e:Ljava/lang/Object;

    .line 71
    new-instance p1, Lz1/P;

    .line 72
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 73
    iput v0, p1, Lz1/P;->a:I

    .line 74
    iput-object p1, p0, LB2/i;->f:Ljava/lang/Object;

    return-void
.end method

.method public static h(Ln0/z;)V
    .locals 10

    iget-object v0, p0, Ln0/z;->y:Ln0/I;

    iget v1, v0, Ln0/I;->b:I

    const/4 v2, 0x1

    const/4 v3, 0x5

    const/4 v4, 0x0

    if-ne v1, v3, :cond_a

    iget-boolean v1, v0, Ln0/I;->d:Z

    if-nez v1, :cond_a

    iget-boolean v0, v0, Ln0/I;->c:Z

    if-nez v0, :cond_a

    iget-boolean v0, p0, Ln0/z;->E:Z

    if-eqz v0, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-virtual {p0}, Ln0/z;->v()Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_5

    :cond_1
    iget-object v0, p0, Ln0/z;->x:LD/s;

    iget-object v0, v0, LD/s;->f:Ljava/lang/Object;

    check-cast v0, LP/k;

    iget v1, v0, LP/k;->g:I

    const/16 v3, 0x100

    and-int/2addr v1, v3

    if-eqz v1, :cond_a

    :goto_0
    if-eqz v0, :cond_a

    iget v1, v0, LP/k;->f:I

    and-int/2addr v1, v3

    if-eqz v1, :cond_9

    const/4 v1, 0x0

    move-object v5, v0

    move-object v6, v1

    :goto_1
    if-eqz v5, :cond_9

    instance-of v7, v5, Ln0/l;

    if-eqz v7, :cond_2

    check-cast v5, Ln0/l;

    invoke-static {v5, v3}, Ln0/C;->p(Ln0/h;I)Ln0/Y;

    move-result-object v7

    invoke-interface {v5, v7}, Ln0/l;->p(Ln0/Y;)V

    goto :goto_4

    :cond_2
    iget v7, v5, LP/k;->f:I

    and-int/2addr v7, v3

    if-eqz v7, :cond_8

    instance-of v7, v5, Ln0/i;

    if-eqz v7, :cond_8

    move-object v7, v5

    check-cast v7, Ln0/i;

    iget-object v7, v7, Ln0/i;->r:LP/k;

    move v8, v4

    :goto_2
    if-eqz v7, :cond_7

    iget v9, v7, LP/k;->f:I

    and-int/2addr v9, v3

    if-eqz v9, :cond_6

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v2, :cond_3

    move-object v5, v7

    goto :goto_3

    :cond_3
    if-nez v6, :cond_4

    new-instance v6, LF/d;

    const/16 v9, 0x10

    new-array v9, v9, [LP/k;

    invoke-direct {v6, v9}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_4
    if-eqz v5, :cond_5

    invoke-virtual {v6, v5}, LF/d;->b(Ljava/lang/Object;)V

    move-object v5, v1

    :cond_5
    invoke-virtual {v6, v7}, LF/d;->b(Ljava/lang/Object;)V

    :cond_6
    :goto_3
    iget-object v7, v7, LP/k;->i:LP/k;

    goto :goto_2

    :cond_7
    if-ne v8, v2, :cond_8

    goto :goto_1

    :cond_8
    :goto_4
    invoke-static {v6}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v5

    goto :goto_1

    :cond_9
    iget v1, v0, LP/k;->g:I

    and-int/2addr v1, v3

    if-eqz v1, :cond_a

    iget-object v0, v0, LP/k;->i:LP/k;

    goto :goto_0

    :cond_a
    :goto_5
    iput-boolean v4, p0, Ln0/z;->D:Z

    invoke-virtual {p0}, Ln0/z;->n()LF/d;

    move-result-object p0

    iget v0, p0, LF/d;->f:I

    if-lez v0, :cond_c

    iget-object p0, p0, LF/d;->d:[Ljava/lang/Object;

    :cond_b
    aget-object v1, p0, v4

    check-cast v1, Ln0/z;

    invoke-static {v1}, LB2/i;->h(Ln0/z;)V

    add-int/2addr v4, v2

    if-lt v4, v0, :cond_b

    :cond_c
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LB2/i;->e:Ljava/lang/Object;

    check-cast v0, Lo1/y;

    return-object v0
.end method

.method public b(Landroid/view/View;Ld1/l0;)Ld1/l0;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, LB2/i;->f:Ljava/lang/Object;

    check-cast v3, LS1/m;

    iget v4, v3, LS1/m;->a:I

    iget-object v5, v0, LB2/i;->e:Ljava/lang/Object;

    check-cast v5, LM1/d;

    iget-object v6, v2, Ld1/l0;->a:Ld1/j0;

    const/4 v7, 0x7

    invoke-virtual {v6, v7}, Ld1/j0;->f(I)LV0/c;

    move-result-object v7

    const/16 v8, 0x20

    invoke-virtual {v6, v8}, Ld1/j0;->f(I)LV0/c;

    move-result-object v8

    iget v9, v7, LV0/c;->b:I

    iget-object v10, v5, LM1/d;->b:Ljava/lang/Object;

    check-cast v10, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iput v9, v10, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w:I

    invoke-static/range {p1 .. p1}, LS1/k;->e(Landroid/view/View;)Z

    move-result v9

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v12

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getPaddingRight()I

    move-result v13

    iget-boolean v14, v10, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:Z

    if-eqz v14, :cond_0

    invoke-virtual {v6}, Ld1/j0;->j()LV0/c;

    move-result-object v6

    iget v6, v6, LV0/c;->d:I

    iput v6, v10, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:I

    iget v11, v3, LS1/m;->c:I

    add-int/2addr v11, v6

    :cond_0
    iget v3, v3, LS1/m;->b:I

    iget-boolean v6, v10, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p:Z

    iget v15, v7, LV0/c;->a:I

    if-eqz v6, :cond_2

    if-eqz v9, :cond_1

    move v6, v3

    goto :goto_0

    :cond_1
    move v6, v4

    :goto_0
    add-int v12, v6, v15

    :cond_2
    iget-boolean v6, v10, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:Z

    iget v0, v7, LV0/c;->c:I

    if-eqz v6, :cond_4

    if-eqz v9, :cond_3

    goto :goto_1

    :cond_3
    move v4, v3

    :goto_1
    add-int v13, v4, v0

    :cond_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-boolean v4, v10, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->s:Z

    const/4 v6, 0x1

    if-eqz v4, :cond_5

    iget v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-eq v4, v15, :cond_5

    iput v15, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move v4, v6

    goto :goto_2

    :cond_5
    const/4 v4, 0x0

    :goto_2
    iget-boolean v9, v10, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->t:Z

    if-eqz v9, :cond_6

    iget v9, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v9, v0, :cond_6

    iput v0, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move v4, v6

    :cond_6
    iget-boolean v0, v10, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u:Z

    if-eqz v0, :cond_7

    iget v0, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v7, v7, LV0/c;->b:I

    if-eq v0, v7, :cond_7

    iput v7, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    goto :goto_3

    :cond_7
    move v6, v4

    :goto_3
    if-eqz v6, :cond_8

    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_8
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {v1, v12, v0, v13, v11}, Landroid/view/View;->setPadding(IIII)V

    iget-boolean v0, v5, LM1/d;->a:Z

    if-eqz v0, :cond_9

    iget v1, v8, LV0/c;->d:I

    iput v1, v10, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->m:I

    :cond_9
    if-nez v14, :cond_a

    if-eqz v0, :cond_b

    :cond_a
    invoke-virtual {v10}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I()V

    :cond_b
    return-object v2
.end method

.method public c(LM/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LB2/i;->e:Ljava/lang/Object;

    check-cast v0, Lo2/e;

    invoke-interface {v0, p1, p2}, Lo2/e;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/CharSequence;IILo1/v;)Z
    .locals 3

    iget v0, p4, Lo1/v;->c:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x1

    if-lez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LB2/i;->e:Ljava/lang/Object;

    check-cast v0, Lo1/y;

    if-nez v0, :cond_2

    new-instance v0, Lo1/y;

    instance-of v2, p1, Landroid/text/Spannable;

    if-eqz v2, :cond_1

    check-cast p1, Landroid/text/Spannable;

    goto :goto_0

    :cond_1
    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object p1, v2

    :goto_0
    invoke-direct {v0, p1}, Lo1/y;-><init>(Landroid/text/Spannable;)V

    iput-object v0, p0, LB2/i;->e:Ljava/lang/Object;

    :cond_2
    iget-object p1, p0, LB2/i;->f:Ljava/lang/Object;

    check-cast p1, LX1/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lo1/w;

    invoke-direct {p1, p4}, Lo1/w;-><init>(Lo1/v;)V

    iget-object p4, p0, LB2/i;->e:Ljava/lang/Object;

    check-cast p4, Lo1/y;

    const/16 v0, 0x21

    invoke-virtual {p4, p1, p2, p3, v0}, Lo1/y;->setSpan(Ljava/lang/Object;III)V

    return v1
.end method

.method public e(J)Z
    .locals 7

    iget-object v0, p0, LB2/i;->f:Ljava/lang/Object;

    check-cast v0, LB2/i;

    iget-object v0, v0, LB2/i;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lh0/m;

    iget-wide v5, v5, Lh0/m;->a:J

    invoke-static {v5, v6, p1, p2}, LZ0/d;->s(JJ)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    check-cast v4, Lh0/m;

    if-eqz v4, :cond_2

    iget-boolean v2, v4, Lh0/m;->h:Z

    :cond_2
    return v2
.end method

.method public f(Ln0/z;)V
    .locals 1

    invoke-virtual {p1}, Ln0/z;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LB2/i;->f:Ljava/lang/Object;

    check-cast v0, Ln0/p0;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    const-string p1, "DepthSortedSet.add called on an unattached node"

    invoke-static {p1}, LZ0/d;->S(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public g(Ln0/z;Z)V
    .locals 2

    iget-object v0, p0, LB2/i;->f:Ljava/lang/Object;

    check-cast v0, LB2/i;

    iget-object v1, p0, LB2/i;->e:Ljava/lang/Object;

    check-cast v1, LB2/i;

    if-eqz p2, :cond_0

    invoke-virtual {v1, p1}, LB2/i;->f(Ln0/z;)V

    invoke-virtual {v0, p1}, LB2/i;->f(Ln0/z;)V

    goto :goto_0

    :cond_0
    iget-object p2, v1, LB2/i;->f:Ljava/lang/Object;

    check-cast p2, Ln0/p0;

    invoke-virtual {p2, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {v0, p1}, LB2/i;->f(Ln0/z;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public i()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "FragmentManager has not been attached to a host."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j(IIII)Landroid/view/View;
    .locals 10

    iget-object v0, p0, LB2/i;->e:Ljava/lang/Object;

    check-cast v0, Lz1/v;

    iget v1, v0, Lz1/v;->a:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lz1/v;->b:Lz1/w;

    invoke-virtual {v1}, Lz1/w;->w()I

    move-result v1

    goto :goto_0

    :pswitch_0
    iget-object v1, v0, Lz1/v;->b:Lz1/w;

    invoke-virtual {v1}, Lz1/w;->u()I

    move-result v1

    :goto_0
    iget v2, v0, Lz1/v;->a:I

    packed-switch v2, :pswitch_data_1

    iget-object v2, v0, Lz1/v;->b:Lz1/w;

    iget v3, v2, Lz1/w;->g:I

    invoke-virtual {v2}, Lz1/w;->t()I

    move-result v2

    :goto_1
    sub-int/2addr v3, v2

    goto :goto_2

    :pswitch_1
    iget-object v2, v0, Lz1/v;->b:Lz1/w;

    iget v3, v2, Lz1/w;->f:I

    invoke-virtual {v2}, Lz1/w;->v()I

    move-result v2

    goto :goto_1

    :goto_2
    if-le p2, p1, :cond_0

    const/4 v2, 0x1

    goto :goto_3

    :cond_0
    const/4 v2, -0x1

    :goto_3
    const/4 v4, 0x0

    :goto_4
    if-eq p1, p2, :cond_3

    iget v5, v0, Lz1/v;->a:I

    packed-switch v5, :pswitch_data_2

    iget-object v5, v0, Lz1/v;->b:Lz1/w;

    invoke-virtual {v5, p1}, Lz1/w;->o(I)Landroid/view/View;

    move-result-object v5

    goto :goto_5

    :pswitch_2
    iget-object v5, v0, Lz1/v;->b:Lz1/w;

    invoke-virtual {v5, p1}, Lz1/w;->o(I)Landroid/view/View;

    move-result-object v5

    :goto_5
    iget v6, v0, Lz1/v;->a:I

    packed-switch v6, :pswitch_data_3

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Lz1/x;

    iget-object v7, v0, Lz1/v;->b:Lz1/w;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v7

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Lz1/x;

    iget-object v8, v8, Lz1/x;->a:Landroid/graphics/Rect;

    iget v8, v8, Landroid/graphics/Rect;->top:I

    sub-int/2addr v7, v8

    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    :goto_6
    sub-int/2addr v7, v6

    goto :goto_7

    :pswitch_3
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Lz1/x;

    iget-object v7, v0, Lz1/v;->b:Lz1/w;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v7

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Lz1/x;

    iget-object v8, v8, Lz1/x;->a:Landroid/graphics/Rect;

    iget v8, v8, Landroid/graphics/Rect;->left:I

    sub-int/2addr v7, v8

    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    goto :goto_6

    :goto_7
    iget v6, v0, Lz1/v;->a:I

    packed-switch v6, :pswitch_data_4

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Lz1/x;

    iget-object v8, v0, Lz1/v;->b:Lz1/w;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v8

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Lz1/x;

    iget-object v9, v9, Lz1/x;->a:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v8, v9

    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    :goto_8
    add-int/2addr v8, v6

    goto :goto_9

    :pswitch_4
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Lz1/x;

    iget-object v8, v0, Lz1/v;->b:Lz1/w;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    move-result v8

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Lz1/x;

    iget-object v9, v9, Lz1/x;->a:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->right:I

    add-int/2addr v8, v9

    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_8

    :goto_9
    iget-object v6, p0, LB2/i;->f:Ljava/lang/Object;

    check-cast v6, Lz1/P;

    iput v1, v6, Lz1/P;->b:I

    iput v3, v6, Lz1/P;->c:I

    iput v7, v6, Lz1/P;->d:I

    iput v8, v6, Lz1/P;->e:I

    if-eqz p3, :cond_1

    iput p3, v6, Lz1/P;->a:I

    invoke-virtual {v6}, Lz1/P;->a()Z

    move-result v7

    if-eqz v7, :cond_1

    return-object v5

    :cond_1
    if-eqz p4, :cond_2

    iput p4, v6, Lz1/P;->a:I

    invoke-virtual {v6}, Lz1/P;->a()Z

    move-result v6

    if-eqz v6, :cond_2

    move-object v4, v5

    :cond_2
    add-int/2addr p1, v2

    goto/16 :goto_4

    :cond_3
    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_3
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_4
    .end packed-switch
.end method

.method public k(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;
    .locals 1

    instance-of v0, p1, Landroid/text/method/NumberKeyListener;

    if-nez v0, :cond_3

    iget-object v0, p0, LB2/i;->f:Ljava/lang/Object;

    check-cast v0, Lk/H;

    iget-object v0, v0, Lk/H;->b:Ljava/lang/Object;

    check-cast v0, LB2/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p1, Lq1/d;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    instance-of v0, p1, Landroid/text/method/NumberKeyListener;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Lq1/d;

    invoke-direct {v0, p1}, Lq1/d;-><init>(Landroid/text/method/KeyListener;)V

    move-object p1, v0

    :cond_3
    :goto_0
    return-object p1
.end method

.method public l()Z
    .locals 2

    iget-object v0, p0, LB2/i;->f:Ljava/lang/Object;

    check-cast v0, LB2/i;

    iget-object v0, v0, LB2/i;->f:Ljava/lang/Object;

    check-cast v0, Ln0/p0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LB2/i;->e:Ljava/lang/Object;

    check-cast v0, LB2/i;

    iget-object v0, v0, LB2/i;->f:Ljava/lang/Object;

    check-cast v0, Ln0/p0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method public n(Landroid/util/AttributeSet;I)V
    .locals 3

    iget-object v0, p0, LB2/i;->e:Ljava/lang/Object;

    check-cast v0, Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lg/a;->g:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/16 p2, 0xe

    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0, v1}, LB2/i;->t(Z)V

    return-void

    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method

.method public o(LB2/f;Lg2/d;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lp2/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, LB2/c;

    iget-object v2, p0, LB2/i;->f:Ljava/lang/Object;

    check-cast v2, LB2/C;

    invoke-direct {v1, v0, p1, v2}, LB2/c;-><init>(Lp2/m;LB2/f;LB2/C;)V

    iget-object p1, p0, LB2/i;->e:Ljava/lang/Object;

    check-cast p1, LC2/n;

    invoke-virtual {p1, v1, p2}, LC2/h;->o(LB2/f;Lg2/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lh2/a;->d:Lh2/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method

.method public p(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Lq1/b;
    .locals 2

    iget-object v0, p0, LB2/i;->f:Ljava/lang/Object;

    check-cast v0, Lk/H;

    if-nez p1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lk/H;->b:Ljava/lang/Object;

    check-cast v0, LB2/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v1, p1, Lq1/b;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lq1/b;

    iget-object v0, v0, LB2/i;->e:Ljava/lang/Object;

    check-cast v0, Landroid/widget/EditText;

    invoke-direct {v1, v0, p1, p2}, Lq1/b;-><init>(Landroid/widget/EditText;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V

    move-object p1, v1

    :goto_0
    check-cast p1, Lq1/b;

    return-object p1
.end method

.method public q(La1/f;)V
    .locals 5

    iget v0, p1, La1/f;->b:I

    iget-object v1, p0, LB2/i;->f:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    iget-object v2, p0, LB2/i;->e:Ljava/lang/Object;

    check-cast v2, LA/t;

    if-nez v0, :cond_0

    new-instance v0, LD2/h;

    iget-object p1, p1, La1/f;->a:Landroid/graphics/Typeface;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v0, v3, v2, p1, v4}, LD2/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    new-instance p1, La1/a;

    invoke-direct {p1, v2, v0}, La1/a;-><init>(LA/t;I)V

    invoke-virtual {v1, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method

.method public r(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 12

    new-instance v0, LO0/l;

    invoke-direct {v0}, LO0/l;-><init>()V

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_10

    invoke-interface {p2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "id"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-interface {p2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "/"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v4, 0x1

    const/4 v6, -0x1

    if-eqz v3, :cond_0

    const/16 v3, 0x2f

    invoke-virtual {v1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    add-int/2addr v3, v4

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v3, v5, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    goto :goto_1

    :cond_0
    move v3, v6

    :goto_1
    if-ne v3, v6, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    if-le v5, v4, :cond_1

    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    goto :goto_2

    :cond_1
    const-string v1, "ConstraintLayoutStates"

    const-string v5, "error in parsing id"

    invoke-static {v1, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    :goto_2
    :try_start_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v1
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v5, 0x0

    move-object v7, v5

    :goto_3
    if-eq v1, v4, :cond_e

    if-eqz v1, :cond_c

    const-string v8, "Constraint"

    const/4 v9, 0x3

    const/4 v10, 0x2

    if-eq v1, v10, :cond_5

    if-eq v1, v9, :cond_3

    goto/16 :goto_6

    :cond_3
    :try_start_1
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v9, "ConstraintSet"

    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    goto/16 :goto_9

    :cond_4
    invoke-virtual {v1, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    iget-object v1, v0, LO0/l;->c:Ljava/util/HashMap;

    iget v8, v7, LO0/g;->a:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v7, v5

    goto/16 :goto_6

    :catch_0
    move-exception p1

    goto/16 :goto_7

    :catch_1
    move-exception p1

    goto/16 :goto_8

    :cond_5
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v11

    sparse-switch v11, :sswitch_data_0

    goto :goto_4

    :sswitch_0
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    move v9, v2

    goto :goto_5

    :sswitch_1
    const-string v8, "CustomAttribute"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v9, 0x7

    goto :goto_5

    :sswitch_2
    const-string v8, "Barrier"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    move v9, v10

    goto :goto_5

    :sswitch_3
    const-string v8, "Guideline"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    move v9, v4

    goto :goto_5

    :sswitch_4
    const-string v8, "Transform"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v9, 0x4

    goto :goto_5

    :sswitch_5
    const-string v8, "PropertySet"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_5

    :sswitch_6
    const-string v8, "Motion"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v9, 0x6

    goto :goto_5

    :sswitch_7
    const-string v8, "Layout"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v1, :cond_6

    const/4 v9, 0x5

    goto :goto_5

    :cond_6
    :goto_4
    move v9, v6

    :goto_5
    const-string v1, "XML parser error must be within a Constraint "

    packed-switch v9, :pswitch_data_0

    goto/16 :goto_6

    :pswitch_0
    if-eqz v7, :cond_7

    :try_start_2
    iget-object v1, v7, LO0/g;->f:Ljava/util/HashMap;

    invoke-static {p1, p2, v1}, LO0/a;->a(Landroid/content/Context;Landroid/content/res/XmlResourceParser;Ljava/util/HashMap;)V

    goto/16 :goto_6

    :cond_7
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    move-result p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    if-eqz v7, :cond_8

    iget-object v1, v7, LO0/g;->c:LO0/i;

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v8

    invoke-virtual {v1, p1, v8}, LO0/i;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto/16 :goto_6

    :cond_8
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    move-result p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2
    if-eqz v7, :cond_9

    iget-object v1, v7, LO0/g;->d:LO0/h;

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v8

    invoke-virtual {v1, p1, v8}, LO0/h;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto/16 :goto_6

    :cond_9
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    move-result p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_3
    if-eqz v7, :cond_a

    iget-object v1, v7, LO0/g;->e:LO0/k;

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v8

    invoke-virtual {v1, p1, v8}, LO0/k;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_6

    :cond_a
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    move-result p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_4
    if-eqz v7, :cond_b

    iget-object v1, v7, LO0/g;->b:LO0/j;

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v8

    invoke-virtual {v1, p1, v8}, LO0/j;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_6

    :cond_b
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    move-result p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_5
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v1

    invoke-static {p1, v1}, LO0/l;->d(Landroid/content/Context;Landroid/util/AttributeSet;)LO0/g;

    move-result-object v7

    iget-object v1, v7, LO0/g;->d:LO0/h;

    iput v4, v1, LO0/h;->c0:I

    goto :goto_6

    :pswitch_6
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v1

    invoke-static {p1, v1}, LO0/l;->d(Landroid/content/Context;Landroid/util/AttributeSet;)LO0/g;

    move-result-object v7

    iget-object v1, v7, LO0/g;->d:LO0/h;

    iput-boolean v4, v1, LO0/h;->a:Z

    goto :goto_6

    :pswitch_7
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v1

    invoke-static {p1, v1}, LO0/l;->d(Landroid/content/Context;Landroid/util/AttributeSet;)LO0/g;

    move-result-object v7

    goto :goto_6

    :cond_c
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    :cond_d
    :goto_6
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1
    :try_end_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_3

    :goto_7
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_9

    :goto_8
    invoke-virtual {p1}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    :cond_e
    :goto_9
    iget-object p1, p0, LB2/i;->f:Ljava/lang/Object;

    check-cast p1, Landroid/util/SparseArray;

    invoke-virtual {p1, v3, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_a

    :cond_f
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_10
    :goto_a
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x78c018b6 -> :sswitch_7
        -0x7648542a -> :sswitch_6
        -0x4bab3dd3 -> :sswitch_5
        -0x49cf74b4 -> :sswitch_4
        -0x446d330 -> :sswitch_3
        0x4f5d3b97 -> :sswitch_2
        0x6acd460b -> :sswitch_1
        0x6b78f1fd -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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

.method public s(Ln0/z;)Z
    .locals 1

    invoke-virtual {p1}, Ln0/z;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LB2/i;->f:Ljava/lang/Object;

    check-cast v0, Ln0/p0;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const-string p1, "DepthSortedSet.remove called on an unattached node"

    invoke-static {p1}, LZ0/d;->S(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public t(Z)V
    .locals 5

    iget-object v0, p0, LB2/i;->f:Ljava/lang/Object;

    check-cast v0, Lk/H;

    iget-object v0, v0, Lk/H;->b:Ljava/lang/Object;

    check-cast v0, LB2/i;

    iget-object v0, v0, LB2/i;->f:Ljava/lang/Object;

    check-cast v0, Lq1/h;

    iget-boolean v1, v0, Lq1/h;->f:Z

    if-eq v1, p1, :cond_1

    iget-object v1, v0, Lq1/h;->e:Lq1/g;

    if-eqz v1, :cond_0

    invoke-static {}, Lo1/i;->a()Lo1/i;

    move-result-object v1

    iget-object v2, v0, Lq1/h;->e:Lq1/g;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "initCallback cannot be null"

    invoke-static {v2, v3}, LZ/b;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lo1/i;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v1, v1, Lo1/i;->b:Ln/g;

    invoke-virtual {v1, v2}, Ln/g;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :cond_0
    :goto_0
    iput-boolean p1, v0, Lq1/h;->f:Z

    if-eqz p1, :cond_1

    invoke-static {}, Lo1/i;->a()Lo1/i;

    move-result-object p1

    invoke-virtual {p1}, Lo1/i;->b()I

    move-result p1

    iget-object v0, v0, Lq1/h;->d:Landroid/widget/EditText;

    invoke-static {v0, p1}, Lq1/h;->a(Landroid/widget/EditText;I)V

    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, LB2/i;->d:I

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "FragmentManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_1
    iget-object v0, p0, LB2/i;->f:Ljava/lang/Object;

    check-cast v0, Ln0/p0;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Bounds{lower="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LB2/i;->e:Ljava/lang/Object;

    check-cast v1, LV0/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " upper="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LB2/i;->f:Ljava/lang/Object;

    check-cast v1, LV0/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_2
        0xb -> :sswitch_1
        0x13 -> :sswitch_0
    .end sparse-switch
.end method
