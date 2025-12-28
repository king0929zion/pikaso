.class public final LB2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/C;


# instance fields
.field public final d:LB2/v;

.field public final e:J

.field public final f:Ljava/lang/Object;

.field public final g:Ly2/f;


# direct methods
.method public constructor <init>(LB2/v;JLjava/lang/Object;Ly2/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB2/t;->d:LB2/v;

    iput-wide p2, p0, LB2/t;->e:J

    iput-object p4, p0, LB2/t;->f:Ljava/lang/Object;

    iput-object p5, p0, LB2/t;->g:Ly2/f;

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 6

    iget-object v0, p0, LB2/t;->d:LB2/v;

    monitor-enter v0

    :try_start_0
    iget-wide v1, p0, LB2/t;->e:J

    invoke-virtual {v0}, LB2/v;->n()J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v1, v1, v3

    if-gez v1, :cond_0

    monitor-exit v0

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v1, v0, LB2/v;->k:[Ljava/lang/Object;

    invoke-static {v1}, Lp2/g;->b(Ljava/lang/Object;)V

    iget-wide v2, p0, LB2/t;->e:J

    long-to-int v4, v2

    array-length v5, v1

    add-int/lit8 v5, v5, -0x1

    and-int/2addr v4, v5

    aget-object v4, v1, v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eq v4, p0, :cond_1

    monitor-exit v0

    goto :goto_0

    :cond_1
    :try_start_2
    sget-object v4, LB2/w;->a:LD2/w;

    invoke-static {v1, v2, v3, v4}, LB2/w;->a([Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v0}, LB2/v;->h()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    :goto_0
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
