.class public final LF2/l;
.super Ly2/r;
.source "SourceFile"


# static fields
.field public static final f:LF2/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF2/l;

    invoke-direct {v0}, Ly2/r;-><init>()V

    sput-object v0, LF2/l;->f:LF2/l;

    return-void
.end method


# virtual methods
.method public final d(Lg2/i;Ljava/lang/Runnable;)V
    .locals 2

    sget-object p1, LF2/d;->g:LF2/d;

    sget-object v0, LF2/k;->h:LF2/i;

    iget-object p1, p1, LF2/g;->f:LF2/b;

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1}, LF2/b;->b(Ljava/lang/Runnable;LF2/i;Z)V

    return-void
.end method
