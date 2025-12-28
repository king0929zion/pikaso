.class public final LN/q;
.super LN/A;
.source "SourceFile"


# instance fields
.field public c:LH/c;

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(LH/c;)V
    .locals 0

    invoke-direct {p0}, LN/A;-><init>()V

    iput-object p1, p0, LN/q;->c:LH/c;

    return-void
.end method


# virtual methods
.method public final a(LN/A;)V
    .locals 2

    sget-object v0, LN/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>"

    invoke-static {p1, v1}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, LN/q;

    iget-object v1, v1, LN/q;->c:LH/c;

    iput-object v1, p0, LN/q;->c:LH/c;

    move-object v1, p1

    check-cast v1, LN/q;

    iget v1, v1, LN/q;->d:I

    iput v1, p0, LN/q;->d:I

    check-cast p1, LN/q;

    iget p1, p1, LN/q;->e:I

    iput p1, p0, LN/q;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final b()LN/A;
    .locals 2

    new-instance v0, LN/q;

    iget-object v1, p0, LN/q;->c:LH/c;

    invoke-direct {v0, v1}, LN/q;-><init>(LH/c;)V

    return-object v0
.end method
