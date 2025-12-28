.class public final LN/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lo0/r;

.field public final b:Ljava/util/concurrent/atomic/AtomicReference;

.field public c:Z

.field public final d:LA/i;

.field public final e:LD/y;

.field public final f:LF/d;

.field public g:LN/g;

.field public h:LN/u;

.field public i:J


# direct methods
.method public constructor <init>(Lo0/r;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN/v;->a:Lo0/r;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LN/v;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, LA/i;

    const/4 v0, 0x5

    invoke-direct {p1, v0, p0}, LA/i;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, LN/v;->d:LA/i;

    new-instance p1, LD/y;

    const/4 v0, 0x6

    invoke-direct {p1, v0, p0}, LD/y;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, LN/v;->e:LD/y;

    new-instance p1, LF/d;

    const/16 v0, 0x10

    new-array v0, v0, [LN/u;

    invoke-direct {p1, v0}, LF/d;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, LN/v;->f:LF/d;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LN/v;->i:J

    return-void
.end method

.method public static final a(LN/v;)Z
    .locals 10

    iget-object v0, p0, LN/v;->f:LF/d;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LN/v;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    const/4 v0, 0x0

    if-eqz v1, :cond_0

    goto :goto_4

    :cond_0
    move v1, v0

    :goto_0
    iget-object v2, p0, LN/v;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_1

    goto :goto_3

    :cond_1
    instance-of v6, v3, Ljava/util/Set;

    if-eqz v6, :cond_3

    move-object v6, v3

    check-cast v6, Ljava/util/Set;

    move-object v7, v6

    :cond_2
    :goto_1
    move-object v6, v4

    goto :goto_2

    :cond_3
    instance-of v6, v3, Ljava/util/List;

    if-eqz v6, :cond_c

    move-object v6, v3

    check-cast v6, Ljava/util/List;

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Set;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x2

    if-ne v8, v9, :cond_4

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    goto :goto_1

    :cond_4
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    if-le v8, v9, :cond_2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v6, v5, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    goto :goto_1

    :cond_5
    :goto_2
    invoke-virtual {v2, v3, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    move-object v4, v7

    :goto_3
    if-nez v4, :cond_6

    move v0, v1

    :goto_4
    return v0

    :cond_6
    iget-object v2, p0, LN/v;->f:LF/d;

    monitor-enter v2

    :try_start_1
    iget-object v3, p0, LN/v;->f:LF/d;

    iget v6, v3, LF/d;->f:I

    if-lez v6, :cond_a

    iget-object v3, v3, LF/d;->d:[Ljava/lang/Object;

    move v7, v0

    :cond_7
    aget-object v8, v3, v7

    check-cast v8, LN/u;

    invoke-virtual {v8, v4}, LN/u;->b(Ljava/util/Set;)Z

    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v8, :cond_9

    if-eqz v1, :cond_8

    goto :goto_5

    :cond_8
    move v1, v0

    goto :goto_6

    :cond_9
    :goto_5
    move v1, v5

    :goto_6
    add-int/lit8 v7, v7, 0x1

    if-lt v7, v6, :cond_7

    goto :goto_7

    :catchall_0
    move-exception p0

    goto :goto_8

    :cond_a
    :goto_7
    monitor-exit v2

    goto :goto_0

    :goto_8
    monitor-exit v2

    throw p0

    :cond_b
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v3, :cond_5

    goto :goto_0

    :cond_c
    const-string p0, "Unexpected notification"

    invoke-static {p0}, LD/d;->s(Ljava/lang/String;)V

    throw v4

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method
