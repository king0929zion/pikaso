.class public final Lo0/M0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo0/L0;


# static fields
.field public static final b:LD/f0;


# instance fields
.field public final a:LD/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh0/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh0/n;-><init>(I)V

    invoke-static {v0}, LD/d;->A(Ljava/lang/Object;)LD/f0;

    move-result-object v0

    sput-object v0, Lo0/M0;->b:LD/f0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, LD/d;->A(Ljava/lang/Object;)LD/f0;

    move-result-object v0

    iput-object v0, p0, Lo0/M0;->a:LD/f0;

    return-void
.end method
