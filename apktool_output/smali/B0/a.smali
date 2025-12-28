.class public final LB0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW/w;


# static fields
.field public static e:Z = true


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, LB0/a;->a:I

    packed-switch p1, :pswitch_data_0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance p1, LX1/e;

    const/4 v0, 0x1

    .line 23
    invoke-direct {p1, v0}, LX1/e;-><init>(I)V

    .line 24
    iput-object p1, p0, LB0/a;->d:Ljava/lang/Object;

    return-void

    .line 25
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, LL/b;->b:LL/f;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LB0/a;->b:Ljava/lang/Object;

    .line 27
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB0/a;->c:Ljava/lang/Object;

    return-void

    .line 28
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, LB0/a;->b:Ljava/lang/Object;

    .line 30
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, LB0/a;->c:Ljava/lang/Object;

    .line 31
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, LB0/a;->d:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(LD1/w;LX1/e;Lo1/d;Ljava/util/Set;)V
    .locals 7

    const/16 v0, 0xa

    iput v0, p0, LB0/a;->a:I

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p2, p0, LB0/a;->b:Ljava/lang/Object;

    .line 52
    iput-object p1, p0, LB0/a;->c:Ljava/lang/Object;

    .line 53
    iput-object p3, p0, LB0/a;->d:Ljava/lang/Object;

    .line 54
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 55
    :cond_0
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    .line 56
    new-instance v1, Ljava/lang/String;

    array-length p3, p2

    const/4 p4, 0x0

    invoke-direct {v1, p2, p4, p3}, Ljava/lang/String;-><init>([III)V

    .line 57
    new-instance v6, LD2/w;

    const/4 p2, 0x1

    invoke-direct {v6, v1, p2}, LD2/w;-><init>(Ljava/lang/String;I)V

    .line 58
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LB0/a;->B(Ljava/lang/CharSequence;IIIZLo1/o;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public constructor <init>(LM0/e;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LB0/a;->a:I

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LB0/a;->b:Ljava/lang/Object;

    .line 41
    new-instance v0, LN0/b;

    .line 42
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object v0, p0, LB0/a;->c:Ljava/lang/Object;

    .line 44
    iput-object p1, p0, LB0/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LY/b;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, LB0/a;->a:I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, LB0/a;->d:Ljava/lang/Object;

    .line 34
    new-instance p1, LA/t;

    const/16 v0, 0xf

    invoke-direct {p1, v0, p0}, LA/t;-><init>(ILjava/lang/Object;)V

    .line 35
    iput-object p1, p0, LB0/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, LB0/a;->a:I

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, LB0/a;->b:Ljava/lang/Object;

    .line 38
    iput-object p2, p0, LB0/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/I;Landroidx/lifecycle/H;Lv1/b;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, LB0/a;->a:I

    const-string v0, "store"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p3, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LB0/a;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, LB0/a;->c:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, LB0/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln0/p;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, LB0/a;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB0/a;->b:Ljava/lang/Object;

    .line 6
    new-instance p1, LA/t;

    const/16 v0, 0x16

    invoke-direct {p1, v0}, LA/t;-><init>(I)V

    iput-object p1, p0, LB0/a;->c:Ljava/lang/Object;

    .line 7
    new-instance p1, Ln/t;

    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 9
    sget-object v0, Ln/D;->a:[J

    iput-object v0, p1, Ln/t;->a:[J

    .line 10
    sget-object v0, Ln/l;->a:[J

    .line 11
    iput-object v0, p1, Ln/t;->b:[J

    .line 12
    sget-object v0, Lo/a;->c:[Ljava/lang/Object;

    iput-object v0, p1, Ln/t;->c:[Ljava/lang/Object;

    const/16 v0, 0xa

    .line 13
    invoke-static {v0}, Ln/D;->d(I)I

    move-result v0

    invoke-virtual {p1, v0}, Ln/t;->c(I)V

    .line 14
    iput-object p1, p0, LB0/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln0/z;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, LB0/a;->a:I

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB0/a;->b:Ljava/lang/Object;

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LB0/a;->c:Ljava/lang/Object;

    .line 66
    iput-object p1, p0, LB0/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lo0/u;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LB0/a;->a:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB0/a;->b:Ljava/lang/Object;

    .line 16
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB0/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls1/c;)V
    .locals 1

    const/16 p1, 0xc

    iput p1, p0, LB0/a;->a:I

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance p1, LL0/f;

    const/16 v0, 0x1e

    invoke-direct {p1, v0}, LL0/f;-><init>(I)V

    iput-object p1, p0, LB0/a;->b:Ljava/lang/Object;

    .line 47
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LB0/a;->c:Ljava/lang/Object;

    .line 48
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LB0/a;->d:Ljava/lang/Object;

    .line 49
    new-instance p1, Ls1/c;

    const/16 v0, 0x11

    invoke-direct {p1, v0, p0}, Ls1/c;-><init>(ILjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lz0/t;LB0/a;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LB0/a;->a:I

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, LB0/a;->b:Ljava/lang/Object;

    .line 61
    iput-object p2, p0, LB0/a;->c:Ljava/lang/Object;

    .line 62
    iget-object p1, p1, Lz0/t;->d:Ljava/lang/Object;

    .line 63
    iput-object p1, p0, LB0/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lz1/p;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, LB0/a;->a:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, LB0/a;->b:Ljava/lang/Object;

    .line 19
    new-instance p1, Lz1/b;

    invoke-direct {p1}, Lz1/b;-><init>()V

    iput-object p1, p0, LB0/a;->c:Ljava/lang/Object;

    .line 20
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LB0/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public static e(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z
    .locals 6

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    move-result p1

    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result p1

    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v1

    const/4 v2, -0x1

    if-eq p1, v2, :cond_6

    if-eq v1, v2, :cond_6

    if-eq p1, v1, :cond_1

    goto :goto_1

    :cond_1
    const-class v2, Lo1/w;

    invoke-interface {p0, p1, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lo1/w;

    if-eqz v1, :cond_6

    array-length v2, v1

    if-lez v2, :cond_6

    array-length v2, v1

    move v3, v0

    :goto_0
    if-ge v3, v2, :cond_6

    aget-object v4, v1, v3

    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v5

    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v4

    if-eqz p2, :cond_2

    if-eq v5, p1, :cond_4

    :cond_2
    if-nez p2, :cond_3

    if-eq v4, p1, :cond_4

    :cond_3
    if-le p1, v5, :cond_5

    if-ge p1, v4, :cond_5

    :cond_4
    invoke-interface {p0, v5, v4}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    const/4 p0, 0x1

    return p0

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    :goto_1
    return v0
.end method

.method public static y(Landroid/content/Context;Landroid/util/AttributeSet;[II)LB0/a;
    .locals 2

    new-instance v0, LB0/a;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {v0, p0, p1}, LB0/a;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    return-object v0
.end method


# virtual methods
.method public A()V
    .locals 1

    iget-object v0, p0, LB0/a;->b:Ljava/lang/Object;

    check-cast v0, Ln0/z;

    iget-object v0, v0, Ln0/z;->l:Lo0/u;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lo0/u;->u()V

    :cond_0
    return-void
.end method

.method public B(Ljava/lang/CharSequence;IIIZLo1/o;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v4, p6

    new-instance v5, Lo1/p;

    iget-object v6, v0, LB0/a;->c:Ljava/lang/Object;

    check-cast v6, LD1/w;

    iget-object v6, v6, LD1/w;->c:Ljava/lang/Object;

    check-cast v6, Lo1/s;

    invoke-direct {v5, v6}, Lo1/p;-><init>(Lo1/s;)V

    invoke-static/range {p1 .. p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    move v9, v6

    move v11, v7

    move v10, v8

    move/from16 v6, p2

    :cond_0
    :goto_0
    move v8, v6

    :goto_1
    const/4 v12, 0x2

    if-ge v6, v2, :cond_f

    if-ge v10, v3, :cond_f

    if-eqz v11, :cond_f

    iget-object v13, v5, Lo1/p;->f:Ljava/lang/Object;

    check-cast v13, Lo1/s;

    iget-object v13, v13, Lo1/s;->a:Landroid/util/SparseArray;

    if-nez v13, :cond_1

    const/4 v13, 0x0

    goto :goto_2

    :cond_1
    invoke-virtual {v13, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lo1/s;

    :goto_2
    iget v14, v5, Lo1/p;->b:I

    const/4 v15, 0x3

    if-eq v14, v12, :cond_3

    if-nez v13, :cond_2

    invoke-virtual {v5}, Lo1/p;->c()V

    :goto_3
    move v13, v7

    goto :goto_6

    :cond_2
    iput v12, v5, Lo1/p;->b:I

    iput-object v13, v5, Lo1/p;->f:Ljava/lang/Object;

    iput v7, v5, Lo1/p;->d:I

    :goto_4
    move v13, v12

    goto :goto_6

    :cond_3
    if-eqz v13, :cond_4

    iput-object v13, v5, Lo1/p;->f:Ljava/lang/Object;

    iget v13, v5, Lo1/p;->d:I

    add-int/2addr v13, v7

    iput v13, v5, Lo1/p;->d:I

    goto :goto_4

    :cond_4
    const v13, 0xfe0e

    if-ne v9, v13, :cond_5

    invoke-virtual {v5}, Lo1/p;->c()V

    goto :goto_3

    :cond_5
    const v13, 0xfe0f

    if-ne v9, v13, :cond_6

    goto :goto_4

    :cond_6
    iget-object v13, v5, Lo1/p;->f:Ljava/lang/Object;

    check-cast v13, Lo1/s;

    iget-object v14, v13, Lo1/s;->b:Lo1/v;

    if-eqz v14, :cond_9

    iget v14, v5, Lo1/p;->d:I

    if-ne v14, v7, :cond_8

    invoke-virtual {v5}, Lo1/p;->d()Z

    move-result v13

    if-eqz v13, :cond_7

    iget-object v13, v5, Lo1/p;->f:Ljava/lang/Object;

    check-cast v13, Lo1/s;

    iput-object v13, v5, Lo1/p;->g:Ljava/lang/Object;

    invoke-virtual {v5}, Lo1/p;->c()V

    :goto_5
    move v13, v15

    goto :goto_6

    :cond_7
    invoke-virtual {v5}, Lo1/p;->c()V

    goto :goto_3

    :cond_8
    iput-object v13, v5, Lo1/p;->g:Ljava/lang/Object;

    invoke-virtual {v5}, Lo1/p;->c()V

    goto :goto_5

    :cond_9
    invoke-virtual {v5}, Lo1/p;->c()V

    goto :goto_3

    :goto_6
    iput v9, v5, Lo1/p;->c:I

    if-eq v13, v7, :cond_e

    if-eq v13, v12, :cond_c

    if-eq v13, v15, :cond_a

    goto :goto_1

    :cond_a
    if-nez p5, :cond_b

    iget-object v12, v5, Lo1/p;->g:Ljava/lang/Object;

    check-cast v12, Lo1/s;

    iget-object v12, v12, Lo1/s;->b:Lo1/v;

    invoke-virtual {v0, v1, v8, v6, v12}, LB0/a;->u(Ljava/lang/CharSequence;IILo1/v;)Z

    move-result v12

    if-nez v12, :cond_0

    :cond_b
    iget-object v11, v5, Lo1/p;->g:Ljava/lang/Object;

    check-cast v11, Lo1/s;

    iget-object v11, v11, Lo1/s;->b:Lo1/v;

    invoke-interface {v4, v1, v8, v6, v11}, Lo1/o;->d(Ljava/lang/CharSequence;IILo1/v;)Z

    move-result v11

    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    :cond_c
    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    move-result v12

    add-int/2addr v12, v6

    if-ge v12, v2, :cond_d

    invoke-static {v1, v12}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    move v9, v6

    :cond_d
    move v6, v12

    goto/16 :goto_1

    :cond_e
    invoke-static {v1, v8}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    move-result v6

    add-int/2addr v6, v8

    if-ge v6, v2, :cond_0

    invoke-static {v1, v6}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v8

    move v9, v8

    goto/16 :goto_0

    :cond_f
    iget v2, v5, Lo1/p;->b:I

    if-ne v2, v12, :cond_12

    iget-object v2, v5, Lo1/p;->f:Ljava/lang/Object;

    check-cast v2, Lo1/s;

    iget-object v2, v2, Lo1/s;->b:Lo1/v;

    if-eqz v2, :cond_12

    iget v2, v5, Lo1/p;->d:I

    if-gt v2, v7, :cond_10

    invoke-virtual {v5}, Lo1/p;->d()Z

    move-result v2

    if-eqz v2, :cond_12

    :cond_10
    if-ge v10, v3, :cond_12

    if-eqz v11, :cond_12

    if-nez p5, :cond_11

    iget-object v2, v5, Lo1/p;->f:Ljava/lang/Object;

    check-cast v2, Lo1/s;

    iget-object v2, v2, Lo1/s;->b:Lo1/v;

    invoke-virtual {v0, v1, v8, v6, v2}, LB0/a;->u(Ljava/lang/CharSequence;IILo1/v;)Z

    move-result v2

    if-nez v2, :cond_12

    :cond_11
    iget-object v2, v5, Lo1/p;->f:Ljava/lang/Object;

    check-cast v2, Lo1/s;

    iget-object v2, v2, Lo1/s;->b:Lo1/v;

    invoke-interface {v4, v1, v8, v6, v2}, Lo1/o;->d(Ljava/lang/CharSequence;IILo1/v;)Z

    :cond_12
    invoke-interface/range {p6 .. p6}, Lo1/o;->a()Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public C()V
    .locals 1

    iget-object v0, p0, LB0/a;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public D(Ljava/util/ArrayList;)V
    .locals 4

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz1/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, LB0/a;->b:Ljava/lang/Object;

    check-cast v3, LL0/f;

    invoke-virtual {v3, v2}, LL0/f;->c(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public E(Ljava/lang/Object;)V
    .locals 6

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    sget-wide v2, LD/b;->a:J

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    iput-object p1, p0, LB0/a;->d:Ljava/lang/Object;

    goto :goto_1

    :cond_0
    iget-object v2, p0, LB0/a;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v3, p0, LB0/a;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LL/f;

    invoke-virtual {v3, v0, v1}, LL/f;->a(J)I

    move-result v4

    if-gez v4, :cond_1

    const/4 v4, 0x0

    goto :goto_0

    :cond_1
    iget-object v5, v3, LL/f;->c:[Ljava/lang/Object;

    aput-object p1, v5, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x1

    :goto_0
    if-eqz v4, :cond_2

    monitor-exit v2

    return-void

    :cond_2
    :try_start_1
    iget-object v4, p0, LB0/a;->b:Ljava/lang/Object;

    check-cast v4, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v3, v0, v1, p1}, LL/f;->b(JLjava/lang/Object;)LL/f;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    :goto_1
    return-void

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1
.end method

.method public F(LW/o;)V
    .locals 1

    iget-object v0, p0, LB0/a;->d:Ljava/lang/Object;

    check-cast v0, LY/b;

    iget-object v0, v0, LY/b;->d:LY/a;

    iput-object p1, v0, LY/a;->c:LW/o;

    return-void
.end method

.method public G(LG0/b;)V
    .locals 1

    iget-object v0, p0, LB0/a;->d:Ljava/lang/Object;

    check-cast v0, LY/b;

    iget-object v0, v0, LY/b;->d:LY/a;

    iput-object p1, v0, LY/a;->a:LG0/b;

    return-void
.end method

.method public H(LZ/d;)V
    .locals 0

    iput-object p1, p0, LB0/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public I(LG0/f;)V
    .locals 1

    iget-object v0, p0, LB0/a;->d:Ljava/lang/Object;

    check-cast v0, LY/b;

    iget-object v0, v0, LY/b;->d:LY/a;

    iput-object p1, v0, LY/a;->b:LG0/f;

    return-void
.end method

.method public J(J)V
    .locals 1

    iget-object v0, p0, LB0/a;->d:Ljava/lang/Object;

    check-cast v0, LY/b;

    iget-object v0, v0, LY/b;->d:LY/a;

    iput-wide p1, v0, LY/a;->d:J

    return-void
.end method

.method public K(LM0/e;II)V
    .locals 3

    iget v0, p1, LM0/d;->Q:I

    iget v1, p1, LM0/d;->R:I

    const/4 v2, 0x0

    iput v2, p1, LM0/d;->Q:I

    iput v2, p1, LM0/d;->R:I

    invoke-virtual {p1, p2}, LM0/d;->y(I)V

    invoke-virtual {p1, p3}, LM0/d;->v(I)V

    if-gez v0, :cond_0

    iput v2, p1, LM0/d;->Q:I

    goto :goto_0

    :cond_0
    iput v0, p1, LM0/d;->Q:I

    :goto_0
    if-gez v1, :cond_1

    iput v2, p1, LM0/d;->R:I

    goto :goto_1

    :cond_1
    iput v1, p1, LM0/d;->R:I

    :goto_1
    iget-object p1, p0, LB0/a;->d:Ljava/lang/Object;

    check-cast p1, LM0/e;

    invoke-virtual {p1}, LM0/e;->E()V

    return-void
.end method

.method public L(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LB0/a;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->r(Landroid/view/View;)Lz1/I;

    :cond_0
    return-void
.end method

.method public M()V
    .locals 2

    iget-object v0, p0, LB0/a;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LB0/a;->d:Ljava/lang/Object;

    return-void

    :cond_0
    const-string v0, "empty stack"

    invoke-static {v0}, LD/d;->I(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public a(LZ/d;)V
    .locals 2

    iget-object v0, p0, LB0/a;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p1, LZ/d;->q:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p1, LZ/d;->q:Z

    invoke-virtual {p1}, LZ/d;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public b()LZ/d;
    .locals 5

    iget-object v0, p0, LB0/a;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LB0/a;->b:Ljava/lang/Object;

    check-cast v1, Lo0/u;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-lt v2, v3, :cond_0

    invoke-static {v1}, LW/e;->a(Landroid/view/View;)J

    :cond_0
    if-lt v2, v3, :cond_1

    new-instance v1, LZ/i;

    invoke-direct {v1}, LZ/i;-><init>()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    sget-boolean v1, LB0/a;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    :try_start_1
    new-instance v1, LZ/g;

    iget-object v2, p0, LB0/a;->b:Ljava/lang/Object;

    check-cast v2, Lo0/u;

    new-instance v3, LW/p;

    invoke-direct {v3}, LW/p;-><init>()V

    new-instance v4, LY/b;

    invoke-direct {v4}, LY/b;-><init>()V

    invoke-direct {v1, v2, v3, v4}, LZ/g;-><init>(Lo0/u;LW/p;LY/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    const/4 v1, 0x0

    :try_start_2
    sput-boolean v1, LB0/a;->e:Z

    new-instance v1, LZ/k;

    iget-object v2, p0, LB0/a;->b:Ljava/lang/Object;

    check-cast v2, Lo0/u;

    invoke-virtual {p0, v2}, LB0/a;->z(Lo0/u;)La0/a;

    move-result-object v2

    invoke-direct {v1, v2}, LZ/k;-><init>(La0/a;)V

    goto :goto_0

    :cond_2
    new-instance v1, LZ/k;

    iget-object v2, p0, LB0/a;->b:Ljava/lang/Object;

    check-cast v2, Lo0/u;

    invoke-virtual {p0, v2}, LB0/a;->z(Lo0/u;)La0/a;

    move-result-object v2

    invoke-direct {v1, v2}, LZ/k;-><init>(La0/a;)V

    :goto_0
    new-instance v2, LZ/d;

    invoke-direct {v2, v1}, LZ/d;-><init>(LZ/f;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object v2

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public c(JLjava/util/List;Z)V
    .locals 20

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    iget-object v3, v0, LB0/a;->c:Ljava/lang/Object;

    check-cast v3, LA/t;

    iget-object v4, v0, LB0/a;->d:Ljava/lang/Object;

    check-cast v4, Ln/t;

    const/4 v5, 0x0

    iput v5, v4, Ln/t;->e:I

    iget-object v6, v4, Ln/t;->a:[J

    sget-object v7, Ln/D;->a:[J

    const-wide/16 v8, 0xff

    const/4 v10, 0x7

    if-eq v6, v7, :cond_0

    invoke-static {v6}, Ld2/j;->d0([J)V

    iget-object v6, v4, Ln/t;->a:[J

    iget v7, v4, Ln/t;->d:I

    shr-int/lit8 v11, v7, 0x3

    and-int/2addr v7, v10

    shl-int/lit8 v7, v7, 0x3

    aget-wide v12, v6, v11

    shl-long v14, v8, v7

    not-long v8, v14

    and-long v7, v12, v8

    or-long/2addr v7, v14

    aput-wide v7, v6, v11

    :cond_0
    iget-object v6, v4, Ln/t;->c:[Ljava/lang/Object;

    iget v7, v4, Ln/t;->d:I

    invoke-static {v6, v5, v7}, Ld2/j;->c0([Ljava/lang/Object;II)V

    iget v6, v4, Ln/t;->d:I

    invoke-static {v6}, Ln/D;->a(I)I

    move-result v6

    iget v7, v4, Ln/t;->e:I

    sub-int/2addr v6, v7

    iput v6, v4, Ln/t;->f:I

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x1

    move-object v11, v3

    move v8, v5

    move v9, v7

    :goto_0
    if-ge v8, v6, :cond_8

    move-object/from16 v12, p3

    invoke-interface {v12, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LP/k;

    if-eqz v9, :cond_6

    iget-object v14, v11, LA/t;->e:Ljava/lang/Object;

    check-cast v14, LF/d;

    iget v15, v14, LF/d;->f:I

    if-lez v15, :cond_3

    iget-object v14, v14, LF/d;->d:[Ljava/lang/Object;

    move/from16 v18, v5

    :goto_1
    aget-object v19, v14, v18

    move-object/from16 v5, v19

    check-cast v5, Lh0/e;

    iget-object v5, v5, Lh0/e;->f:LP/k;

    invoke-static {v5, v13}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_3

    :cond_1
    add-int/lit8 v5, v18, 0x1

    if-lt v5, v15, :cond_2

    goto :goto_2

    :cond_2
    move/from16 v18, v5

    const/4 v5, 0x0

    goto :goto_1

    :cond_3
    :goto_2
    const/16 v19, 0x0

    :goto_3
    move-object/from16 v5, v19

    check-cast v5, Lh0/e;

    if-eqz v5, :cond_5

    iput-boolean v7, v5, Lh0/e;->l:Z

    iget-object v11, v5, Lh0/e;->g:LI/m;

    invoke-virtual {v11, v1, v2}, LI/m;->a(J)V

    invoke-virtual {v4, v1, v2}, Ln/t;->b(J)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_4

    new-instance v11, Ln/x;

    invoke-direct {v11}, Ln/x;-><init>()V

    invoke-virtual {v4, v1, v2, v11}, Ln/t;->e(JLn/x;)V

    :cond_4
    check-cast v11, Ln/x;

    invoke-virtual {v11, v5}, Ln/x;->a(Ljava/lang/Object;)V

    :goto_4
    move-object v11, v5

    goto :goto_5

    :cond_5
    const/4 v9, 0x0

    :cond_6
    new-instance v5, Lh0/e;

    invoke-direct {v5, v13}, Lh0/e;-><init>(LP/k;)V

    iget-object v13, v5, Lh0/e;->g:LI/m;

    invoke-virtual {v13, v1, v2}, LI/m;->a(J)V

    invoke-virtual {v4, v1, v2}, Ln/t;->b(J)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_7

    new-instance v13, Ln/x;

    invoke-direct {v13}, Ln/x;-><init>()V

    invoke-virtual {v4, v1, v2, v13}, Ln/t;->e(JLn/x;)V

    :cond_7
    check-cast v13, Ln/x;

    invoke-virtual {v13, v5}, Ln/x;->a(Ljava/lang/Object;)V

    iget-object v11, v11, LA/t;->e:Ljava/lang/Object;

    check-cast v11, LF/d;

    invoke-virtual {v11, v5}, LF/d;->b(Ljava/lang/Object;)V

    goto :goto_4

    :goto_5
    add-int/lit8 v8, v8, 0x1

    const/4 v5, 0x0

    goto :goto_0

    :cond_8
    if-eqz p4, :cond_e

    iget-object v1, v4, Ln/t;->b:[J

    iget-object v2, v4, Ln/t;->c:[Ljava/lang/Object;

    iget-object v4, v4, Ln/t;->a:[J

    array-length v5, v4

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_e

    const/4 v6, 0x0

    :goto_6
    aget-wide v8, v4, v6

    not-long v11, v8

    shl-long/2addr v11, v10

    and-long/2addr v11, v8

    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v11, v13

    cmp-long v11, v11, v13

    if-eqz v11, :cond_d

    sub-int v11, v6, v5

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    const/4 v13, 0x0

    :goto_7
    if-ge v13, v11, :cond_c

    const-wide/16 v14, 0xff

    and-long v16, v8, v14

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_b

    shl-int/lit8 v16, v6, 0x3

    add-int v16, v16, v13

    aget-wide v14, v1, v16

    aget-object v16, v2, v16

    move-object/from16 v10, v16

    check-cast v10, Ln/x;

    iget-object v12, v3, LA/t;->e:Ljava/lang/Object;

    check-cast v12, LF/d;

    iget v7, v12, LF/d;->f:I

    if-lez v7, :cond_a

    iget-object v12, v12, LF/d;->d:[Ljava/lang/Object;

    const/16 v18, 0x0

    :goto_8
    aget-object v19, v12, v18

    move-object/from16 v0, v19

    check-cast v0, Lh0/e;

    invoke-virtual {v0, v14, v15, v10}, Lh0/e;->M(JLn/x;)V

    move-object/from16 v16, v1

    const/4 v0, 0x1

    add-int/lit8 v1, v18, 0x1

    if-lt v1, v7, :cond_9

    goto :goto_9

    :cond_9
    move-object/from16 v0, p0

    move/from16 v18, v1

    move-object/from16 v1, v16

    goto :goto_8

    :cond_a
    move-object/from16 v16, v1

    const/4 v0, 0x1

    :goto_9
    const/16 v1, 0x8

    goto :goto_a

    :cond_b
    move-object/from16 v16, v1

    move v0, v7

    move v1, v12

    :goto_a
    shr-long/2addr v8, v1

    add-int/lit8 v13, v13, 0x1

    move v7, v0

    move v12, v1

    move-object/from16 v1, v16

    const/4 v10, 0x7

    move-object/from16 v0, p0

    goto :goto_7

    :cond_c
    move-object/from16 v16, v1

    move v0, v7

    move v1, v12

    if-ne v11, v1, :cond_e

    goto :goto_b

    :cond_d
    move-object/from16 v16, v1

    move v0, v7

    :goto_b
    if-eq v6, v5, :cond_e

    add-int/lit8 v6, v6, 0x1

    move v7, v0

    move-object/from16 v1, v16

    const/4 v10, 0x7

    move-object/from16 v0, p0

    goto :goto_6

    :cond_e
    return-void
.end method

.method public d()V
    .locals 5

    iget-object v0, p0, LB0/a;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, LB0/a;->b:Ljava/lang/Object;

    check-cast v0, Ln0/z;

    iput-object v0, p0, LB0/a;->d:Ljava/lang/Object;

    iget-object v0, p0, LB0/a;->b:Ljava/lang/Object;

    check-cast v0, Ln0/z;

    iget-object v1, v0, Ln0/z;->h:LB2/i;

    iget-object v2, v1, LB2/i;->e:Ljava/lang/Object;

    check-cast v2, LF/d;

    iget v2, v2, LF/d;->f:I

    add-int/lit8 v2, v2, -0x1

    :goto_0
    const/4 v3, -0x1

    iget-object v4, v1, LB2/i;->e:Ljava/lang/Object;

    check-cast v4, LF/d;

    if-ge v3, v2, :cond_0

    iget-object v3, v4, LF/d;->d:[Ljava/lang/Object;

    aget-object v3, v3, v2

    check-cast v3, Ln0/z;

    invoke-virtual {v0, v3}, Ln0/z;->y(Ln0/z;)V

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, LF/d;->g()V

    iget-object v0, v1, LB2/i;->f:Ljava/lang/Object;

    check-cast v0, LA0/c;

    invoke-virtual {v0}, LA0/c;->c()Ljava/lang/Object;

    return-void
.end method

.method public f(LB2/i;Z)Z
    .locals 9

    iget-object v0, p0, LB0/a;->c:Ljava/lang/Object;

    check-cast v0, LA/t;

    iget-object v1, p1, LB2/i;->e:Ljava/lang/Object;

    check-cast v1, Ln/m;

    iget-object v2, p0, LB0/a;->b:Ljava/lang/Object;

    check-cast v2, Ln0/p;

    invoke-virtual {v0, v1, v2, p1, p2}, LA/t;->t(Ln/m;Ln0/p;LB2/i;Z)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    iget-object v1, v0, LA/t;->e:Ljava/lang/Object;

    check-cast v1, LF/d;

    iget v3, v1, LF/d;->f:I

    const/4 v4, 0x1

    if-lez v3, :cond_4

    iget-object v5, v1, LF/d;->d:[Ljava/lang/Object;

    move v6, v2

    move v7, v6

    :cond_1
    aget-object v8, v5, v6

    check-cast v8, Lh0/e;

    invoke-virtual {v8, p1, p2}, Lh0/e;->L(LB2/i;Z)Z

    move-result v8

    if-nez v8, :cond_3

    if-eqz v7, :cond_2

    goto :goto_0

    :cond_2
    move v7, v2

    goto :goto_1

    :cond_3
    :goto_0
    move v7, v4

    :goto_1
    add-int/lit8 v6, v6, 0x1

    if-lt v6, v3, :cond_1

    goto :goto_2

    :cond_4
    move v7, v2

    :goto_2
    iget p2, v1, LF/d;->f:I

    if-lez p2, :cond_8

    iget-object v1, v1, LF/d;->d:[Ljava/lang/Object;

    move v3, v2

    move v5, v3

    :cond_5
    aget-object v6, v1, v3

    check-cast v6, Lh0/e;

    invoke-virtual {v6, p1}, Lh0/e;->K(LB2/i;)Z

    move-result v6

    if-nez v6, :cond_7

    if-eqz v5, :cond_6

    goto :goto_3

    :cond_6
    move v5, v2

    goto :goto_4

    :cond_7
    :goto_3
    move v5, v4

    :goto_4
    add-int/lit8 v3, v3, 0x1

    if-lt v3, p2, :cond_5

    goto :goto_5

    :cond_8
    move v5, v2

    :goto_5
    invoke-virtual {v0, p1}, LA/t;->u(LB2/i;)V

    if-nez v5, :cond_9

    if-eqz v7, :cond_a

    :cond_9
    move v2, v4

    :cond_a
    return v2
.end method

.method public g(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, LB0/a;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    iget-object v1, p0, LB0/a;->d:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p1, p0, LB0/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public h(II)I
    .locals 3

    iget-object v0, p0, LB0/a;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge p2, v1, :cond_0

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz1/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return p1
.end method

.method public i()Ljava/lang/Object;
    .locals 4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    sget-wide v2, LD/b;->a:J

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    iget-object v0, p0, LB0/a;->d:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v2, p0, LB0/a;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LL/f;

    invoke-virtual {v2, v0, v1}, LL/f;->a(J)I

    move-result v0

    if-ltz v0, :cond_1

    iget-object v1, v2, LL/f;->c:[Ljava/lang/Object;

    aget-object v0, v1, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public j()LW/o;
    .locals 1

    iget-object v0, p0, LB0/a;->d:Ljava/lang/Object;

    check-cast v0, LY/b;

    iget-object v0, v0, LY/b;->d:LY/a;

    iget-object v0, v0, LY/a;->c:LW/o;

    return-object v0
.end method

.method public k(I)Landroid/content/res/ColorStateList;
    .locals 3

    iget-object v0, p0, LB0/a;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eqz v1, :cond_0

    iget-object v2, p0, LB0/a;->b:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-static {v2, v1}, Lr2/a;->y(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public l()LG0/b;
    .locals 1

    iget-object v0, p0, LB0/a;->d:Ljava/lang/Object;

    check-cast v0, LY/b;

    iget-object v0, v0, LY/b;->d:LY/a;

    iget-object v0, v0, LY/a;->a:LG0/b;

    return-object v0
.end method

.method public m(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, LB0/a;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, LB0/a;->b:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, v1}, LZ/b;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public n(IILk/A;)Landroid/graphics/Typeface;
    .locals 9

    iget-object v0, p0, LB0/a;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    const/4 p1, 0x0

    if-nez v3, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, LB0/a;->d:Ljava/lang/Object;

    check-cast v0, Landroid/util/TypedValue;

    if-nez v0, :cond_1

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, LB0/a;->d:Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, LB0/a;->d:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroid/util/TypedValue;

    sget-object v0, LU0/o;->a:Ljava/lang/ThreadLocal;

    iget-object v0, p0, LB0/a;->b:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->isRestricted()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v8, 0x0

    const/4 v7, 0x1

    move v5, p2

    move-object v6, p3

    invoke-static/range {v2 .. v8}, LU0/o;->b(Landroid/content/Context;ILandroid/util/TypedValue;ILU0/b;ZZ)Landroid/graphics/Typeface;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public o()LZ/d;
    .locals 1

    iget-object v0, p0, LB0/a;->c:Ljava/lang/Object;

    check-cast v0, LZ/d;

    return-object v0
.end method

.method public p()LG0/f;
    .locals 1

    iget-object v0, p0, LB0/a;->d:Ljava/lang/Object;

    check-cast v0, LY/b;

    iget-object v0, v0, LY/b;->d:LY/a;

    iget-object v0, v0, LY/a;->b:LG0/f;

    return-object v0
.end method

.method public q(I)I
    .locals 5

    const/4 v0, -0x1

    if-gez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, LB0/a;->b:Ljava/lang/Object;

    check-cast v1, Lz1/p;

    iget-object v1, v1, Lz1/p;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    move v2, p1

    :goto_0
    if-ge v2, v1, :cond_3

    iget-object v3, p0, LB0/a;->c:Ljava/lang/Object;

    check-cast v3, Lz1/b;

    invoke-virtual {v3, v2}, Lz1/b;->b(I)I

    move-result v4

    sub-int v4, v2, v4

    sub-int v4, p1, v4

    if-nez v4, :cond_2

    :goto_1
    invoke-virtual {v3, v2}, Lz1/b;->d(I)Z

    move-result p1

    if-eqz p1, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return v2

    :cond_2
    add-int/2addr v2, v4

    goto :goto_0

    :cond_3
    return v0
.end method

.method public r()J
    .locals 2

    iget-object v0, p0, LB0/a;->d:Ljava/lang/Object;

    check-cast v0, LY/b;

    iget-object v0, v0, LY/b;->d:LY/a;

    iget-wide v0, v0, LY/a;->d:J

    return-wide v0
.end method

.method public s(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, LB0/a;->b:Ljava/lang/Object;

    check-cast v0, Lz1/p;

    iget-object v0, v0, Lz1/p;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public t()I
    .locals 1

    iget-object v0, p0, LB0/a;->b:Ljava/lang/Object;

    check-cast v0, Lz1/p;

    iget-object v0, v0, Lz1/p;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, LB0/a;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LB0/a;->c:Ljava/lang/Object;

    check-cast v1, Lz1/b;

    invoke-virtual {v1}, Lz1/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", hidden list:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LB0/a;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_0
    .end packed-switch
.end method

.method public u(Ljava/lang/CharSequence;IILo1/v;)Z
    .locals 7

    const/4 v0, 0x1

    iget v1, p4, Lo1/v;->c:I

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-nez v1, :cond_4

    iget-object v1, p0, LB0/a;->d:Ljava/lang/Object;

    check-cast v1, Lo1/d;

    invoke-virtual {p4}, Lo1/v;->c()Lp1/a;

    move-result-object v4

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Lp1/c;->a(I)I

    move-result v5

    if-eqz v5, :cond_0

    iget-object v6, v4, Lp1/c;->b:Ljava/nio/ByteBuffer;

    iget v4, v4, Lp1/c;->a:I

    add-int/2addr v5, v4

    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lo1/d;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    :goto_0
    if-ge p2, p3, :cond_2

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/2addr p2, v0

    goto :goto_0

    :cond_2
    iget-object p1, v1, Lo1/d;->a:Landroid/text/TextPaint;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget p3, LV0/e;->a:I

    invoke-static {p1, p2}, LV0/d;->a(Landroid/graphics/Paint;Ljava/lang/String;)Z

    move-result p1

    iget p2, p4, Lo1/v;->c:I

    and-int/lit8 p2, p2, 0x4

    if-eqz p1, :cond_3

    or-int/lit8 p1, p2, 0x2

    goto :goto_1

    :cond_3
    or-int/lit8 p1, p2, 0x1

    :goto_1
    iput p1, p4, Lo1/v;->c:I

    :cond_4
    iget p1, p4, Lo1/v;->c:I

    and-int/lit8 p1, p1, 0x3

    if-ne p1, v2, :cond_5

    goto :goto_2

    :cond_5
    move v0, v3

    :goto_2
    return v0
.end method

.method public v()Z
    .locals 1

    iget-object v0, p0, LB0/a;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public w()Z
    .locals 2

    iget-object v0, p0, LB0/a;->b:Ljava/lang/Object;

    check-cast v0, Lz0/t;

    iget-object v0, v0, Lz0/t;->d:Ljava/lang/Object;

    iget-object v1, p0, LB0/a;->d:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LB0/a;->c:Ljava/lang/Object;

    check-cast v0, LB0/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LB0/a;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public x(LO0/e;LM0/d;Z)Z
    .locals 6

    iget-object v0, p2, LM0/d;->c0:[I

    const/4 v1, 0x0

    aget v2, v0, v1

    iget-object v3, p0, LB0/a;->c:Ljava/lang/Object;

    check-cast v3, LN0/b;

    iput v2, v3, LN0/b;->a:I

    const/4 v2, 0x1

    aget v0, v0, v2

    iput v0, v3, LN0/b;->b:I

    invoke-virtual {p2}, LM0/d;->l()I

    move-result v0

    iput v0, v3, LN0/b;->c:I

    invoke-virtual {p2}, LM0/d;->i()I

    move-result v0

    iput v0, v3, LN0/b;->d:I

    iput-boolean v1, v3, LN0/b;->i:Z

    iput-boolean p3, v3, LN0/b;->j:Z

    iget p3, v3, LN0/b;->a:I

    const/4 v0, 0x3

    if-ne p3, v0, :cond_0

    move p3, v2

    goto :goto_0

    :cond_0
    move p3, v1

    :goto_0
    iget v4, v3, LN0/b;->b:I

    if-ne v4, v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    const/4 v4, 0x0

    if-eqz p3, :cond_2

    iget p3, p2, LM0/d;->L:F

    cmpl-float p3, p3, v4

    if-lez p3, :cond_2

    move p3, v2

    goto :goto_2

    :cond_2
    move p3, v1

    :goto_2
    if-eqz v0, :cond_3

    iget v0, p2, LM0/d;->L:F

    cmpl-float v0, v0, v4

    if-lez v0, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    move v0, v1

    :goto_3
    iget-object v4, p2, LM0/d;->l:[I

    const/4 v5, 0x4

    if-eqz p3, :cond_4

    aget p3, v4, v1

    if-ne p3, v5, :cond_4

    iput v2, v3, LN0/b;->a:I

    :cond_4
    if-eqz v0, :cond_5

    aget p3, v4, v2

    if-ne p3, v5, :cond_5

    iput v2, v3, LN0/b;->b:I

    :cond_5
    invoke-virtual {p1, p2, v3}, LO0/e;->a(LM0/d;LN0/b;)V

    iget p1, v3, LN0/b;->e:I

    invoke-virtual {p2, p1}, LM0/d;->y(I)V

    iget p1, v3, LN0/b;->f:I

    invoke-virtual {p2, p1}, LM0/d;->v(I)V

    iget-boolean p1, v3, LN0/b;->h:Z

    iput-boolean p1, p2, LM0/d;->w:Z

    iget p1, v3, LN0/b;->g:I

    iput p1, p2, LM0/d;->P:I

    if-lez p1, :cond_6

    goto :goto_4

    :cond_6
    move v2, v1

    :goto_4
    iput-boolean v2, p2, LM0/d;->w:Z

    iput-boolean v1, v3, LN0/b;->j:Z

    iget-boolean p1, v3, LN0/b;->i:Z

    return p1
.end method

.method public z(Lo0/u;)La0/a;
    .locals 3

    iget-object v0, p0, LB0/a;->d:Ljava/lang/Object;

    check-cast v0, La0/b;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, La0/b;

    invoke-direct {v1, v0}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const v2, 0x7f0800ba

    invoke-virtual {v1, v2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const/4 v0, -0x1

    invoke-virtual {p1, v1, v0}, Lo0/u;->addView(Landroid/view/View;I)V

    iput-object v1, p0, LB0/a;->d:Ljava/lang/Object;

    move-object v0, v1

    :cond_0
    return-object v0
.end method
