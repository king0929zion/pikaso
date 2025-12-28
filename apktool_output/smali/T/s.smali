.class public abstract Lt/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lt/t;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lt/t;

    sget-object v1, Lt/c;->a:Ls1/c;

    sget-object v2, LP/a;->m:LP/c;

    invoke-direct {v0, v1, v2}, Lt/t;-><init>(Lt/b;LP/c;)V

    sput-object v0, Lt/s;->a:Lt/t;

    return-void
.end method
