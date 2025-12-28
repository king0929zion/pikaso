.class public abstract LF2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:J

.field public static final c:I

.field public static final d:I

.field public static final e:J

.field public static final f:LF2/f;

.field public static final g:LF2/i;

.field public static final h:LF2/i;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const-string v0, "kotlinx.coroutines.scheduler.default.name"

    sget v1, LD2/x;->a:I

    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    const-string v0, "DefaultDispatcher"

    :cond_0
    sput-object v0, LF2/k;->a:Ljava/lang/String;

    const-wide v6, 0x7fffffffffffffffL

    const-wide/16 v4, 0x1

    const-string v1, "kotlinx.coroutines.scheduler.resolution.ns"

    const-wide/32 v2, 0x186a0

    invoke-static/range {v1 .. v7}, LD2/a;->j(Ljava/lang/String;JJJ)J

    move-result-wide v0

    sput-wide v0, LF2/k;->b:J

    sget v0, LD2/x;->a:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    move v0, v1

    :cond_1
    const/16 v1, 0x8

    const-string v2, "kotlinx.coroutines.scheduler.core.pool.size"

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v2, v0, v3, v4, v1}, LD2/a;->k(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, LF2/k;->c:I

    const/4 v0, 0x4

    const-string v1, "kotlinx.coroutines.scheduler.max.pool.size"

    const v2, 0x1ffffe

    invoke-static {v1, v2, v4, v2, v0}, LD2/a;->k(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, LF2/k;->d:I

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide v10, 0x7fffffffffffffffL

    const-wide/16 v8, 0x1

    const-string v5, "kotlinx.coroutines.scheduler.keep.alive.sec"

    const-wide/16 v6, 0x3c

    invoke-static/range {v5 .. v11}, LD2/a;->j(Ljava/lang/String;JJJ)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, LF2/k;->e:J

    sget-object v0, LF2/f;->a:LF2/f;

    sput-object v0, LF2/k;->f:LF2/f;

    new-instance v0, LF2/i;

    invoke-direct {v0, v4}, LF2/i;-><init>(I)V

    sput-object v0, LF2/k;->g:LF2/i;

    new-instance v0, LF2/i;

    invoke-direct {v0, v3}, LF2/i;-><init>(I)V

    sput-object v0, LF2/k;->h:LF2/i;

    return-void
.end method
