.class public abstract Lo0/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/view/ViewGroup$LayoutParams;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    sput-object v0, Lo0/d1;->a:Landroid/view/ViewGroup$LayoutParams;

    return-void
.end method

.method public static final a(Lo0/a;LD/q;LL/a;)Lo0/b1;
    .locals 6

    sget-object v0, Lo0/m0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x6

    invoke-static {v2, v1, v0}, LA2/i;->a(III)LA2/b;

    move-result-object v0

    sget-object v2, Lo0/W;->p:Lc2/k;

    invoke-virtual {v2}, Lc2/k;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg2/i;

    invoke-static {v2}, Ly2/v;->a(Lg2/i;)LD2/d;

    move-result-object v2

    new-instance v4, Lo0/l0;

    invoke-direct {v4, v0, v3}, Lo0/l0;-><init>(LA2/b;Lg2/d;)V

    const/4 v5, 0x3

    invoke-static {v2, v3, v1, v4, v5}, Ly2/v;->l(Ly2/u;Lg2/a;ILo2/e;I)Ly2/h0;

    new-instance v2, LD/y;

    const/16 v4, 0x12

    invoke-direct {v2, v4, v0}, LD/y;-><init>(ILjava/lang/Object;)V

    sget-object v0, LN/o;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v4, LN/o;->h:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    invoke-static {v4, v2}, Ld2/k;->h0(Ljava/util/List;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v2

    sput-object v2, LN/o;->h:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-static {}, LN/o;->a()V

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0

    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Lo0/u;

    if-eqz v1, :cond_1

    check-cast v0, Lo0/u;

    goto :goto_2

    :cond_1
    :goto_1
    move-object v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    goto :goto_1

    :goto_2
    if-nez v0, :cond_3

    new-instance v0, Lo0/u;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    move-object v2, p1

    check-cast v2, LD/v0;

    iget-object v2, v2, LD/v0;->t:Lg2/i;

    invoke-direct {v0, v1, v2}, Lo0/u;-><init>(Landroid/content/Context;Lg2/i;)V

    invoke-virtual {v0}, Lo0/u;->getView()Landroid/view/View;

    move-result-object v1

    sget-object v2, Lo0/d1;->a:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, v1, v2}, Lo0/a;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_3
    new-instance p0, LB0/a;

    invoke-virtual {v0}, Lo0/u;->getRoot()Ln0/z;

    move-result-object v1

    invoke-direct {p0, v1}, LB0/a;-><init>(Ln0/z;)V

    new-instance v1, LD/t;

    invoke-direct {v1, p1, p0}, LD/t;-><init>(LD/q;LB0/a;)V

    invoke-virtual {v0}, Lo0/u;->getView()Landroid/view/View;

    move-result-object p0

    const v2, 0x7f0801c9

    invoke-virtual {p0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    instance-of v4, p0, Lo0/b1;

    if-eqz v4, :cond_4

    move-object v3, p0

    check-cast v3, Lo0/b1;

    :cond_4
    if-nez v3, :cond_5

    new-instance v3, Lo0/b1;

    invoke-direct {v3, v0, v1}, Lo0/b1;-><init>(Lo0/u;LD/t;)V

    invoke-virtual {v0}, Lo0/u;->getView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_5
    invoke-virtual {v3, p2}, Lo0/b1;->f(LL/a;)V

    invoke-virtual {v0}, Lo0/u;->getCoroutineContext()Lg2/i;

    move-result-object p0

    check-cast p1, LD/v0;

    iget-object p1, p1, LD/v0;->t:Lg2/i;

    invoke-static {p0, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    invoke-virtual {v0, p1}, Lo0/u;->setCoroutineContext(Lg2/i;)V

    :cond_6
    return-object v3
.end method
