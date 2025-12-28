.class public abstract LB2/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD2/w;

.field public static final b:LD2/w;

.field public static final c:LD2/w;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, LD2/w;

    const-string v1, "NO_VALUE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LB2/w;->a:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LB2/w;->b:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "PENDING"

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LB2/w;->c:LD2/w;

    return-void
.end method

.method public static final a([Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 0

    long-to-int p1, p1

    array-length p2, p0

    add-int/lit8 p2, p2, -0x1

    and-int/2addr p1, p2

    aput-object p3, p0, p1

    return-void
.end method

.method public static final b(LB2/e;)LB2/e;
    .locals 1

    instance-of v0, p0, LB2/E;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p0, LB2/d;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, LB2/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    new-instance v0, LB2/d;

    invoke-direct {v0, p0}, LB2/d;-><init>(LB2/e;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static final c(LB2/f;LA2/n;ZLi2/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p3, LB2/g;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LB2/g;

    iget v1, v0, LB2/g;->l:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LB2/g;->l:I

    goto :goto_0

    :cond_0
    new-instance v0, LB2/g;

    invoke-direct {v0, p3}, Li2/c;-><init>(Lg2/d;)V

    :goto_0
    iget-object p3, v0, LB2/g;->k:Ljava/lang/Object;

    sget-object v1, Lh2/a;->d:Lh2/a;

    iget v2, v0, LB2/g;->l:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-ne v2, v4, :cond_2

    iget-boolean p2, v0, LB2/g;->j:Z

    iget-object p0, v0, LB2/g;->i:LA2/a;

    iget-object p1, v0, LB2/g;->h:LA2/p;

    iget-object v2, v0, LB2/g;->g:LB2/f;

    :try_start_0
    invoke-static {p3}, LZ0/d;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    move-object v6, v2

    move-object v2, p0

    move-object p0, v6

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    iget-boolean p2, v0, LB2/g;->j:Z

    iget-object p0, v0, LB2/g;->i:LA2/a;

    iget-object p1, v0, LB2/g;->h:LA2/p;

    iget-object v2, v0, LB2/g;->g:LB2/f;

    :try_start_1
    invoke-static {p3}, LZ0/d;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_4
    invoke-static {p3}, LZ0/d;->U(Ljava/lang/Object;)V

    :try_start_2
    iget-object p3, p1, LA2/n;->g:LA2/b;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, LA2/a;

    invoke-direct {v2, p3}, LA2/a;-><init>(LA2/b;)V

    :goto_1
    iput-object p0, v0, LB2/g;->g:LB2/f;

    iput-object p1, v0, LB2/g;->h:LA2/p;

    iput-object v2, v0, LB2/g;->i:LA2/a;

    iput-boolean p2, v0, LB2/g;->j:Z

    iput v5, v0, LB2/g;->l:I

    invoke-virtual {v2, v0}, LA2/a;->b(Li2/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    return-object v1

    :cond_5
    move-object v6, v2

    move-object v2, p0

    move-object p0, v6

    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-virtual {p0}, LA2/a;->c()Ljava/lang/Object;

    move-result-object p3

    iput-object v2, v0, LB2/g;->g:LB2/f;

    iput-object p1, v0, LB2/g;->h:LA2/p;

    iput-object p0, v0, LB2/g;->i:LA2/a;

    iput-boolean p2, v0, LB2/g;->j:Z

    iput v4, v0, LB2/g;->l:I

    invoke-interface {v2, p3, v0}, LB2/f;->b(Ljava/lang/Object;Lg2/d;)Ljava/lang/Object;

    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne p3, v1, :cond_1

    return-object v1

    :cond_6
    if-eqz p2, :cond_7

    invoke-interface {p1, v3}, LA2/p;->a(Ljava/util/concurrent/CancellationException;)V

    :cond_7
    sget-object p0, Lc2/m;->a:Lc2/m;

    return-object p0

    :goto_3
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p3

    if-eqz p2, :cond_a

    instance-of p2, p0, Ljava/util/concurrent/CancellationException;

    if-eqz p2, :cond_8

    move-object v3, p0

    check-cast v3, Ljava/util/concurrent/CancellationException;

    :cond_8
    if-nez v3, :cond_9

    new-instance v3, Ljava/util/concurrent/CancellationException;

    const-string p2, "Channel was consumed, consumer had failed"

    invoke-direct {v3, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_9
    invoke-interface {p1, v3}, LA2/p;->a(Ljava/util/concurrent/CancellationException;)V

    :cond_a
    throw p3
.end method

.method public static final d(LB2/e;Lo2/e;Li2/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, LB2/o;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LB2/o;

    iget v1, v0, LB2/o;->k:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LB2/o;->k:I

    goto :goto_0

    :cond_0
    new-instance v0, LB2/o;

    invoke-direct {v0, p2}, Li2/c;-><init>(Lg2/d;)V

    :goto_0
    iget-object p2, v0, LB2/o;->j:Ljava/lang/Object;

    sget-object v1, Lh2/a;->d:Lh2/a;

    iget v2, v0, LB2/o;->k:I

    sget-object v3, LC2/c;->b:LD2/w;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, LB2/o;->i:LB2/n;

    iget-object p1, v0, LB2/o;->h:Lp2/o;

    iget-object v0, v0, LB2/o;->g:Lo2/e;

    :try_start_0
    invoke-static {p2}, LZ0/d;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch LC2/a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LZ0/d;->U(Ljava/lang/Object;)V

    new-instance p2, Lp2/o;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object v3, p2, Lp2/o;->d:Ljava/lang/Object;

    new-instance v2, LB2/n;

    invoke-direct {v2, p1, p2}, LB2/n;-><init>(Lo2/e;Lp2/o;)V

    :try_start_1
    iput-object p1, v0, LB2/o;->g:Lo2/e;

    iput-object p2, v0, LB2/o;->h:Lp2/o;

    iput-object v2, v0, LB2/o;->i:LB2/n;

    iput v4, v0, LB2/o;->k:I

    invoke-interface {p0, v2, v0}, LB2/e;->o(LB2/f;Lg2/d;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch LC2/a; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    goto :goto_3

    :cond_3
    move-object v0, p1

    move-object p1, p2

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v0, p1

    move-object p1, p2

    move-object p2, p0

    move-object p0, v2

    :goto_1
    iget-object v1, p2, LC2/a;->d:LB2/n;

    if-ne v1, p0, :cond_5

    :goto_2
    iget-object v1, p1, Lp2/o;->d:Ljava/lang/Object;

    if-eq v1, v3, :cond_4

    :goto_3
    return-object v1

    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Expected at least one element matching the predicate "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    throw p2
.end method

.method public static final e(LA/t;LD2/d;LB2/D;Ljava/lang/Float;)LB2/s;
    .locals 10

    const/4 v0, 0x1

    sget-object v1, LA2/f;->a:LA2/e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, LA2/e;->a:LA2/e;

    new-instance v1, LB2/i;

    sget-object v2, Lg2/j;->d:Lg2/j;

    invoke-direct {v1, p0, v0, v2}, LB2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    new-instance p0, LB2/G;

    invoke-direct {p0, p3}, LB2/G;-><init>(Ljava/lang/Object;)V

    sget-object v2, LB2/z;->a:LB2/A;

    invoke-virtual {p2, v2}, LB2/D;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    const/4 v2, 0x4

    :goto_0
    new-instance v9, LB2/r;

    iget-object v3, v1, LB2/i;->e:Ljava/lang/Object;

    move-object v5, v3

    check-cast v5, LB2/e;

    const/4 v8, 0x0

    move-object v3, v9

    move-object v4, p2

    move-object v6, p0

    move-object v7, p3

    invoke-direct/range {v3 .. v8}, LB2/r;-><init>(LB2/D;LB2/e;LB2/G;Ljava/lang/Float;Lg2/d;)V

    invoke-virtual {p1}, LD2/d;->m()Lg2/i;

    move-result-object p1

    iget-object p2, v1, LB2/i;->f:Ljava/lang/Object;

    check-cast p2, Lg2/i;

    invoke-static {p1, p2, v0}, Ly2/v;->e(Lg2/i;Lg2/i;Z)Lg2/i;

    move-result-object p1

    sget-object p2, Ly2/B;->a:LF2/d;

    if-eq p1, p2, :cond_1

    sget-object p3, Lg2/e;->d:Lg2/e;

    invoke-interface {p1, p3}, Lg2/i;->n(Lg2/h;)Lg2/g;

    move-result-object p3

    if-nez p3, :cond_1

    invoke-interface {p1, p2}, Lg2/i;->i(Lg2/i;)Lg2/i;

    move-result-object p1

    :cond_1
    if-eqz v2, :cond_3

    const/4 p2, 0x2

    if-ne v2, p2, :cond_2

    new-instance p2, Ly2/c0;

    invoke-direct {p2, p1, v9}, Ly2/c0;-><init>(Lg2/i;Lo2/e;)V

    goto :goto_1

    :cond_2
    new-instance p2, Ly2/h0;

    invoke-direct {p2, p1, v0}, Ly2/a;-><init>(Lg2/i;Z)V

    :goto_1
    invoke-virtual {p2, v2, p2, v9}, Ly2/a;->c0(ILy2/a;Lo2/e;)V

    new-instance p1, LB2/s;

    invoke-direct {p1, p0}, LB2/s;-><init>(LB2/G;)V

    return-object p1

    :cond_3
    const/4 p0, 0x0

    throw p0
.end method
