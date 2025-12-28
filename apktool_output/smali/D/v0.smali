.class public final LD/v0;
.super LD/q;
.source "SourceFile"


# static fields
.field public static final v:LB2/G;

.field public static final w:Ljava/util/concurrent/atomic/AtomicReference;


# instance fields
.field public final a:LD/h;

.field public final b:Ljava/lang/Object;

.field public c:Ly2/S;

.field public d:Ljava/lang/Throwable;

.field public final e:Ljava/util/ArrayList;

.field public f:Ljava/lang/Object;

.field public g:Ln/B;

.field public final h:LF/d;

.field public final i:Ljava/util/ArrayList;

.field public final j:Ljava/util/ArrayList;

.field public final k:Ljava/util/LinkedHashMap;

.field public final l:Ljava/util/LinkedHashMap;

.field public m:Ljava/util/ArrayList;

.field public n:Ljava/util/LinkedHashSet;

.field public o:Ly2/f;

.field public p:LA/t;

.field public q:Z

.field public final r:LB2/G;

.field public final s:Ly2/V;

.field public final t:Lg2/i;

.field public final u:LD/U;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LJ/b;->g:LJ/b;

    new-instance v1, LB2/G;

    if-nez v0, :cond_0

    sget-object v0, LC2/c;->b:LD2/w;

    :cond_0
    invoke-direct {v1, v0}, LB2/G;-><init>(Ljava/lang/Object;)V

    sput-object v1, LD/v0;->v:LB2/G;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, LD/v0;->w:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>(Lg2/i;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LD/h;

    new-instance v1, LA0/c;

    const/4 v2, 0x4

    invoke-direct {v1, v2, p0}, LA0/c;-><init>(ILjava/lang/Object;)V

    invoke-direct {v0, v1}, LD/h;-><init>(LA0/c;)V

    iput-object v0, p0, LD/v0;->a:LD/h;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, LD/v0;->b:Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LD/v0;->e:Ljava/util/ArrayList;

    new-instance v1, Ln/B;

    invoke-direct {v1}, Ln/B;-><init>()V

    iput-object v1, p0, LD/v0;->g:Ln/B;

    new-instance v1, LF/d;

    const/16 v2, 0x10

    new-array v2, v2, [LD/t;

    invoke-direct {v1, v2}, LF/d;-><init>([Ljava/lang/Object;)V

    iput-object v1, p0, LD/v0;->h:LF/d;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LD/v0;->i:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LD/v0;->j:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, LD/v0;->k:Ljava/util/LinkedHashMap;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, LD/v0;->l:Ljava/util/LinkedHashMap;

    sget-object v1, LD/o0;->f:LD/o0;

    new-instance v2, LB2/G;

    invoke-direct {v2, v1}, LB2/G;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, LD/v0;->r:LB2/G;

    sget-object v1, Ly2/s;->e:Ly2/s;

    invoke-interface {p1, v1}, Lg2/i;->n(Lg2/h;)Lg2/g;

    move-result-object v1

    check-cast v1, Ly2/S;

    new-instance v2, Ly2/V;

    invoke-direct {v2, v1}, Ly2/V;-><init>(Ly2/S;)V

    new-instance v1, LD/y;

    const/4 v3, 0x1

    invoke-direct {v1, v3, p0}, LD/y;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v1}, Ly2/b0;->q(Lo2/c;)Ly2/C;

    iput-object v2, p0, LD/v0;->s:Ly2/V;

    invoke-interface {p1, v0}, Lg2/i;->i(Lg2/i;)Lg2/i;

    move-result-object p1

    invoke-interface {p1, v2}, Lg2/i;->i(Lg2/i;)Lg2/i;

    move-result-object p1

    iput-object p1, p0, LD/v0;->t:Lg2/i;

    new-instance p1, LD/U;

    const/4 v0, 0x7

    invoke-direct {p1, v0}, LD/U;-><init>(I)V

    iput-object p1, p0, LD/v0;->u:LD/U;

    return-void
.end method

.method public static final a(LD/v0;LD/t;Ln/B;)LD/t;
    .locals 5

    iget-object v0, p1, LD/t;->t:LD/n;

    iget-boolean v0, v0, LD/n;->C:Z

    const/4 v1, 0x0

    if-nez v0, :cond_6

    iget-boolean v0, p1, LD/t;->u:Z

    if-nez v0, :cond_6

    iget-object p0, p0, LD/v0;->n:Ljava/util/LinkedHashSet;

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-ne p0, v0, :cond_0

    goto/16 :goto_4

    :cond_0
    new-instance p0, LD/y;

    const/4 v2, 0x2

    invoke-direct {p0, v2, p1}, LD/y;-><init>(ILjava/lang/Object;)V

    new-instance v2, LD/g;

    const/4 v3, 0x3

    invoke-direct {v2, p1, v3, p2}, LD/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v3

    instance-of v4, v3, LN/c;

    if-eqz v4, :cond_1

    check-cast v3, LN/c;

    goto :goto_0

    :cond_1
    move-object v3, v1

    :goto_0
    if-eqz v3, :cond_5

    invoke-virtual {v3, p0, v2}, LN/c;->B(Lo2/c;Lo2/c;)LN/c;

    move-result-object p0

    if-eqz p0, :cond_5

    :try_start_0
    invoke-virtual {p0}, LN/h;->j()LN/h;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz p2, :cond_3

    :try_start_1
    invoke-virtual {p2}, Ln/B;->h()Z

    move-result v3

    if-ne v3, v0, :cond_3

    new-instance v3, LD/q0;

    const/4 v4, 0x0

    invoke-direct {v3, p2, v4, p1}, LD/q0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object p2, p1, LD/t;->t:LD/n;

    iget-boolean v4, p2, LD/n;->C:Z

    if-nez v4, :cond_2

    iput-boolean v0, p2, LD/n;->C:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v0, 0x0

    :try_start_2
    invoke-virtual {v3}, LD/q0;->c()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iput-boolean v0, p2, LD/n;->C:Z

    goto :goto_1

    :catchall_0
    move-exception p1

    iput-boolean v0, p2, LD/n;->C:Z

    throw p1

    :cond_2
    const-string p1, "Preparing a composition while composing is not supported"

    invoke-static {p1}, LD/d;->r(Ljava/lang/String;)V

    throw v1

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_3
    :goto_1
    invoke-virtual {p1}, LD/t;->r()Z

    move-result p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-static {v2}, LN/h;->p(LN/h;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    invoke-static {p0}, LD/v0;->c(LN/c;)V

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, v1

    :goto_2
    move-object v1, p1

    goto :goto_4

    :goto_3
    :try_start_5
    invoke-static {v2}, LN/h;->p(LN/h;)V

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception p1

    invoke-static {p0}, LD/v0;->c(LN/c;)V

    throw p1

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Cannot create a mutable snapshot of an read-only snapshot"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    :goto_4
    return-object v1
.end method

.method public static final b(LD/v0;)Z
    .locals 8

    iget-object v0, p0, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LD/v0;->g:Ln/B;

    invoke-virtual {v1}, Ln/B;->g()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, LD/v0;->h:LF/d;

    invoke-virtual {v1}, LF/d;->k()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, LD/v0;->f()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    move v2, v3

    :cond_1
    :goto_0
    monitor-exit v0

    goto :goto_3

    :cond_2
    :try_start_1
    iget-object v1, p0, LD/v0;->g:Ln/B;

    new-instance v4, LF/f;

    invoke-direct {v4, v1}, LF/f;-><init>(Ln/B;)V

    new-instance v1, Ln/B;

    invoke-direct {v1}, Ln/B;-><init>()V

    iput-object v1, p0, LD/v0;->g:Ln/B;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    monitor-exit v0

    iget-object v0, p0, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_2
    invoke-virtual {p0}, LD/v0;->h()Ljava/util/List;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    monitor-exit v0

    :try_start_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    move v5, v3

    :goto_1
    if-ge v5, v0, :cond_3

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LD/t;

    invoke-virtual {v6, v4}, LD/t;->s(LF/f;)V

    iget-object v6, p0, LD/v0;->r:LB2/G;

    invoke-virtual {v6}, LB2/G;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LD/o0;

    sget-object v7, LD/o0;->e:LD/o0;

    invoke-virtual {v6, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v6

    if-lez v6, :cond_3

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_3
    iget-object v0, p0, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    new-instance v1, Ln/B;

    invoke-direct {v1}, Ln/B;-><init>()V

    iput-object v1, p0, LD/v0;->g:Ln/B;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    iget-object v0, p0, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_6
    invoke-virtual {p0}, LD/v0;->e()Ly2/e;

    move-result-object v1

    if-nez v1, :cond_6

    iget-object v1, p0, LD/v0;->h:LF/d;

    invoke-virtual {v1}, LF/d;->k()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {p0}, LD/v0;->f()Z

    move-result p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz p0, :cond_4

    goto :goto_2

    :cond_4
    move v2, v3

    :cond_5
    :goto_2
    monitor-exit v0

    :goto_3
    return v2

    :cond_6
    :try_start_7
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "called outside of runRecomposeAndApplyChanges"

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0

    :catchall_2
    move-exception v1

    :try_start_8
    monitor-exit v0

    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_4
    iget-object v1, p0, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_9
    iget-object p0, p0, LD/v0;->g:Ln/B;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v3}, Ln/B;->d(Ljava/lang/Object;)I

    move-result v4

    iget-object v5, p0, Ln/B;->b:[Ljava/lang/Object;

    aput-object v3, v5, v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_5

    :cond_7
    monitor-exit v1

    throw v0

    :catchall_3
    move-exception p0

    monitor-exit v1

    throw p0

    :catchall_4
    move-exception p0

    monitor-exit v0

    throw p0

    :catchall_5
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static c(LN/c;)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, LN/c;->v()LN/t;

    move-result-object v0

    instance-of v0, v0, LN/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LN/c;->c()V

    return-void

    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, LN/c;->c()V

    throw v0
.end method

.method public static final i(Ljava/util/ArrayList;LD/v0;LD/t;)V
    .locals 0

    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    iget-object p0, p1, LD/v0;->b:Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    iget-object p1, p1, LD/v0;->j:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LD/X;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static synthetic l(LD/v0;Ljava/lang/Exception;ZI)V
    .locals 0

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    const/4 p3, 0x0

    invoke-virtual {p0, p1, p3, p2}, LD/v0;->k(Ljava/lang/Exception;LD/t;Z)V

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 4

    iget-object v0, p0, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LD/v0;->r:LB2/G;

    invoke-virtual {v1}, LB2/G;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD/o0;

    sget-object v2, LD/o0;->h:LD/o0;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    const/4 v2, 0x0

    if-ltz v1, :cond_0

    iget-object v1, p0, LD/v0;->r:LB2/G;

    sget-object v3, LD/o0;->e:LD/o0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v3}, LB2/G;->g(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    iget-object v0, p0, LD/v0;->s:Ly2/V;

    invoke-virtual {v0, v2}, Ly2/b0;->a(Ljava/util/concurrent/CancellationException;)V

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final e()Ly2/e;
    .locals 8

    iget-object v0, p0, LD/v0;->r:LB2/G;

    invoke-virtual {v0}, LB2/G;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD/o0;

    sget-object v2, LD/o0;->e:LD/o0;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    iget-object v2, p0, LD/v0;->j:Ljava/util/ArrayList;

    iget-object v3, p0, LD/v0;->i:Ljava/util/ArrayList;

    iget-object v4, p0, LD/v0;->h:LF/d;

    const/4 v5, 0x0

    if-gtz v1, :cond_1

    iget-object v0, p0, LD/v0;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v0, Ld2/s;->d:Ld2/s;

    iput-object v0, p0, LD/v0;->f:Ljava/lang/Object;

    new-instance v0, Ln/B;

    invoke-direct {v0}, Ln/B;-><init>()V

    iput-object v0, p0, LD/v0;->g:Ln/B;

    invoke-virtual {v4}, LF/d;->g()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    iput-object v5, p0, LD/v0;->m:Ljava/util/ArrayList;

    iget-object v0, p0, LD/v0;->o:Ly2/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v5}, Ly2/f;->n(Ljava/lang/Throwable;)Z

    :cond_0
    iput-object v5, p0, LD/v0;->o:Ly2/f;

    iput-object v5, p0, LD/v0;->p:LA/t;

    return-object v5

    :cond_1
    iget-object v1, p0, LD/v0;->p:LA/t;

    sget-object v6, LD/o0;->i:LD/o0;

    sget-object v7, LD/o0;->f:LD/o0;

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, LD/v0;->c:Ly2/S;

    if-nez v1, :cond_3

    new-instance v1, Ln/B;

    invoke-direct {v1}, Ln/B;-><init>()V

    iput-object v1, p0, LD/v0;->g:Ln/B;

    invoke-virtual {v4}, LF/d;->g()V

    invoke-virtual {p0}, LD/v0;->f()Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v7, LD/o0;->g:LD/o0;

    goto :goto_1

    :cond_3
    invoke-virtual {v4}, LF/d;->k()Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, LD/v0;->g:Ln/B;

    invoke-virtual {v1}, Ln/B;->h()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, LD/v0;->f()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    sget-object v7, LD/o0;->h:LD/o0;

    goto :goto_1

    :cond_5
    :goto_0
    move-object v7, v6

    :cond_6
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v5, v7}, LB2/G;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    if-ne v7, v6, :cond_7

    iget-object v0, p0, LD/v0;->o:Ly2/f;

    iput-object v5, p0, LD/v0;->o:Ly2/f;

    move-object v5, v0

    :cond_7
    return-object v5
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, LD/v0;->q:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LD/v0;->a:LD/h;

    iget-object v0, v0, LD/h;->i:LD/e;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final g()Z
    .locals 2

    iget-object v0, p0, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LD/v0;->g:Ln/B;

    invoke-virtual {v1}, Ln/B;->h()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, LD/v0;->h:LF/d;

    invoke-virtual {v1}, LF/d;->k()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, LD/v0;->f()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :goto_2
    monitor-exit v0

    throw v1
.end method

.method public final h()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LD/v0;->f:Ljava/lang/Object;

    if-nez v0, :cond_1

    iget-object v0, p0, LD/v0;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Ld2/s;->d:Ld2/s;

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object v0, v1

    :goto_0
    iput-object v0, p0, LD/v0;->f:Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public final j(Ljava/util/List;Ln/B;)Ljava/util/List;
    .locals 17

    move-object/from16 v1, p0

    new-instance v0, Ljava/util/HashMap;

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    move-object/from16 v5, p1

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, LD/X;

    const/4 v8, 0x0

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_0

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LD/t;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    iget-object v6, v5, LD/t;->t:LD/n;

    iget-boolean v6, v6, LD/n;->C:Z

    xor-int/lit8 v6, v6, 0x1

    invoke-static {v6}, LD/d;->E(Z)V

    new-instance v6, LD/y;

    const/4 v7, 0x2

    invoke-direct {v6, v7, v5}, LD/y;-><init>(ILjava/lang/Object;)V

    new-instance v7, LD/g;

    const/4 v8, 0x3

    move-object/from16 v9, p2

    invoke-direct {v7, v5, v8, v9}, LD/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v8

    instance-of v10, v8, LN/c;

    const/4 v11, 0x0

    if-eqz v10, :cond_2

    check-cast v8, LN/c;

    goto :goto_2

    :cond_2
    move-object v8, v11

    :goto_2
    if-eqz v8, :cond_e

    invoke-virtual {v8, v6, v7}, LN/c;->B(Lo2/c;Lo2/c;)LN/c;

    move-result-object v6

    if-eqz v6, :cond_e

    :try_start_0
    invoke-virtual {v6}, LN/h;->j()LN/h;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    iget-object v8, v1, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    new-instance v10, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v12

    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v12

    move v13, v3

    :goto_3
    if-ge v13, v12, :cond_6

    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LD/X;

    iget-object v15, v1, LD/v0;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v15, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v11, v16

    check-cast v11, Ljava/util/List;

    if-eqz v11, :cond_5

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v16

    if-nez v16, :cond_4

    invoke-interface {v11, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v16

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_3

    const/4 v11, 0x0

    invoke-interface {v15, v11}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_3
    const/4 v11, 0x0

    :goto_4
    move-object/from16 v15, v16

    goto :goto_5

    :cond_4
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v2, "List is empty."

    invoke-direct {v0, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    const/4 v11, 0x0

    move-object v15, v11

    :goto_5
    new-instance v3, Lc2/g;

    invoke-direct {v3, v14, v15}, Lc2/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    add-int/lit8 v13, v13, 0x1

    const/4 v3, 0x0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_c

    :cond_6
    :try_start_3
    monitor-exit v8

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_6
    if-ge v4, v3, :cond_d

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lc2/g;

    iget-object v8, v8, Lc2/g;->e:Ljava/lang/Object;

    if-nez v8, :cond_7

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_7
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_7
    if-ge v4, v3, :cond_d

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lc2/g;

    iget-object v8, v8, Lc2/g;->e:Ljava/lang/Object;

    if-eqz v8, :cond_8

    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_8
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v8, 0x0

    :goto_8
    if-ge v8, v4, :cond_a

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lc2/g;

    iget-object v12, v11, Lc2/g;->e:Ljava/lang/Object;

    if-nez v12, :cond_9

    iget-object v11, v11, Lc2/g;->d:Ljava/lang/Object;

    check-cast v11, LD/X;

    goto :goto_9

    :catchall_1
    move-exception v0

    goto :goto_d

    :cond_9
    :goto_9
    add-int/lit8 v8, v8, 0x1

    goto :goto_8

    :cond_a
    iget-object v4, v1, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    iget-object v8, v1, LD/v0;->j:Ljava/util/ArrayList;

    invoke-static {v8, v3}, Ld2/q;->Y(Ljava/util/ArrayList;Ljava/lang/Iterable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    monitor-exit v4

    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v8, 0x0

    :goto_a
    if-ge v8, v4, :cond_c

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lc2/g;

    iget-object v12, v12, Lc2/g;->e:Ljava/lang/Object;

    if-eqz v12, :cond_b

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    add-int/lit8 v8, v8, 0x1

    goto :goto_a

    :cond_c
    move-object v10, v3

    goto :goto_b

    :catchall_2
    move-exception v0

    monitor-exit v4

    throw v0

    :cond_d
    :goto_b
    invoke-virtual {v5, v10}, LD/t;->l(Ljava/util/ArrayList;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    invoke-static {v7}, LN/h;->p(LN/h;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    invoke-static {v6}, LD/v0;->c(LN/c;)V

    const/4 v3, 0x0

    goto/16 :goto_1

    :goto_c
    :try_start_7
    monitor-exit v8

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :goto_d
    :try_start_8
    invoke-static {v7}, LN/h;->p(LN/h;)V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :catchall_3
    move-exception v0

    invoke-static {v6}, LD/v0;->c(LN/c;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot create a mutable snapshot of an read-only snapshot"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Ld2/k;->i0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final k(Ljava/lang/Exception;LD/t;Z)V
    .locals 3

    const/4 p3, 0x5

    sget-object v0, LD/v0;->w:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p1, LD/k;

    if-nez v0, :cond_1

    iget-object v0, p0, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "Error was captured in composition while live edit was enabled."

    sget v2, LD/b;->b:I

    const-string v2, "ComposeInternal"

    invoke-static {v2, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v1, p0, LD/v0;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, LD/v0;->h:LF/d;

    invoke-virtual {v1}, LF/d;->g()V

    new-instance v1, Ln/B;

    invoke-direct {v1}, Ln/B;-><init>()V

    iput-object v1, p0, LD/v0;->g:Ln/B;

    iget-object v1, p0, LD/v0;->j:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, LD/v0;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    iget-object v1, p0, LD/v0;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    new-instance v1, LA/t;

    invoke-direct {v1, p3, p1}, LA/t;-><init>(ILjava/lang/Object;)V

    iput-object v1, p0, LD/v0;->p:LA/t;

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, LD/v0;->m(LD/t;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p0}, LD/v0;->e()Ly2/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1

    :cond_1
    iget-object p2, p0, LD/v0;->b:Ljava/lang/Object;

    monitor-enter p2

    :try_start_1
    iget-object v0, p0, LD/v0;->p:LA/t;

    if-nez v0, :cond_2

    new-instance v0, LA/t;

    invoke-direct {v0, p3, p1}, LA/t;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, LD/v0;->p:LA/t;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p2

    throw p1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_2
    :try_start_2
    iget-object p1, v0, LA/t;->e:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Exception;

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_2
    monitor-exit p2

    throw p1
.end method

.method public final m(LD/t;)V
    .locals 2

    iget-object v0, p0, LD/v0;->m:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LD/v0;->m:Ljava/util/ArrayList;

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v0, p0, LD/v0;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    iput-object p1, p0, LD/v0;->f:Ljava/lang/Object;

    return-void
.end method
