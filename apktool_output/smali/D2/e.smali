.class public abstract LD2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    :try_start_0
    new-instance v1, Lz2/b;

    invoke-direct {v1}, Lz2/b;-><init>()V

    new-array v2, v0, [Ly2/t;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lw2/d;

    invoke-direct {v2, v0, v1}, Lw2/d;-><init>(ILjava/lang/Object;)V

    new-instance v0, Lw2/a;

    invoke-direct {v0, v2}, Lw2/a;-><init>(Lw2/d;)V

    invoke-static {v0}, Lw2/h;->a0(Lw2/f;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LD2/e;->a:Ljava/util/List;

    return-void

    :catchall_0
    move-exception v0

    new-instance v1, Ljava/util/ServiceConfigurationError;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/util/ServiceConfigurationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
