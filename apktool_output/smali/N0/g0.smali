.class public final Ln0/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LN/v;

.field public final b:Ln0/J;

.field public final c:Ln0/J;

.field public final d:Ln0/J;

.field public final e:Ln0/J;

.field public final f:Ln0/J;

.field public final g:Ln0/J;

.field public final h:Ln0/J;


# direct methods
.method public constructor <init>(Lo0/r;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LN/v;

    invoke-direct {v0, p1}, LN/v;-><init>(Lo0/r;)V

    iput-object v0, p0, Ln0/g0;->a:LN/v;

    sget-object p1, Ln0/J;->o:Ln0/J;

    iput-object p1, p0, Ln0/g0;->b:Ln0/J;

    sget-object p1, Ln0/J;->p:Ln0/J;

    iput-object p1, p0, Ln0/g0;->c:Ln0/J;

    sget-object p1, Ln0/J;->q:Ln0/J;

    iput-object p1, p0, Ln0/g0;->d:Ln0/J;

    sget-object p1, Ln0/J;->k:Ln0/J;

    iput-object p1, p0, Ln0/g0;->e:Ln0/J;

    sget-object p1, Ln0/J;->l:Ln0/J;

    iput-object p1, p0, Ln0/g0;->f:Ln0/J;

    sget-object p1, Ln0/J;->m:Ln0/J;

    iput-object p1, p0, Ln0/g0;->g:Ln0/J;

    sget-object p1, Ln0/J;->n:Ln0/J;

    iput-object p1, p0, Ln0/g0;->h:Ln0/J;

    return-void
.end method


# virtual methods
.method public final a(Ln0/f0;Lo2/c;Lo2/a;)V
    .locals 9

    iget-object v0, p0, Ln0/g0;->a:LN/v;

    iget-object v1, v0, LN/v;->f:LF/d;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, LN/v;->f:LF/d;

    iget v3, v2, LF/d;->f:I

    const/4 v4, 0x0

    if-lez v3, :cond_2

    iget-object v5, v2, LF/d;->d:[Ljava/lang/Object;

    const/4 v6, 0x0

    :cond_0
    aget-object v7, v5, v6

    move-object v8, v7

    check-cast v8, LN/u;

    iget-object v8, v8, LN/u;->a:Lo2/c;

    if-ne v8, p2, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit8 v6, v6, 0x1

    if-lt v6, v3, :cond_0

    :cond_2
    move-object v7, v4

    :goto_0
    check-cast v7, LN/u;

    if-nez v7, :cond_3

    new-instance v7, LN/u;

    const-string v3, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>"

    invoke-static {p2, v3}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-static {v3, p2}, Lp2/r;->c(ILjava/lang/Object;)V

    invoke-direct {v7, p2}, LN/u;-><init>(Lo2/c;)V

    invoke-virtual {v2, v7}, LF/d;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_3
    monitor-exit v1

    iget-object p2, v0, LN/v;->h:LN/u;

    iget-wide v1, v0, LN/v;->i:J

    const-wide/16 v5, -0x1

    cmp-long v3, v1, v5

    if-eqz v3, :cond_5

    invoke-static {}, LD/d;->u()J

    move-result-wide v5

    cmp-long v3, v1, v5

    if-nez v3, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Detected multithreaded access to SnapshotStateObserver: previousThreadId="

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, "), currentThread={id="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, LD/d;->u()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, ", name="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LD/d;->H(Ljava/lang/String;)V

    throw v4

    :cond_5
    :goto_1
    :try_start_1
    iput-object v7, v0, LN/v;->h:LN/u;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getId()J

    move-result-wide v3

    iput-wide v3, v0, LN/v;->i:J

    iget-object v3, v0, LN/v;->e:LD/y;

    invoke-virtual {v7, p1, v3, p3}, LN/u;->a(Ln0/f0;LD/y;Lo2/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-object p2, v0, LN/v;->h:LN/u;

    iput-wide v1, v0, LN/v;->i:J

    return-void

    :catchall_0
    move-exception p1

    iput-object p2, v0, LN/v;->h:LN/u;

    iput-wide v1, v0, LN/v;->i:J

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v1

    throw p1
.end method
