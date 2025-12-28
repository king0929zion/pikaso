.class public abstract Lz0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LB2/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LB2/i;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, LB2/i;-><init>(I)V

    sput-object v0, Lz0/g;->a:LB2/i;

    new-instance v0, Ls1/c;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Ls1/c;-><init>(I)V

    return-void
.end method
