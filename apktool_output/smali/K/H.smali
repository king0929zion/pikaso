.class public Lk/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk/G;
.implements Lo1/h;
.implements Lp/o;
.implements Lp/J;
.implements Lx1/e;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(FF)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Lk/H;->a:I

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Lp/u;

    const v1, 0x3c23d70a    # 0.01f

    .line 33
    invoke-direct {v0, p1, p2, v1}, Lp/u;-><init>(FFF)V

    .line 34
    iput-object v0, p0, Lk/H;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(FFLp/n;)V
    .locals 5

    const/4 v0, 0x4

    iput v0, p0, Lk/H;->a:I

    if-eqz p3, :cond_1

    .line 18
    new-instance v0, LD/K0;

    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    invoke-virtual {p3}, Lp/n;->b()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2, v1}, LZ/b;->R(II)Lu2/d;

    move-result-object v1

    .line 21
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1}, Ld2/m;->W(Ljava/lang/Iterable;)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    invoke-virtual {v1}, Lu2/b;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    move-object v3, v1

    check-cast v3, Lu2/c;

    .line 23
    iget-boolean v3, v3, Lu2/c;->f:Z

    if-eqz v3, :cond_0

    .line 24
    move-object v3, v1

    check-cast v3, Lu2/c;

    invoke-virtual {v3}, Lu2/c;->a()I

    move-result v3

    .line 25
    new-instance v4, Lp/u;

    invoke-virtual {p3, v3}, Lp/n;->a(I)F

    move-result v3

    invoke-direct {v4, p1, p2, v3}, Lp/u;-><init>(FFF)V

    .line 26
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 27
    :cond_0
    iput-object v2, v0, LD/K0;->a:Ljava/util/ArrayList;

    goto :goto_1

    .line 28
    :cond_1
    new-instance v0, Lk/H;

    invoke-direct {v0, p1, p2}, Lk/H;-><init>(FF)V

    .line 29
    :goto_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance p1, LD1/w;

    invoke-direct {p1, v0}, LD1/w;-><init>(Lp/o;)V

    iput-object p1, p0, Lk/H;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Lk/H;->a:I

    packed-switch p1, :pswitch_data_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1c

    if-lt p1, v0, :cond_0

    .line 4
    new-instance p1, Ls1/c;

    const/16 v0, 0xd

    const/4 v1, 0x0

    .line 5
    invoke-direct {p1, v0, v1}, Ls1/c;-><init>(IZ)V

    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Ls1/c;

    const/16 v0, 0xe

    const/4 v1, 0x0

    .line 7
    invoke-direct {p1, v0, v1}, Ls1/c;-><init>(IZ)V

    .line 8
    :goto_0
    iput-object p1, p0, Lk/H;->b:Ljava/lang/Object;

    return-void

    .line 9
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Lk/H;->b:Ljava/lang/Object;

    .line 11
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lk/H;->a:I

    iput-object p2, p0, Lk/H;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lk/H;->a:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lk/H;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 2

    const/4 v0, 0x5

    iput v0, p0, Lk/H;->a:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, LB2/i;

    const/16 v1, 0x12

    invoke-direct {v0, p1, v1}, LB2/i;-><init>(Landroid/widget/EditText;I)V

    iput-object v0, p0, Lk/H;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lk/H;->a:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Lq1/f;

    invoke-direct {v0, p1}, Lq1/f;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lk/H;->b:Ljava/lang/Object;

    return-void
.end method

.method public static k(II)I
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    move v3, v2

    :goto_0
    const/4 v4, 0x1

    if-ge v1, p0, :cond_2

    add-int/lit8 v2, v2, 0x1

    if-ne v2, p1, :cond_0

    add-int/lit8 v3, v3, 0x1

    move v2, v0

    goto :goto_1

    :cond_0
    if-le v2, p1, :cond_1

    add-int/lit8 v3, v3, 0x1

    move v2, v4

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    add-int/2addr v2, v4

    if-le v2, p1, :cond_3

    add-int/lit8 v3, v3, 0x1

    :cond_3
    return v3
.end method


# virtual methods
.method public a(Lp/n;Lp/n;Lp/n;)Lp/n;
    .locals 1

    iget-object v0, p0, Lk/H;->b:Ljava/lang/Object;

    check-cast v0, LD1/w;

    invoke-virtual {v0, p1, p2, p3}, LD1/w;->a(Lp/n;Lp/n;Lp/n;)Lp/n;

    move-result-object p1

    return-object p1
.end method

.method public b(ILjava/io/Serializable;)V
    .locals 3

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    const-string v0, ""

    goto :goto_0

    :pswitch_1
    const-string v0, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    goto :goto_0

    :pswitch_2
    const-string v0, "RESULT_INSTALL_SKIP_FILE_SUCCESS"

    goto :goto_0

    :pswitch_3
    const-string v0, "RESULT_PARSE_EXCEPTION"

    goto :goto_0

    :pswitch_4
    const-string v0, "RESULT_IO_EXCEPTION"

    goto :goto_0

    :pswitch_5
    const-string v0, "RESULT_BASELINE_PROFILE_NOT_FOUND"

    goto :goto_0

    :pswitch_6
    const-string v0, "RESULT_DESIRED_FORMAT_UNSUPPORTED"

    goto :goto_0

    :pswitch_7
    const-string v0, "RESULT_NOT_WRITABLE"

    goto :goto_0

    :pswitch_8
    const-string v0, "RESULT_UNSUPPORTED_ART_VERSION"

    goto :goto_0

    :pswitch_9
    const-string v0, "RESULT_ALREADY_INSTALLED"

    goto :goto_0

    :pswitch_a
    const-string v0, "RESULT_INSTALL_SUCCESS"

    :goto_0
    const/4 v1, 0x6

    const-string v2, "ProfileInstaller"

    if-eq p1, v1, :cond_0

    const/4 v1, 0x7

    if-eq p1, v1, :cond_0

    const/16 v1, 0x8

    if-eq p1, v1, :cond_0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    invoke-static {v2, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    iget-object p2, p0, Lk/H;->b:Ljava/lang/Object;

    check-cast p2, Landroidx/profileinstaller/ProfileInstallReceiver;

    invoke-virtual {p2, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public c(Lp/n;Lp/n;Lp/n;)J
    .locals 1

    iget-object v0, p0, Lk/H;->b:Ljava/lang/Object;

    check-cast v0, LD1/w;

    invoke-virtual {v0, p1, p2, p3}, LD1/w;->c(Lp/n;Lp/n;Lp/n;)J

    move-result-wide p1

    return-wide p1
.end method

.method public d()V
    .locals 2

    const-string v0, "ProfileInstaller"

    const-string v1, "DIAGNOSTIC_PROFILE_IS_COMPRESSED"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public e(JLp/n;Lp/n;Lp/n;)Lp/n;
    .locals 7

    iget-object v0, p0, Lk/H;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, LD1/w;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, LD1/w;->e(JLp/n;Lp/n;Lp/n;)Lp/n;

    move-result-object p1

    return-object p1
.end method

.method public f(JLp/n;Lp/n;Lp/n;)Lp/n;
    .locals 7

    iget-object v0, p0, Lk/H;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, LD1/w;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, LD1/w;->f(JLp/n;Lp/n;Lp/n;)Lp/n;

    move-result-object p1

    return-object p1
.end method

.method public g(LZ0/d;)V
    .locals 9

    new-instance v7, Lo1/a;

    const-string v0, "EmojiCompatInitializer"

    invoke-direct {v7, v0}, Lo1/a;-><init>(Ljava/lang/String;)V

    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    const-wide/16 v3, 0xf

    const/4 v1, 0x0

    const/4 v2, 0x1

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    new-instance v0, Lo1/k;

    invoke-direct {v0, p0, p1, v8}, Lo1/k;-><init>(Lk/H;LZ0/d;Ljava/util/concurrent/ThreadPoolExecutor;)V

    invoke-virtual {v8, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public get(I)Lp/t;
    .locals 0

    iget p1, p0, Lk/H;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lk/H;->b:Ljava/lang/Object;

    check-cast p1, Lp/t;

    return-object p1

    :pswitch_0
    iget-object p1, p0, Lk/H;->b:Ljava/lang/Object;

    check-cast p1, Lp/u;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public h(I)V
    .locals 0

    return-void
.end method

.method public i(I)V
    .locals 0

    return-void
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Lk/H;->b:Ljava/lang/Object;

    check-cast v0, LD1/w;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
