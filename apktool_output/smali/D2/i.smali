.class public final LD2/i;
.super Ly2/r;
.source "SourceFile"

# interfaces
.implements Ly2/y;


# static fields
.field public static final k:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final f:LF2/l;

.field public final g:I

.field public final synthetic h:Ly2/y;

.field public final i:LD2/l;

.field public final j:Ljava/lang/Object;

.field private volatile runningWorkers:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, LD2/i;

    const-string v1, "runningWorkers"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LD2/i;->k:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(LF2/l;I)V
    .locals 0

    invoke-direct {p0}, Ly2/r;-><init>()V

    iput-object p1, p0, LD2/i;->f:LF2/l;

    iput p2, p0, LD2/i;->g:I

    instance-of p2, p1, Ly2/y;

    if-eqz p2, :cond_0

    check-cast p1, Ly2/y;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    sget-object p1, Ly2/x;->a:Ly2/y;

    :cond_1
    iput-object p1, p0, LD2/i;->h:Ly2/y;

    new-instance p1, LD2/l;

    invoke-direct {p1}, LD2/l;-><init>()V

    iput-object p1, p0, LD2/i;->i:LD2/l;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD2/i;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(JLy2/f;)V
    .locals 1

    iget-object v0, p0, LD2/i;->h:Ly2/y;

    invoke-interface {v0, p1, p2, p3}, Ly2/y;->c(JLy2/f;)V

    return-void
.end method

.method public final d(Lg2/i;Ljava/lang/Runnable;)V
    .locals 2

    iget-object p1, p0, LD2/i;->i:LD2/l;

    invoke-virtual {p1, p2}, LD2/l;->a(Ljava/lang/Runnable;)Z

    sget-object p1, LD2/i;->k:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p1

    iget p2, p0, LD2/i;->g:I

    if-ge p1, p2, :cond_2

    iget-object p1, p0, LD2/i;->j:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    sget-object p2, LD2/i;->k:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, LD2/i;->g:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v0, v1, :cond_0

    monitor-exit p1

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p1

    const/4 p1, 0x1

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, LD2/i;->j()Ljava/lang/Runnable;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p2, LD2/h;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, p1}, LD2/h;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object p1, p0, LD2/i;->f:LF2/l;

    invoke-virtual {p1, p0, p2}, LF2/l;->d(Lg2/i;Ljava/lang/Runnable;)V

    goto :goto_1

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_2
    :goto_1
    return-void
.end method

.method public final j()Ljava/lang/Runnable;
    .locals 3

    :goto_0
    iget-object v0, p0, LD2/i;->i:LD2/l;

    invoke-virtual {v0}, LD2/l;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-nez v0, :cond_1

    iget-object v0, p0, LD2/i;->j:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LD2/i;->k:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    iget-object v2, p0, LD2/i;->i:LD2/l;

    invoke-virtual {v2}, LD2/l;->c()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_1
    return-object v0
.end method
