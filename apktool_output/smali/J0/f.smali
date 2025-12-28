.class public final LJ0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:LJ0/f;


# instance fields
.field public volatile a:Ljava/lang/Thread;

.field public volatile b:LJ0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ0/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LJ0/f;->c:LJ0/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LJ0/g;->f:La/a;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, La/a;->Z(LJ0/f;Ljava/lang/Thread;)V

    return-void
.end method
